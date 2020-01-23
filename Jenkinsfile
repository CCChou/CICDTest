pipeline {
    agent any
    stages {
		stage('Unit Test') {
			steps {
				sh './gradlew clean test'
			}
		}
        stage('Build') {
            steps {
                sh './gradlew build -x test'
            }
        }
	    stage('Build Image') {
            steps {
                sh 'docker build -t test .'
            }
        }
        stage('Push Image') {
            steps {
			    sh 'docker push 10.0.0.4:8081/test:latest'
            }
        }
    }
}