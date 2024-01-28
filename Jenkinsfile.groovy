pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                script {
                    checkout scm
                }
            }
        }

        stage('Decir Hola') {
            steps {
                script {
                    echo 'Hola Mundo'
                }
            }
        }
    }
}