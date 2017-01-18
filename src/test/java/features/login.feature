Feature:
As a user
I want to be able to login to the application
So that i can select and by products


Scenario Outline:  Sign up a new user

Given the user is on Home page
And she clicks sign in button
Then she is navigated to sign in page
And she provides her email as <email>
And she provides her password as <password>
And she clicks Sign in button
Then she should be login to the application 

Examples:
| email | password |
| samir_keskar@hotmail.com | decision |




                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             