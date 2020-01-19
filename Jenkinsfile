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
    }
}