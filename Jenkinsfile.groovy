def useTest = true
def useBuild = true
def useDeploy = true
def useSwitch = true
def useNode = true
def useSlack = true

pipeline {
    stages{
        stage('example1'){
            steps {
                echo "hello 1"
            }
        }
    }
}