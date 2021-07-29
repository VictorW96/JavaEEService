pipeline {

    agent {
        label 'gradle:latest'
        //The id of the slave/agent where the build should be executed, if it doesn't matter use "agent any" instead.
    }

    stages {
        stage('Checkout') {
            steps { //Checking out the repo
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[credentialsId: '996990e9-64f3-4954-ad77-e08ff1b20f4d', url: 'https://github.com/VictorW96/JavaEE8service']]])
            }
        }
    }
}
