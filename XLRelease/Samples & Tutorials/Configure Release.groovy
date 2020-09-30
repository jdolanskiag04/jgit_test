// Exported from:        http://Jans-MacBook-Pro.local:5516/#/templates/FolderSamplesAndTutorials-ReleaseTemplate_configure/releasefile
// Release version:      9.7.0-SNAPSHOT
// Date created:         Wed Sep 30 17:42:48 CEST 2020

xlr {
  template('Configure Release') {
    folder('Samples & Tutorials')
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2020-09-30T09:00:00+0200')
    tags 'tutorial'
    phases {
      phase('Setup mail server') {
        color '#009CDB'
        tasks {
          manual('Configure email address and mail server') {
            description 'In order to use Digital.ai Release effectively, a mail server has to be configured. \n' +
                        '\n' +
                        'This task consists of two steps:\n' +
                        '\n' +
                        '1. To check if mails are sent correctly, configure the email address of the `admin` user. Go to the [Profile](#/profile) and enter the email address. Then press the **Save** button.\n' +
                        '2. Configure the SMTP server. Go to the [SMTP Server](#/smtp) screen and enter the relevant settings. Press **Save** to confirm. \n' +
                        '\n' +
                        'Now complete this task by pressing the **Complete** button and confirming. An email will be sent and we will confirm its delivery in the next task.'
            owner 'admin'
            waitForScheduledStartDate false
          }
          gate('Check email') {
            description 'After correctly configuring the SMTP server and email address for \'admin\', the admin user should have received an email that announces the start of this task, \'Check email\'.\n' +
                        '\n' +
                        'If this is the case, check the box below and Complete this task.\n' +
                        '\n' +
                        'If not, here are some ways to troubleshoot.\n' +
                        '* Check the logs in `[XL_RELEASE_SERVER]/log/xl-release.log` for errors\n' +
                        '* Reconfigure the SMTP server settings in XL Release\n' +
                        '* Fail this task and Retry it. Both actions should trigger an email.'
            owner 'admin'
            waitForScheduledStartDate false
            conditions {
              condition('Got email that \'Check email\' task was started')
            }
          }
        }
      }
      phase('Setup Users & Security') {
        color '#009CDB'
        tasks {
          manual('Configure users') {
            description 'Digital.ai Release is a collaboration tool, so we need to get some users into the system. There are two ways to set up the users. This task explains how to configure users directly in Release.\n' +
                        '\n' +
                        'It is also possible to integrate with Active Directory or another type of LDAP server. See the [Administration Manual](https://docs.xebialabs.com/xl-release/how-to/configure-ldap-security-for-xl-release.html) for more details on this subject. \n' +
                        '\n' +
                        '### Creating users\n' +
                        '\n' +
                        'Go to the [Users](#/users) screen and add a user. You can specify the email address right away.\n' +
                        '\n' +
                        'After pressing Save, the newly created user can log in.'
            owner 'admin'
            waitForScheduledStartDate false
          }
          manual('Define roles & global permissions') {
            description '### Roles\n' +
                        '\n' +
                        'Users can be grouped in **Roles** to assign them fine-grained permissions.\n' +
                        '\n' +
                        'Go to the [Roles](#/roles) screen to create roles and assign users to them. If you are connected to Active Directory or LDAP, you can also add LDAP groups to roles.\n' +
                        '\n' +
                        'Define a role **Release Managers**, and add all users that will be using Release as a release manager.\n' +
                        '\n' +
                        'Please use the name "Release Managers", so the standard templates will be available to them.\n' +
                        '\n' +
                        'After defining the role, press **Save**\n' +
                        '\n' +
                        '### Global permissions\n' +
                        '\n' +
                        'Go the [Permissions](#/permissions) screen to assign global permissions to the roles. \n' +
                        '\n' +
                        'To the Release Managers role, assign the permissions **Create Template** and **Create Release** (at least).\n' +
                        '\n' +
                        'Press Save to apply the changes.\n' +
                        '\n' +
                        '### Release permissions\n' +
                        '\n' +
                        'On the release level, permissions are defined on **teams**. Teams are like roles, but specific to a particular release. Teams and team permissions can be configured on a release or on a release template.\n' +
                        '\n' +
                        'Teams may contain both users and roles.'
            owner 'admin'
            waitForScheduledStartDate false
          }
        }
      }
      phase('Deploy integration') {
        color '#68b749'
        tasks {
          manual('Define Digital.ai Deploy Servers') {
            description '_Skip this task if no Deploy integration is needed_\n' +
                        '\n' +
                        'To enable Deploy integration, go to the [XL Deploy Servers](#/configuration) screen and add a new Server.\n' +
                        '\n' +
                        'Enter the URL of the Deploy server and provide credentials of a Deploy user with at least read permissions (in Deploy).\n' +
                        '\n' +
                        'When done, press the **Test** button to validate the connection.\n' +
                        '\n' +
                        'If the connection is valid, press **Save** so this Deploy server can be used in Release.'
            owner 'admin'
            waitForScheduledStartDate false
          }
        }
      }
    }
    
  }
}