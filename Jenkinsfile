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

    
         
}

}
