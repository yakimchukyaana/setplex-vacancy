# Project for <a href="https://setplex.com/en/">Setplex</a> QA Automation vacancy

<p align="center">  
<img src="media/screenshots/setplex_main_page.png" alt="MainPage" width="950"/></a>  
</p>

>Setplex provides highly-scalable, low latency IPTV/OTT solutions for your video. Since 2006 Setplex has redefined the way video is managed and consumed. They focus on delivering the best UI/UX across all their platforms and providing the best quality.
> 
>Source: [Setplex](https://setplex.com/en/our-company.html)

## Contents

- [Technologies and tools](#technologies-and-tools)
- [Test cases](#test-cases)
- [Run tests with Jenkins](#run-tests-with-jenkins)
- [Allure reports](#allure-report)
- [Integration with Allure TestOps](#allure-test-ops)
- [Integration with Jira](#jira)
- [Telegram notifications](#telegram-notifications)
- [Test video](#test-video)

## <a name="tecnologies-and-tools"></a>Technologies and tools
<p align="left">
<a href="https://www.jetbrains.com/idea/"><img src="media/logos/Intelij_IDEA.svg" width="50" height="50"  alt="IDEA" title="IntelliJ IDEA"/></a>
<a href="https://www.java.com/"><img src="media/logos/Java.svg" width="50" height="50" alt="Java" title="Java"/></a>
<a href="https://github.com/"><img src="media/logos/GitHub.svg" width="50" height="50" alt="Github" title="GitHub"/></a>
<a href="https://junit.org/junit5/"><img src="media/logos/JUnit5.svg" width="50" height="50" alt="JUnit 5" title="JUnit 5"/></a>
<a href="https://gradle.org/"><img src="media/logos/Gradle.svg" width="50" height="50" alt="Gradle" title="Gradle"/></a>
<a href="https://selenide.org/"><img src="media/logos/Selenide.svg" width="50" height="50" alt="Selenide" title="Selenide"/></a>
<a href="https://aerokube.com/selenoid/"><img src="media/logos/Selenoid.svg" width="50" height="50" alt="Selenoid" title="Selenoid"/></a>
<a href="https://github.com/allure-framework/allure2"><img src="media/logos/Allure_Report.svg" width="50" height="50" alt="Allure" title="Allure"/></a>
<a href="https://qameta.io/"><img src="media/logos/Allure_TO.svg" width="50" height="50" alt="Allure TestOps" title="Allure TestOps"/></a>
<a href="https://www.jenkins.io/"><img src="media/logos/Jenkins.svg" width="50" height="50" alt="Jenkins" title="Jenkins"/></a>
<a href="https://www.atlassian.com/ru/software/jira"><img src="media/logos/Jira.svg" width="50" height="50" alt="Jira" title="Jira"/></a>
<a href="https://web.telegram.org/"><img src="media\logos\Telegram.svg" width="50" height="50" alt="Telegram" title="Telegram"></a>
</p>

## <a name="test-cases"></a>Test cases

- Check text on the main page
- Check that language can be changed
- Check that there is a form on Start Now page
- Check that empty form can't be submitted
- Check text on the Why Setplex page

## <img width="4%" style="vertical-align:middle" title="Jenkins" src="media/logos/Jenkins.svg"><a name="run-tests-with-jenkins"></a> Run tests with <a href='https://jenkins.autotests.cloud/job/student-yakimchukyaana-qa_guru_21_vacancy-homework/' title="Jenkins build">Jenkins</a>

To run tests with Jenkins you need to click on the `Build with parameters` button, set the parameters and click `Build`.

<p align="center">  
<img src="media/screenshots/jenkins_build_page.png" alt="MainPage" width="950"/></a>  
</p>

### Parameters

- **BROWSER** - choose a browser for tests (Chrome by default)
- **REMOTE_DRIVER_URL** - where tests will be running (<a href="selenoid.autotests.cloud">selenoid.autotests.cloud</a> by default)
- **BROWSER_SIZE** - size of the browser window (1920x1080 by default)
- **BROWSER_VERSION** - version of the browser (99.0, 100.0 for Chrome, 97.0, 98.0 for Firefox, 85.0, 86.0 for Opera)
- **STAND_BASE_URL** - base url for tests (<a href="https://setplex.com">https://setplex.com</a> by default)
- **ENVIRONMENT** - environment for tests (stage by default)
- **COMMENT** - comment for telegram notifications

## <img width="4%" style="vertical-align:middle" title="Allure Report" src="media/logos/Allure_Report.svg"><a name="allure-report"></a> Allure reports

After running tests allure report is generated. Allure reports can be found on <a href="https://jenkins.autotests.cloud/job/student-yakimchukyaana-qa_guru_21_vacancy-homework/">project page in Jenkins</a>.
Allure reports look like <a href="https://jenkins.autotests.cloud/job/student-yakimchukyaana-qa_guru_21_vacancy-homework/13/allure/">this</a>

<p align="center">  
<img src="media/screenshots/allure-report.png" alt="MainPage" width="950"/></a>  
</p>

### You can click on each test to find details:
- tags
- severity
- duration
- steps
- screenshot
- page source
- browser console logs
- video
- history

<p align="center">  
<img src="media/screenshots/allure_details.png" alt="MainPage" width="950"/></a>  
</p>

## <img width="4%" style="vertical-align:middle" title="Allure TestOps" src="media/logos/Allure_TO.svg"><a name="allure-test-ops"></a> Integration with <a href='https://allure.autotests.cloud/project/3684/dashboards'>Allure TestOps</a>

### There you can find all information about crucial things such as:
- <a href="https://allure.autotests.cloud/project/3684/dashboards">dashboards</a>
- <a href="https://allure.autotests.cloud/project/3684/test-cases?treeId=0">test cases</a>
- <a href="https://allure.autotests.cloud/project/3684/launches">launches</a>
- <a href="https://allure.autotests.cloud/project/3684/analytics">analytics</a>
- etc

<p align="center">
<img title="Jira" src="media/screenshots/allure_testops_dashboards.png">
</p>

<p align="center">
<img title="Jira" src="media/screenshots/allure_testops_test_cases.png">
</p>

## <img width="4%" style="vertical-align:middle" title="Jira" src="media/logos/Jira.svg"><a name="jira"></a> Integration with <a href='https://jira.autotests.cloud/browse/HOMEWORK-899'>Jira</a>

<p align="center">
<img title="Jira" src="media/screenshots/jira_task.png">
</p>

### There is information about:
- priority
- tags
- test cases from Allure TestOps
- test launches
- assignee
- author
- create date
- etc

## <img width="4%" style="vertical-align:middle" title="Telegram" src="media/logos/Telegram.svg"><a name="telegram-notifications"></a> Telegram notifications

After each build test results are sent to a `Telegram` chat. It looks like this

<p align="center">
<img title="Jira" src="media/screenshots/tg_notification.png">
</p>

## 🎥 <a name="test-video"></a>Test video

A video from selenoid is attached to each test in the allure report. There is the example from changing language test.

<p align="center">
  <img title="Selenoid Video" src="media/videos/change_language_video.gif">
</p>