pipeline {
    agent any
    stages {
		stage('Unit Test') {
			sh './gradlew clean test'
		}
        stage('Build') {
            steps {
                sh './gradlew build -x test'
            }
        }
    }
}