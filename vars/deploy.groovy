def call() {
    stage('Deploy with PM2') {
        echo '🚀 Iniciando deploy com PM2'
        if (isUnix()) {
            sh 'pm2 startOrRestart pm2.config.json'
        } else {
            bat 'pm2 startOrRestart pm2.config.json'
        }
    }
}
