// Exported from:        http://Jans-MBP:5516/#/templates/Folder93a17e3a0e4841c284f6d99fd16e4b90-Release991478d227a345a1b2446f8369b79504/releasefile
// Release version:      9.7.0-SNAPSHOT
// Date created:         Tue Sep 29 16:19:13 CEST 2020

xlr {
  template('demo template 2') {
    folder('demo_folder')
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2020-09-29T09:00:00+0200')
    phases {
      phase('New Phase') {
        tasks {
          manual('a') {
            
          }
          manual('b') {
            
          }
          manual('c') {
            
          }
          gate('gate task') {
            attachments {
              attachment("sql:Attachment4ec23d79d9854035bd91099d2fe3b08d") {
                filename "attachments/Attachment4ec23d79d9854035bd91099d2fe3b08d-Screenshot 2020-09-25 at 11.24.56.png"
              }
            }
          }
        }
      }
    }
    
  }
}