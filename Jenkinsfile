pipeline {
    agent any
    stages {
       stage ('Git') {
           steps {
                git 'https://github.com/AHizaoui/ImproveSoftwareSeleniumJava.git'
           }
       }
       

        stage ('Build') {
            steps {
                bat 'mvn test'
                
            }
           
        }

   
    stage('Scan') {
      steps {
        withSonarQubeEnv(installationName: 'sonarqube') { 
          bat './gradlew sonarqube'
        }
      }
    }
  stage("Quality Gate") {
      steps {
        timeout(time: 5, unit: 'MINUTES') {
          waitForQualityGate abortPipeline: true
        }
      }
    }
         
}

}
