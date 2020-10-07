package com.demo.richmond.custorder.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DataServiceTest {

    @Test
    public void testNumberOfWords() throws Exception {
        DataService dataService = new DataService();
        assertEquals(4, dataService.numberOfWords("This is a test"));
    }

}
