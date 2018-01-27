node('', {
    stage('example1', {
        echo "hello 1"
    })
})

stage('example2', {
    node('', {
        echo "hello 2"
    })
})