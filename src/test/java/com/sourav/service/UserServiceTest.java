package com.sourav.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = UserServiceTest.TestConfig.class)
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void nullCheck(){
        Assert.assertNotNull(userService);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSanity1(){
        userService.pressDestination(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSanity2(){
        userService.pressDestination(8);
    }

    @Configuration
    @ComponentScan(basePackages = "com.sourav.service")
    static class TestConfig{}
}
