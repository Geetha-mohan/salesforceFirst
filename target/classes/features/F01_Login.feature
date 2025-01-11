Feature: Login salesforce

Scenario: Login with positive data
Given Enter the username as 'dilip@testleaf.com'
And Enter the password as 'leaf@2024'
When Click on login button
Then Verify the title

#Scenario: Login with negative data
#Given Enter the username as 'dilip@testleaf.com'
#And Enter the password as 'testleaf@2024'
#When Click on login button