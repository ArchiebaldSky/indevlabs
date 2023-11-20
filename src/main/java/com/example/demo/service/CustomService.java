package com.example.demo.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@RequiredArgsConstructor
@Slf4j
public class CustomService {
    public Integer findMissingNumber(List<Integer> nums) {
        log.info("CustomService method findMissingNumber(List<Integer> nums) has called with List {}.", nums);

        if (nums.size() <= 1) {
            log.info("Missing number hasn't found.");
            return null;
        }

        List<Integer> sortedNums = new ArrayList<>();

        sortedNums.addAll(nums);
        Collections.sort(sortedNums);

        for (int i = 0; i < sortedNums.size() - 1; i++) {
            Integer current = sortedNums.get(i);
            Integer next = sortedNums.get(i + 1);

            if ((current + 1) != next) {
                log.info("Missing number '{}' has found.", current + 1);
                return current + 1;
            }
        }
        log.info("Missing number hasn't found.");
        return null;
    }
}
