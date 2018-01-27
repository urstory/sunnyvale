def useTest = true
def useBuild = true
def useDeploy = true
def useSwitch = true
def useNode = true
def useSlack = true

node('', {
    stage('example1', {
        echo "hello 1"
    })

    stage("Parameter Check", {
        println " BUILD_USER = " + BUILD_USER
        println " CONFIG_NAME = $CONFIG_NAME"
        println "  REMOTE_PATH = $REMOTE_PATH"
        println "  TARGET_USER = $TARGET_USER"
        println "  TARGET_SERVER = $TARGET_SERVER"
        println "  GIT_URL = $GIT_URL"
        println "  BRANCH_SELECTOR = $BRANCH_SELECTOR"
        println "  GRADLE_VERSION = $GRADLE_VERSION"
        println "  JAVA_VERSION = $JAVA_VERSION"

        env.JAVA_HOME="${tool name : JAVA_VERSION}"
        env.PATH="${env.JAVA_HOME}/bin:${env.PATH}"

        try {
            println "  SLACK_TOKEN = $SLACK_TOKEN"
        }
        catch (MissingPropertyException e) {
            useSlack = false
        }
        try {
            println "  NODE_VERSION = $NODE_VERSION"
        }
        catch (MissingPropertyException e) {
            useNode = false
        }
    })

    stage("Git CheckOut", {
        if (useTest || useBuild) {
            println "Git CheckOut Started"
            checkout(
                    [
                            $class                           : 'GitSCM',
                            branches                         : [[name: '${BRANCH_SELECTOR}']],
                            doGenerateSubmoduleConfigurations: false,
                            extensions                       : [],
                            submoduleCfg                     : [],
                            userRemoteConfigs                : [[url: '${GIT_URL']]
                    ]
            )
            println "Git CheckOut End"
        } else {
            println "Git CheckOut Skip"
        }
    })
})

stage('example2', {
    node('', {
        echo "hello 2"
    })
})