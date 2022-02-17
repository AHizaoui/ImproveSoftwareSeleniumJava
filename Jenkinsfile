pipeline {
    agent any
    stages {
       stage ('Git') {
           steps {
                git 'https://github.com/AHizaoui/ImproveSoftwareSeleniumJava.git'
           }
       }
       stage ('Install') {
           steps {
               sh 'mvn install'
           }
       }

        stage ('Build') {
            steps {
                sh 'mvn test'
                
            }
           
        }

    
         
}

}
