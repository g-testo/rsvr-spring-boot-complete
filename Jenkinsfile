pipeline {
    agent none 
    stages {
        stage('Setup Environment') {
            steps {
                sh 'source /etc/profile'
            }
        }
        stage('Example Build') {
            agent none
            steps {
                echo 'Hello, Maven'
                sh 'mvn --version'
            }
        }
        stage('Example Test') {
            agent none
            steps {
                echo 'Hello, JDK'
                sh 'java -version'
            }
        }
    }
}
