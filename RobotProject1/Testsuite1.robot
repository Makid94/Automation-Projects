*** Settings ***
Library    SeleniumLibrary  
Suite Setup    Log    I am inside test suite setup    
Suite Teardown    Log    I am inside suite teardown    
Test Setup    Log    I am inside test setup    
Test Teardown    Log    I am inside test teardown    

Default Tags    Sanity
  

*** Test Cases ***
My First Test
    [Tags]    Smoke
    Log    Hello World
My Second Test
    Log    I am inside the second test
    Set Tags  Regression1
    Remove Tags    Regression1
    
My Third Test
    Log    I am inside the third test 
    
  
FirstSeleniumTest
    Open Browser    https://www.google.com/  chrome
    Set Browser Implicit Wait    5
    Input Text    name=q    Robotic Process Automation  
    Press Keys    name=q   ENTER 
    Sleep    2    
    Close Browser 
    Log    Test Completed
    
SampleLoginTest
    Open Browser    ${URL}     chrome
    Set Browser Implicit Wait    5
    LoginkW
    Click Element    id=welcome    
    Click Element    xpath=//A[@href='/index.php/auth/logout'][text()='Logout']    
    Close Browser
    Log    Test Completed    
    Log    This test was executed by     
    
*** Variables ***
${URL}   https://opensource-demo.orangehrmlive.com/
@{CREDENTIALS}  Admin   admin123
&{LOGINDATA}  username=Admin  password=admin123

*** Keywords ***
LoginkW
    Input Text        id=txtUsername    @{CREDENTIALS}[0]      
    Input Password    id=txtPassword    &{LOGINDATA}[password]   
    Click Button      id=btnLogin    