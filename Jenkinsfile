
node{
  tools {
            maven 'maven'
          }
stage('Get from git project')
  {
    git 'https://github.com/MezghichGit/mavenJunitProject'
  }
  
  stage('Compile then package')
  {
    sh 'mvn package'
  }
}
