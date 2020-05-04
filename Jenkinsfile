pipeline {
    agent none
    stages {
        stage('Junit Tests') {
            agent { label 'master' }
            steps {
                sh 'echo $PWD'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
        stage('Selenium Tests') {
            agent {
                docker {
                image 'maven:3-alpine'
                }
            }
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
            agent {
                docker {
                image 'maven:3-alpine'
                }
            }
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
    }
}