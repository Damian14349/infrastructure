pipelineJob('job-dsl-app_of_apps') {
    parameters {
            stringParam('backendDockerTag')
            stringParam('frontendDockerTag')
        }
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url('https://github.com/Damian14349/App_of_apps.git')
          }
          branch('*/master')
        }
      }
      lightweight()
    }
  }
}