package com.tester.webdriver;

/**
 * Created by asingh on 1/23/18.
 */
import cucumber.api.junit.*;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@Cucumber.Options(
        features={"src/test/resources"}
)
public class CukesRunner {}
