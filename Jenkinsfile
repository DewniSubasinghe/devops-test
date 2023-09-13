pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Check out the source code from your version control system (e.g., Git)
                checkout scm
            }
        }

        stage('Build') {
            steps {
                // Use the 'bat' step to run Maven build commands on Windows
                bat 'mvn clean install'
            }
        }

        stage('Docker Build') {
            steps {
                // Build a Docker image from your project (assumes Docker is installed)
                bat 'docker build -t test-2023-9-12 .'
                echo 'pass'
            }
        }

        stage('Minikube Deployment') {
            steps {
                // Deploy the Docker image to Minikube (assumes Minikube is running)
                echo 'next'
                bat 'kubectl config use-context minikube'
                bat 'kubectl apply -f deployment.yaml'
                echo 'next2'
            }
        }
    }

    post {
        success {
            // This block executes if the pipeline is successful
            echo 'Pipeline succeeded! Deployment to Minikube completed.'
        }
        failure {
            // This block executes if the pipeline fails
            echo 'Pipeline failed. Deployment to Minikube may not have occurred.'
        }
    }
}
