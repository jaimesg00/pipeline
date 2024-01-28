pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/jaimesg00/pipeline.git', branch: 'main'
            }
        }

        // Otras etapas del pipeline...
    }

    post {
        success {
            echo '¡Pipeline ejecutado exitosamente!'
        }
        failure {
            echo '¡El pipeline ha fallado!'
        }
    }
}
