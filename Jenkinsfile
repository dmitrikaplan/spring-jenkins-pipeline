pipeline{
    agent any
    stages{
        stage("build"){
            steps{
                sh 'gradle build'
            }
        }
        stage("run"){
            steps{
                sh '''
                java -jar ./build/libs/spring-jenkins-pipeline-test.jar
                '''
            }
        }
    }
}