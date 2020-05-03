pipeline {
    agent {
        docker {
          image 'maven:3-alpine'
        }
    }
    stages {
        stage('Print') {
            steps {
                sh 'echo $path'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
        stage('Build Jar') { 
            steps {
                sh 'mvn package' 
            }
        }
        stage('Containerize') { 
            agent { label 'master' }
            steps {
                sh 'docker build -t rsvrproject ../deliverables' 
            }
        }
    }
}