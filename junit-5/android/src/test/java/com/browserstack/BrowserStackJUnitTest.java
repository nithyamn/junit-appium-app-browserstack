package com.browserstack;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.util.*;

public class BrowserStackJUnitTest {

    public AndroidDriver driver;
    public UiAutomator2Options options;
    public static Map<String, Object> browserStackYamlMap;
    public static final String USER_DIR = "user.dir";

    @BeforeEach
    public void setup() throws Exception {
        options = new UiAutomator2Options();
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),options);
    }

    @AfterEach
    public void tearDown() throws Exception {
        // Invoke driver.quit() to indicate that the test is completed. 
        // Otherwise, it will appear as timed out on BrowserStack.
        driver.quit();
    }
}
