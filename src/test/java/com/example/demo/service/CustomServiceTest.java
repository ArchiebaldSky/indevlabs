package com.example.demo.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CustomServiceTest {

    private CustomService service;
    private List<Integer> listWithMissingNumber;
    private List<Integer> listWithOutMissingNumber;
    private List<Integer> listWithOneObject;
    private List<Integer> emptyList;

    @BeforeEach
    public void setUp(){
        service = new CustomService();
        listWithMissingNumber = List.of(5, 0, 1, 2, 3);
        listWithOutMissingNumber =  List.of(4, 0, 1, 2, 3);
        listWithOneObject =  List.of(5);
        emptyList = List.of();
    }

    @Test
    public void testNumsHasMissingNumber(){
        assertEquals(4, service.findMissingNumber(listWithMissingNumber));
    }

    @Test
    public void testNumsHasNotMissingNumber(){
        assertNull(service.findMissingNumber(listWithOutMissingNumber));
    }

    @Test
    public void testNumsHasOneObject(){
        assertNull(service.findMissingNumber(listWithOneObject));
    }

    @Test
    public void testNumsIsEmpty(){
        assertNull(service.findMissingNumber(emptyList));
    }
}