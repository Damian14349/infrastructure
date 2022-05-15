pipelineJob('frontend') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        credentials("")
                        url("https://github.com/PandaAcademy/Frontend.git")
                    }
                    branches('master')
                    scriptPath('Jenkinsfile')
                }
            }
        }
    }
}
