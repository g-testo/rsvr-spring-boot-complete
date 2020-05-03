pipeline {
    agent {
        docker {
            image 'maven:3-alpine'
            args '-v /root/.m2:/root/.m2'
        }
    }
    options {
        skipStagesAfterUnstable()
    }
    stages {
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
                sh './mvnw package && java -jar target/rsvr-in-class-0.0.1.jar' 
            }
        }
        stage('Containerize') { 
            steps {
                sh 'docker build -t springio/gs-spring-boot-docker ../deliverables' 
            }
        }
    }
}