pipeline {
    agent {
        docker {
          image 'maven:3-alpine'
        }
    }
    stages {
        stage('Junit Tests') {
            agent { label 'master' }
            steps {
                sh 'echo $HOME'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
        stage('Selenium Tests') {
            steps {
                sh 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
    }
}