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
                sh 'echo pwd'
            }
        }
    }
}