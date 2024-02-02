pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Checkout the source code from version control
                checkout scm
            }
        }

        stage('Build') {
            steps {
                // Build the Spring Boot application using Maven
                sh 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                // Run unit tests using Maven
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                // Package the Spring Boot application (e.g., create a JAR file)
                sh 'mvn package'
            }
        }

        stage('Deploy') {
            steps {
                // Add deployment steps if needed
            }
        }
    }

    post {
        success {
            // Add post-build actions, notifications, etc.
        }
        failure {
            // Handle failure scenarios
        }
    }
}
