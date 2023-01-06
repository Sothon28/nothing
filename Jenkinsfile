pipeline{
    agent none
    stages{
        stage("Build Jar"){
	        agent {
		    	docker{
			        image "openjdk:17-alpine"
			        image "maven: 3.8.6"
		    	}
		    } 
            steps{
                echo "========executing Build Jar========"
                sh "mvn -version"
                sh "mvn clean install"
            }
        }
        stage("Build Image"){
        	agent any
            steps{
                echo "========executing Build Image========"
                sh "docker build -t sothonmcnc/nothing ."
            }
        }
        stage("Push image"){
            agent any
            steps{
                echo "========executing Run container========"
                sh "docker push sothonmcnc/nothing"
            }
        }
    }
}