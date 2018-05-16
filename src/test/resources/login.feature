  Feature: mailing on i.ua
      Scenario: I login to i.ua mail
      Given I on iua main page
      When Enter e-mail as testmailswat@i.ua and password as 123456qwerty and press login button
      Then Check my login TestMailSWAT@i.ua

#      Scenario: Create and sent email
#        Given I on iua main page
#        When I opewn create mail window
#        And  Enter e-mail as testmailswat@i.ua and password as 123456qwerty and press login button
#        When I enter e-mail text as 123456qwerty
#        And  I enter adress as 123456qwerty
#        And  I enter  as 123456qwerty
#        Then Sent created email
