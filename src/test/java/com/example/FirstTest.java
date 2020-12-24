package com.example;

import org.junit.jupiter.api.Test;
import pages.GooglePage;
import java.io.IOException;

public class FirstTest extends BaseTest {

    @Test
    public void testSearch() throws IOException
    {
        GooglePage gp = new GooglePage(driver);
        driver.get("C://Healinium//userdefinedexample//src//test//resources//sample.html");
        gp.searchItem("abc");

    }
}