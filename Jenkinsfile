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
                echo 'Run ................................................'
                sh '''
                java -jar ./build/libs/spring-jenkins-pipeline-test.jar
                '''
            }
        }
    }
}