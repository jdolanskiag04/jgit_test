// Exported from:        http://Jans-MacBook-Pro.local:5516/#/templates/FolderSamplesAndTutorials-ReleaseTemplate_tour/releasefile
// Release version:      9.7.0-SNAPSHOT
// Date created:         Wed Sep 30 17:49:11 CEST 2020

xlr {
  template('Guided Tour for Release Managers') {
    folder('Samples & Tutorials')
    variables {
      stringVariable('user') {
        
      }
    }
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2020-09-30T09:00:00+0200')
    tags 'tutorial'
    phases {
      phase('Designing a release') {
        color '#009CDB'
        tasks {
          gate('Click "Start Release" to get going') {
            description 'To get started, click **Start Release** in the Release Flow editor. When a release is created, it is not automatically started to give the Release Admin the opportunity to configure it.\n' +
                        '\n' +
                        'After confirmation, an orange triangle will appear on this task to indicate that it is active.\n' +
                        '\n' +
                        'Complete this task to advance to the next one. Note that you cannot complete a task before the release starts.'
            owner '${user}'
            waitForScheduledStartDate false
          }
          manual('Phases & task execution') {
            description 'You should now be in the Release Flow editor, the screen showing all tasks in a release.\n' +
                        '\n' +
                        'You can go to the Release Flow editor by clicking the **View in Release** link of a task in the task overview, or by clicking a release name in the **Releases > Overview** screen.\n' +
                        '\n' +
                        'The Release Flow editor is where the release procedure is defined. You will see all tasks here, grouped into columns called _phases_. These represent the high-level parts of a release.\n' +
                        '\n' +
                        'The tasks in a phase are executed from top to bottom. When all tasks in a phase are completed, the phase completes and we advance to the next phase. The phases are executed from left to right.'
            owner '${user}'
            waitForScheduledStartDate false
          }
          manual('Using the Release Flow editor to design a release') {
            description 'The Release Flow editor is the nerve center of your release. \n' +
                        '\n' +
                        'Here, you can add tasks, remove tasks, and drag-and-drop tasks.\n' +
                        '\n' +
                        'You can model your release procedure as a general blueprint for how releases are done from the [Templates](#/templates) screen. You create actual releases from a template. When a release is in progress, you can still edit it, provided you have the right permissions.\n' +
                        '\n' +
                        'If reality gets in the way of the process, you can still add tasks and phases, and change or remove them. XL Release keeps track of all changes in the release in the Activity Log. This is an audit trail that serves as a single source of truth for who did what, and when.'
            owner '${user}'
            waitForScheduledStartDate false
          }
          manual('Task types') {
            description 'To add a task to a phase in a release, click the **Add Task** link at the bottom of the phase. After you add a task, you can drag-and-drop it into the desired position.\n' +
                        '\n' +
                        '### Manual tasks\n' +
                        'Manual tasks must be performed by a person. After you are done with the task, you complete it by clicking **Complete**.\n' +
                        '* **Manual task** - A task with a description of what should be done.\n' +
                        '* **Gate task** - A checkpoint in a release flow. Gate tasks can contain checklists of sub-tasks to be done. Gate tasks are marked by a red border. \n' +
                        '\n' +
                        '### Automated tasks\n' +
                        'Automated tasks are executed and completed by XL Release. No human intervention is required.\n' +
                        '* **Notification** - Send a custom email from XL Release.\n' +
                        '* **XL Deploy** - Perform a deployment using XebiaLabs XL Deploy.\n' +
                        '* ** Script** - Run a custom script written in Python.\n' +
                        '* **Jira tasks** - Create and update tickets in Atlassian Jira.\n' +
                        '* **Webhook** - Call a web service using XML or JSON without writing a script.\n' +
                        '\n' +
                        '### Execution\n' +
                        '* **Parallel Group** - Execute XL Release tasks in parallel.\n' +
                        '\n' +
                        '### Exercise\n' +
                        'Add a notification task and configure it to send an email to yourself. Use drag-and-drop to place it somewhere in the release.'
            owner '${user}'
            waitForScheduledStartDate false
          }
          manual('Teams') {
            description 'Teams are used to group people per release.\n' +
                        '\n' +
                        'You can use teams to:\n' +
                        '* **Assign tasks to a team**. This is especially useful when designing a template.\n' +
                        '* **Configure permissions**. With XL Release, you can apply fine-grained security to teams up to the individual release level.\n' +
                        '\n' +
                        '### Configuring teams\n' +
                        'Select **Teams** from the **Show** menu at the top of the Release Flow editor to configure teams.\n' +
                        '\n' +
                        'Here, you can add and remove teams for a certain release. Teams can contain people (identified by their log-in name) or roles (see **Settings > Roles**).\n' +
                        '\n' +
                        '### Standard teams\n' +
                        '\n' +
                        'There are two standard teams:\n' +
                        '\n' +
                        '* **Template Owner** _(only in templates)_ - Used to configure security on templates.\n' +
                        '* **Release Admin** - Contains the people who are responsible for the running release. They get extra notifications; for example, when a task fails and the release is stalled.\n' +
                        '\n' +
                        '### Security\n' +
                        '\n' +
                        'To configure security on teams, select **Permissions** from the **Show** menu at the top of the Release Flow editor.\n' +
                        '\n' +
                        '### Exercise\n' +
                        'Create a team called \'Release managers\' and add yourself to it. Assign the next task to this team, and remove the assignment to yourself. Then complete this task.'
            owner '${user}'
            waitForScheduledStartDate false
          }
        }
      }
      phase('Running a release') {
        color '#68b749'
        tasks {
          manual('Releases & Templates') {
            description '**Releases** are at the heart of XL Release. A release represents a number of tasks with people working on it. XL Release allows you to plan, track, and execute releases automatically and acts as a single source of truth for everyone involved to make the release a success.\n' +
                        '\n' +
                        'A **template** is a blueprint for a release. It can be used to start various releases that have the same flow. It is very similar to a release, but some functionality is different because a template will never be executed directly. For example, there are no start or end dates on a template; most tasks will be assigned to teams rather than actual people; and variables will be used as placeholders for information that differs from release to release, like the version number of an application.\n' +
                        '\n' +
                        'You can see releases that are currently running on the [Release Overview](#/releases) screen.\n' +
                        'You can find the list of available templates on the [Template Overview](#/templates) screen.\n' +
                        '\n' +
                        'New releases are started from a template. Simply click **New Release** and fill in the name, start and end date, and other relevant properties to create a new release.'
            owner '${user}'
            waitForScheduledStartDate false
          }
          manual('Release Dashboard') {
            description 'The **Release Dashboard** is a dashboard of a running release. It shows vital statistics about progress, task assignment, and warnings.\n' +
                        '\n' +
                        'Go to the Release Dashboard by selecting **Release Dashboard** from the **Show** menu at the top of the Release Flow editor.\n' +
                        '\n' +
                        'Take a look at the Release Dashboard of this release now, then complete this task.'
            owner '${user}'
            waitForScheduledStartDate false
          }
          manual('Activity Log') {
            description 'For a detailed audit trail of who did what and when on a release, select **Activity Logs** from the **Show** menu at the top of the Release Flow editor.\n' +
                        '\n' +
                        'Take a at the Activity Logs of this release now, then complete this task.'
            owner '${user}'
            waitForScheduledStartDate false
          }
        }
      }
      phase('Advanced topics') {
        color '#ff9e3b'
        tasks {
          manual('Parallel tasks') {
            description 'When designing a release in the Release Flow editor, you will have noticed that the default flow in a phase is serial: all tasks are executed in order, one after the other.\n' +
                        '\n' +
                        'The **Parallel group** allows you to model tasks that have to be executed in parallel. \n' +
                        '\n' +
                        'The Parallel group is a container for a bunch of tasks that are to be executed simultaneously. \n' +
                        '\n' +
                        'In the release editor, simply add a Parallel group using the **Add task** link. Then you can either drag existing tasks into the parallel group, or click on the inner Add task link to create a new task in the parallel group.\n' +
                        '\n' +
                        'The next tasks in this release will be executed in parallel. Complete this task and you will notice that more than one task are shown in this release in the [Task overview](#/tasks).'
            owner '${user}'
            waitForScheduledStartDate false
          }
          parallelGroup('Complete the tasks in any order') {
            waitForScheduledStartDate false
            tasks {
              manual('Calendar') {
                description 'The [Calendar](#/calendar) shows an overview of all releases on a month-by-month basis.\n' +
                            '\n' +
                            'To navigate between months, use the buttons on top or the collapsible navigation panel on the left.\n' +
                            '\n' +
                            'The filter options give you control over which releases are shown on the calendar.\n' +
                            '\n' +
                            '* Active releases - Show releases that are currently in progress.\n' +
                            '* Planned releases - Show planned releases that have not started yet.\n' +
                            '* Completed releases -Show releases that have been completed or that were aborted.\n' +
                            '* My releases - Show releases for which you are the owner.\n' +
                            '* Only flagged - Show releases that are flagged with a status message to indicate that they need attention or are at risk.'
                owner '${user}'
                waitForScheduledStartDate false
              }
              manual('Planner') {
                description 'The **Planner** shows an interactive Gantt chart that allows you to view and edit the timing of phases and tasks on the level that you desire.\n' +
                            '\n' +
                            'Access the Planner by selecting **Planner** from the **Show** menu at the top of the Release Flow editor.\n' +
                            '\n' +
                            'To do detailed time planning, you can move and resize the tasks in the diagram. You can set the due date of a task by dragging its right edge, and set the scheduled start date of a task by dragging its left edge. Note that setting a scheduled start date on a task means that the task will not start before this date is reached, even if the preceding task has finished. You can also move the whole task by dragging it; this will update scheduled start date and due date but keep the task\'s duration the same.\n' +
                            '\n' +
                            'You can do more sophisticated in a parallel group. By default, all tasks in a parallel group start when the group is started and are executed in parallel. The planner tool allows you to do express dependencies among these tasks explicitly.'
                owner '${user}'
                waitForScheduledStartDate false
              }
              manual('Using variables (everywhere!)') {
                description 'When creating release templates, you will add tasks that contain information that can vary based on the release. Also, you may have one generic release template that can be used for the release process of several applications. This reusability is an important feature of of XL Release because it ensures that you create a template once, and then reuse that template for each application release.\n' +
                            '\n' +
                            'For example, let\'s say you\'ve completed your release template, capturing all of the tasks required to release your application. In the template, the application name is the only unique value that needs to be defined for each release. This is where variables come into play. A variable allows you to put a placeholder in tasks and replace it with the actual application name in the release.\n' +
                            '\n' +
                            'You can use variables in many areas of XL Release, including titles, descriptions, and fields. You use variables as placeholders when you are creating the template and define their values when the release starts or while the release is running.\n' +
                            '\n' +
                            'Now that you understand more about variables, you can see that a best practice for creating a template in XL Release is to look for areas of overlap in your application release processes. If you can consolidate different application release templates into one template using variables, you\'ll help minimize the overhead your team needs to manage many release templates.'
                owner '${user}'
                waitForScheduledStartDate false
              }
            }
          }
        }
      }
    }
    
  }
}