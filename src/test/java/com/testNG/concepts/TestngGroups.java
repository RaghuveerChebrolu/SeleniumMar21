package com.testNG.concepts;

import org.testng.annotations.Test;

public class TestngGroups {
	@Test(groups = { "sanity" })
    public void testMethodOne() {
        System.out.println("Test method one belonging to sanity.");
    }
 
    @Test(groups = { "sanity","Regression" })
    public void testMethodTwo() {
        System.out.println("Test method two belonging to sanity and Regression");
    }
 
    @Test(groups = { "Regression"})
    public void testMethodThree() {
        System.out.println("Test method three belonging to Regression");
    }
}
