pipeline {

    agent { docker { image 'maven:3.3.3' } }

    stages {
        stage('Checkout') {
            steps { //Checking out the repo
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[credentialsId: '996990e9-64f3-4954-ad77-e08ff1b20f4d', url: 'https://github.com/VictorW96/JavaEEService']]])
            }
        }
    }
}
