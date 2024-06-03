pipeline{
    agent any
    stages{
        stage("build"){
            steps{
                ./gradlew build
            }
        }
        stage("run"){
            steps{
                java -jar /build/libs/spring-jenkins-pipeline-test.jar
            }
        }
    }
}