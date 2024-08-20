package com.browserstack;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
@SelectClasses({FirstTest.class, SecondTest.class})
@SuiteDisplayName("Sanity suite")
public class SanitySuite {
}
