pipeline {
    agent any
    stages {		
        stage('Build') {
            steps {
                sh './gradlew clean build -x test'
            }
        }
        stage('Unit Test') {
            steps {
                sh './gradlew test'
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
		stage('Deploy') {
			steps {
                sh 'ansible-playbook -i ansible/hosts.ini ansible/deploy.yml'
			}
		}
    }
}