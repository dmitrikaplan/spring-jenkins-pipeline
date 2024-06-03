pipeline{
    agent any
    stages{
        stage("build"){
            steps{
                echo 'BUILD ................................'
                sh 'gradle build'
                echo 'BUILD END .................................'
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