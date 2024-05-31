package com.browserstack;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.util.*;

public class BrowserStackJUnitTest {

    public IOSDriver driver;
    public XCUITestOptions options;
    public static Map<String, Object> browserStackYamlMap;
    public static final String USER_DIR = "user.dir";


    @BeforeEach
    public void setup() throws Exception {
        options = new XCUITestOptions();
        driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"),options);
    }

    @AfterEach
    public void tearDown() throws Exception {
        // Invoke driver.quit() to indicate that the test is completed.
        // Otherwise, it will appear as timed out on BrowserStack.
        driver.quit();
    }
}
