@Library('my-nodejs-lib@main') _

pipeline {
    agent any
    tools {
        nodejs 'nodejs'
    }
    
    stages {
        stage('Build') {
            steps {
                script {
                    buildSteps()
                }
            }
        }
        
        stage('Test Setup') {
            steps {
                script {
                    testSteps()
                }
            }
        }
        
        stage('Deploy') {
            steps {
                script {
                    deploySteps()
                }
            }
        }
    }
    
    post {
        always {
            echo '✅ Pipeline concluído'
            cleanWs()
        }
        failure {
            echo '❌ Pipeline falhou'
            // Adicione notificações aqui (Slack, Email, etc.)
        }
    }
}
