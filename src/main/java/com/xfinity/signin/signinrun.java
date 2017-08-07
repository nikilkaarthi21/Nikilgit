package com.xfinity.signin;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/resources/com/xfinity/signin",tags="@order",format={"pretty"})
public class signinrun {

}
