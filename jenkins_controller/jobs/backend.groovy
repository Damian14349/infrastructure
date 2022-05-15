pipelineJob('backend') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        credentials("")
                        url("https://github.com/PandaAcademy/Backend.git")
                    }
                    branches('master')
                    scriptPath('Jenkinsfile')
                }
            }
        }
    }
}
