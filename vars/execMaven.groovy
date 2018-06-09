def call(String options = '-v') {
    sh "mvn ${options}"
}