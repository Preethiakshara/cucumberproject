$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/resource/java/addcustomer.feature");
formatter.feature({
  "name": "Add customer",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Add customer details",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "The user is in guru login page",
  "keyword": "Given "
});
formatter.step({
  "name": "the user logged in as manager with credentails",
  "keyword": "And ",
  "rows": [
    {
      "cells": [
        "username",
        "mngr157328"
      ]
    },
    {
      "cells": [
        "password",
        "zYqetAm"
      ]
    }
  ]
});
formatter.step({
  "name": "the user navigator to new customer",
  "keyword": "And "
});
formatter.step({
  "name": "The user enters the customer details \"\u003ccustname\u003e\",\"\u003cGender\u003e\",\"\u003cDob\u003e\",\"\u003cAddress\u003e\",\"\u003ccity\u003e\",\"\u003cstate\u003e\",\"\u003cpin\u003e\",\"\u003cphoneno\u003e\",\"\u003cemail\u003e\",\"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "The user click reset  button",
  "keyword": "And "
});
formatter.step({
  "name": "The fields should in add customer page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "custname",
        "Gender",
        "Dob",
        "Address",
        "city",
        "state",
        "pin",
        "phoneno",
        "email",
        "password"
      ]
    },
    {
      "cells": [
        "usera",
        "female",
        "08181994",
        "andal nagar",
        "dindigul",
        "tn",
        "624005",
        "9787414968",
        "usera@gmail.com",
        "user@1"
      ]
    },
    {
      "cells": [
        "userb",
        "male",
        "09191994",
        "ns nagar",
        "dindigul",
        "tn",
        "624006",
        "9787494168",
        "userb@gmail.com",
        "user@2"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Add customer details",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.step({
  "name": "The user is in guru login page",
  "keyword": "Given "
});
formatter.match({
  "location": "AddCustomer.the_user_is_in_guru_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user logged in as manager with credentails",
  "rows": [
    {
      "cells": [
        "username",
        "mngr157328"
      ]
    },
    {
      "cells": [
        "password",
        "zYqetAm"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomer.the_user_logged_in_as_manager_with_credentails(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user navigator to new customer",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomer.the_user_navigator_to_new_customer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user enters the customer details \"usera\",\"female\",\"08181994\",\"andal nagar\",\"dindigul\",\"tn\",\"624005\",\"9787414968\",\"usera@gmail.com\",\"user@1\"",
  "keyword": "When "
});
formatter.match({
  "location": "AddCustomer.the_user_enters_the_customer_details(String,String,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user click reset  button",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomer.the_user_click_reset_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The fields should in add customer page",
  "keyword": "Then "
});
formatter.match({
  "location": "AddCustomer.the_fields_should_in_add_customer_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add customer details",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.step({
  "name": "The user is in guru login page",
  "keyword": "Given "
});
formatter.match({
  "location": "AddCustomer.the_user_is_in_guru_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user logged in as manager with credentails",
  "rows": [
    {
      "cells": [
        "username",
        "mngr157328"
      ]
    },
    {
      "cells": [
        "password",
        "zYqetAm"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomer.the_user_logged_in_as_manager_with_credentails(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user navigator to new customer",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomer.the_user_navigator_to_new_customer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user enters the customer details \"userb\",\"male\",\"09191994\",\"ns nagar\",\"dindigul\",\"tn\",\"624006\",\"9787494168\",\"userb@gmail.com\",\"user@2\"",
  "keyword": "When "
});
formatter.match({
  "location": "AddCustomer.the_user_enters_the_customer_details(String,String,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user click reset  button",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomer.the_user_click_reset_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The fields should in add customer page",
  "keyword": "Then "
});
formatter.match({
  "location": "AddCustomer.the_fields_should_in_add_customer_page()"
});
formatter.result({
  "status": "passed"
});
});