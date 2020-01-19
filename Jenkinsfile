pipeline {
    agent any
    stages {
		stage('Unit Test') {
			step {
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