$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("main/resources/com/xfinity/contactus/contact.feature");
formatter.feature({
  "line": 1,
  "name": "Testing contactus on Automation Practice",
  "description": "\r\nAs a Tester\r\nI am designing the framework\r\nInorder to test BDD framework",
  "id": "testing-contactus-on-automation-practice",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 7,
  "name": "Click on the contactus",
  "description": "",
  "id": "testing-contactus-on-automation-practice;click-on-the-contactus",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@contact"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I open \"SITE\" on \"\u003cbrowser\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I click on \"Contactus\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I Enter the data from Excel \"subject\" and \"\u003cHeading\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I Enter the data from Excel \"objectname1\" and \"\u003cEmail\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I Enter the data from Excel \"objectname2\" and \"\u003corder\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I Enter the data from Excel \"objectname3\" and \"\u003cmessage\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on \"send\"",
  "keyword": "And "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "testing-contactus-on-automation-practice;click-on-the-contactus;",
  "rows": [
    {
      "cells": [
        "browser",
        "Email",
        "order",
        "message",
        "Heading"
      ],
      "line": 17,
      "id": "testing-contactus-on-automation-practice;click-on-the-contactus;;1"
    },
    {
      "cells": [
        "Chrome",
        "nikil.kaarthi@gmail.com",
        "312312",
        "hello",
        "Webmaster"
      ],
      "line": 18,
      "id": "testing-contactus-on-automation-practice;click-on-the-contactus;;2"
    },
    {
      "cells": [
        "mozilla",
        "shanthi.jayaraman7@gmail.com",
        "7873828",
        "hi",
        "Webmaster"
      ],
      "line": 19,
      "id": "testing-contactus-on-automation-practice;click-on-the-contactus;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 18,
  "name": "Click on the contactus",
  "description": "",
  "id": "testing-contactus-on-automation-practice;click-on-the-contactus;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@contact"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I open \"SITE\" on \"Chrome\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I click on \"Contactus\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I Enter the data from Excel \"subject\" and \"Webmaster\"",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I Enter the data from Excel \"objectname1\" and \"nikil.kaarthi@gmail.com\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I Enter the data from Excel \"objectname2\" and \"312312\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I Enter the data from Excel \"objectname3\" and \"hello\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on \"send\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 19,
  "name": "Click on the contactus",
  "description": "",
  "id": "testing-contactus-on-automation-practice;click-on-the-contactus;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@contact"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I open \"SITE\" on \"mozilla\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I click on \"Contactus\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I Enter the data from Excel \"subject\" and \"Webmaster\"",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I Enter the data from Excel \"objectname1\" and \"shanthi.jayaraman7@gmail.com\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I Enter the data from Excel \"objectname2\" and \"7873828\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I Enter the data from Excel \"objectname3\" and \"hi\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on \"send\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("main/resources/com/xfinity/signin/order.feature");
formatter.feature({
  "line": 1,
  "name": "ordering a dress",
  "description": "\r\nAs a Tester\r\nI need to login \r\nInorder to place an order",
  "id": "ordering-a-dress",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 8,
  "name": "Ordering a dress",
  "description": "",
  "id": "ordering-a-dress;ordering-a-dress",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@order"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "I open the \"URL\" on \"\u003cbrowser\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I click on \"signin\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I Enter the \"email\"",
  "rows": [
    {
      "cells": [
        "shanthi.jayaraman7@gmail.com"
      ],
      "line": 13
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I Enter the \"password\"",
  "rows": [
    {
      "cells": [
        "7@oracle"
      ],
      "line": 15
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I click on \"sign\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I click on \"dress\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I click on \"summer\"",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I click on \"yellowdress\"",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I click on \"addtocart\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I click on \"proceed\"",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I click on \"address\"",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I click on \"checkout\"",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I click on \"checkbox\"",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I click on \"shipping\"",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I click on \"check\"",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I click on \"confirm\"",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "the order should be \"success\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 33,
  "name": "",
  "description": "",
  "id": "ordering-a-dress;ordering-a-dress;",
  "rows": [
    {
      "cells": [
        "browser",
        "element"
      ],
      "line": 34,
      "id": "ordering-a-dress;ordering-a-dress;;1"
    },
    {
      "cells": [
        "Chrome",
        "signin"
      ],
      "line": 35,
      "id": "ordering-a-dress;ordering-a-dress;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 35,
  "name": "Ordering a dress",
  "description": "",
  "id": "ordering-a-dress;ordering-a-dress;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@order"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "I open the \"URL\" on \"Chrome\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I click on \"signin\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I Enter the \"email\"",
  "rows": [
    {
      "cells": [
        "shanthi.jayaraman7@gmail.com"
      ],
      "line": 13
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I Enter the \"password\"",
  "rows": [
    {
      "cells": [
        "7@oracle"
      ],
      "line": 15
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I click on \"sign\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I click on \"dress\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I click on \"summer\"",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I click on \"yellowdress\"",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I click on \"addtocart\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I click on \"proceed\"",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I click on \"address\"",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I click on \"checkout\"",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I click on \"checkbox\"",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I click on \"shipping\"",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I click on \"check\"",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I click on \"confirm\"",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "the order should be \"success\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("main/resources/com/xfinity/signin/signin.feature");
formatter.feature({
  "line": 1,
  "name": "Login test",
  "description": "As a tester\r\nI need to enter the user name and password\r\nIn order to enter in the site",
  "id": "login-test",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 7,
  "name": "Login test",
  "description": "",
  "id": "login-test;login-test",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@signin"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I open the \"URL\" on \"\u003cbrowser\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I click on \"signin\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I Enter the \"email\" as \"\u003cemailid\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I Enter the \"password\" as \"\u003cpwd\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click on \"sign\"",
  "keyword": "And "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "login-test;login-test;",
  "rows": [
    {
      "cells": [
        "browser",
        "emailid",
        "pwd"
      ],
      "line": 16,
      "id": "login-test;login-test;;1"
    },
    {
      "cells": [
        "Chrome",
        "shanthi.jayaraman7@gmail.com",
        "7@oracle"
      ],
      "line": 17,
      "id": "login-test;login-test;;2"
    },
    {
      "cells": [
        "mozilla",
        "shanthi.jaayraman7@gmail.com",
        "7@oracle"
      ],
      "line": 18,
      "id": "login-test;login-test;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 17,
  "name": "Login test",
  "description": "",
  "id": "login-test;login-test;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@signin"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I open the \"URL\" on \"Chrome\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I click on \"signin\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I Enter the \"email\" as \"shanthi.jayaraman7@gmail.com\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I Enter the \"password\" as \"7@oracle\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click on \"sign\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 18,
  "name": "Login test",
  "description": "",
  "id": "login-test;login-test;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@signin"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I open the \"URL\" on \"mozilla\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I click on \"signin\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I Enter the \"email\" as \"shanthi.jaayraman7@gmail.com\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I Enter the \"password\" as \"7@oracle\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click on \"sign\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});