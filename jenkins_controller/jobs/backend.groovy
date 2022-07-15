pipelineJob('job-dsl-backend') {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url('https://github.com/Damian14349/Backend.git')
          }
          branch('main')
        }
      }
      lightweight()
    }
  }
}