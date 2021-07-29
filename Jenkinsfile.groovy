pipeline {

    agent { docker { image 'azul/zulu-openjdk:8u181' } }

    stages {
        stage('Checkout') {
            steps { //Checking out the repo
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[credentialsId: '996990e9-64f3-4954-ad77-e08ff1b20f4d', url: 'https://github.com/VictorW96/JavaEEService']]])
            }
        }
        stage('Build') {
            steps { //Checking out the repo
                sh 'chmod +x gradlew'
                sh './gradlew build'
            }
        }
    }
}
