  Feature: mailing on i.ua
    Scenario: I login to i.ua mail and sent email
     Given I on iua main page
     When Enter e-mail as testmailswat@i.ua and password as 123456qwerty and press login button
     Then Check my login TestMailSWAT@i.ua
     And I open create mail window
     And I enter adress as testmailswat@i.ua , subject as TestMail, mail text as Text
     Then Sent created email
     And I Open mail list
     And Open last mail I haven`t read from Tester11
     Then I see mail with subject as TestMail and text as Text
     