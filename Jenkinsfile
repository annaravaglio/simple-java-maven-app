pipeline {
    agent {
        docker {
            image 'my_local_maven' 
            args '-v /root/.m2:/root/.m2' 
        }
    }
    stages {
        stage('Build') { 
            steps {
                chmod 'mvn -B -DskipTests clean package' 
            }
        }
    }
}