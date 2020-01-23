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
			    sh 'docker login -u dennischou -p 1qaz@WSX 10.0.0.4:8082'
			    sh 'docker tag test 10.0.0.4:8082/test:latest'
			    sh 'docker push 10.0.0.4:8082/test:latest'
				sh 'docker logout 10.0.0.4:8082'
            }
        }
    }
}