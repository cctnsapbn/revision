pipeline {
      agent any
      stages {
            stage('Init') {
                  steps {
                        echo 'Hi, this is CCTNSAPBN FROM INITIAL STAGE'
                        echo 'We are Starting the Testing'
                  }
            }
            stage('Build') {
                  steps {
                        echo 'Building Sample Maven Project. FROM BUILD BLOCK'
                  }
            }
            stage('Deploy') {
                  steps {
                        echo "Deploying in Staging Area.FROM DEPLOY STAGE"
                  }
            }
            stage('Deploy Production') {
                  steps {
                        echo "Deploying in Production Area. FROM PRODUCTION"
                  }
            }
      }
}
