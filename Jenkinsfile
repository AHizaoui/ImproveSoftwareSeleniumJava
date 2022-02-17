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
          bat './mvnw clean org.sonarsource.scanner.maven:sonar-maven-plugin:3.9.0.2155:sonar'
        }
      }
    }
 
         
}

}
