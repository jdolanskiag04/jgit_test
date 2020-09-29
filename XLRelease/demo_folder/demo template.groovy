// Exported from:        http://Jans-MBP:5516/#/templates/Folder93a17e3a0e4841c284f6d99fd16e4b90-Releasefd1f4141084542609e088cb016152b2e/releasefile
// Release version:      9.7.0-SNAPSHOT
// Date created:         Tue Sep 29 11:17:33 CEST 2020

xlr {
  template('demo template') {
    folder('demo_folder')
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2020-09-29T09:00:00+0200')
    phases {
      phase('New Phase') {
        tasks {
          manual('a') {
            attachments {
              attachment("sql:Attachment3d4cc37ffc8b4c8c97341944ac184acb") {
                filename "attachments/Attachment3d4cc37ffc8b4c8c97341944ac184acb-mapping-webhook-event-values-to-template-variables.png"
              }
            }
          }
          manual('b') {
            
          }
          manual('c') {
            
          }
        }
      }
    }
    
  }
}