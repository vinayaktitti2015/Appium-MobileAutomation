# Appium-e2e-automation

## Prerequisites

* nodejs > 8.0
* npm > 4.0
* npm install -g appium # get appium
* npm install wd # get appium client

> To check all dependencies installed

1. Run cmmd: appium-doctor --android
2. Run cmmd: appium-doctor --ios

## To run, you will need to install gradle, then run on Android & iOS platforms using command line:

[Note: iOS need to add depedencies follow, https://www.youtube.com/watch?v=BULjgsTpw2c ]

> > Execution > Add DeviceID

1. Go To testng.xml file in root path- add deviceID based on platform
   Ex: Android > UDID - emulator-5554
   iOS > UDID - 5DB3749B-02A4-468E-B4EB-09B1FADC51FE

## Run test scripts with tags
ex: smoke, regression, register, login

run: gradle clean --info test -Dcucumber.options="--tags @smoke"

### Run with multi tags
gradle clean --info test -Dcucumber.options="--tags @register,@login"

> Reports

1. Default Reports: will be gererated at projectroot/target/default-report/index.html
2. Custom Reports
   Run cmmd: gradle report
   Report will be generated at projectroot/target/cucumber-html-reports/overview-features.html

## Run nodejs server manually for parallel execution
1. cd /usr/local/lib/node_modules/appium/build/lib
2. To run Android: node main.js -a 127.0.0.1 -p 4723 -cp 4723 -bp 4567
3. To run iOS: node main.js -a 127.0.0.1 -p 1234 -cp 1234 -bp 2345

[Note: script execution is not stable on parallel execution]
