// Exported from:        http://Jans-MBP:5516/#/templates/Foldera827e0c42b334156929c8b5737e83a80-Release79f2070bfa864cb7befee03ff3225a12/releasefile
// Release version:      9.7.0-SNAPSHOT
// Date created:         Tue Sep 29 11:16:05 CEST 2020

xlr {
  template('demo template') {
    folder('folder 1')
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2020-09-16T09:00:00+0200')
    phases {
      phase('New Phase') {
        tasks {
          manual('a') {
            
          }
          manual('b') {
            description 'abcbacb'
            attachments {
              attachment("sql:Attachment4347099ad22042bf97f95f9efe9ec2e4") {
                filename "attachments/Attachment4347099ad22042bf97f95f9efe9ec2e4-Screenshot 2020-09-16 at 13.05.07.png"
              }
            }
          }
        }
      }
    }
    
  }
}