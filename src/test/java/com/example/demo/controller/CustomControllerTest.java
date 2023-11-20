package com.example.demo.controller;

import com.example.demo.service.CustomService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class CustomControllerTest {
    @Mock
    private CustomService service;
    @InjectMocks
    private CustomController controller;
    private List<Integer> nums;

    @BeforeEach
    public void setUp() {
        nums = List.of(5, 0, 1, 2, 3);
    }

    @Test
    public void testFindMissingNumber() {
        controller.findMissingNumber(nums);
        verify(service).findMissingNumber(nums);
    }
}