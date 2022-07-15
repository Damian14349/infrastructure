pipelineJob('job-dsl-frontend') {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url('https://github.com/Damian14349/Frontend.git')
          }
          branch('main')
        }
      }
      lightweight()
    }
  }
}