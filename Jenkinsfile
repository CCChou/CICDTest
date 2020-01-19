pipeline {
    agent any
    stages {
		stage('Unit Test') {
			steps {
				sh 'sudo ./gradlew clean test'
			}
		}
        stage('Build') {
            steps {
                sh 'sudo ./gradlew build -x test'
            }
        }
    }
}