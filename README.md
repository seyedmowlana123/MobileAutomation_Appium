Appium Installation Instruction
-------------------------------
1. Install Android Studio
2. Install SDK files from Android studio
3. Set Environment variables for Android tools / platform-tools & bin
4. Install Node
5. Set Environment variables for Node
6. Install Appium Server
7. Install Appium Client
8. Install Appium Inspector / UI Automate Viewer - To get the Locator information




Upload Apps to BrowserStack 
---------------------------
Refer to upload App
1. https://app-automate.browserstack.com/dashboard/v2/quick-start/integrate-test-suite-step#app-uploads-and-management
2. https://www.browserstack.com/docs/app-automate/api-reference/appium/apps#upload-an-app

Use BrowserStack App upload REST API endpoint 
Use this CURL request
curl -u "username:Em75LFf8CZ4wbc42wF5s" \
-X POST "https://api-cloud.browserstack.com/app-automate/upload" \
-F "file=@/path/to/app/file/application-debug.apk" \
-F "custom_id=SampleApp"


Use the response in the BaseTest class. 
Eg: caps.setCapability("app", "bs://j3c874f21852ba57957a3fdc33f47514288c4ba4");