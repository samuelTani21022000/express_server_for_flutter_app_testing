def call() {
    stage('Install PM2') {
        echo '⚙️ Instalando PM2 globalmente'
        if (isUnix()) {
            sh 'npm install pm2 -g'
        } else {
            bat 'npm install pm2 -g'
        }
    }
}
