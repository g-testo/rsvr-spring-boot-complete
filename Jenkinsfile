pipeline {
    agent none
    stages {
        stage('Junit Tests') {
            agent { label 'master' }
            steps {
                sh 'echo $PWD'
            }
        }
    }
}