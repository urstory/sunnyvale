def useTest = true
def useBuild = true
def useDeploy = true
def useSwitch = true
def useNode = true
def useSlack = true

pipeline {
    agent { docker 'maven:3.3.3' }
    stages{
        stage('example1'){
            steps {
                echo "hello 1"
                sh 'mvn --version'
            }
        }
    }
}