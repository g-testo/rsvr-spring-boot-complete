pipeline {
    agent none
    stages {
        stage('Setup Environment') {
            steps {
                sh 'source /etc/profile'
            }
        }
        stage('Build') {
            agent { docker 'maven:3-alpine' }
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Test') {
            agent { docker 'maven:3-alpine' }
            steps {
                sh 'mvn test'
            }
            post {
                agent { docker 'maven:3-alpine' }
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
        stage('Build Jar') { 
            agent { docker 'maven:3-alpine' }
            steps {
                sh 'mvn package' 
            }
        }
        stage('Containerize') { 
            agent { docker 'maven:3-alpine' }
            steps {
                sh 'docker build -t rsvrproject ../deliverables' 
            }
        }
    }
}