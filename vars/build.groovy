def call() {
    stage('Build Setup') {
        echo '🔧 Configurando ambiente de build'
        checkout([
            $class: 'GitSCM',
            branches: [[name: 'main']],
            userRemoteConfigs: [[url: 'https://github.com/MIRTAHAALI/express_server_for_flutter_app_testing.git']]
        ])
    }
    
    stage('Install Dependencies') {
        echo '📦 Instalando dependências'
        if (isUnix()) {
            sh 'npm install'
        } else {
            bat 'npm install'
        }
    }
}
