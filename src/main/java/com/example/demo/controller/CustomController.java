package com.example.demo.controller;

import com.example.demo.service.CustomService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
@Validated
@Slf4j
public class CustomController {

    private final CustomService service;

    @GetMapping
    @Tag(name = "findMissingNumber")
    @Operation(summary = "Находит пропущенный элемент.",
            description = "Находит первое пропущенное число в целочисленной последовательности." +
                    "Если таковых нет возвращает Null. Не изменяет оригинальную последовательность (сложность по памяти O(n))." +
                    "Логика метода основана на переборе отсортированной последовательности (сложность выполнения O(n*logn))."
    )

    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "4",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(defaultValue = "[5,0,1,3,2]"))}),
            @ApiResponse(responseCode = "400", description = "размер должен находиться в диапазоне от 2 до 2147483647",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(defaultValue = "[5]"))})})
    public Integer findMissingNumber(@Parameter(example = "[5,0,1,3,2]")
                                     @NotNull
                                     @Size(min = 2)
                                     @RequestParam List<Integer> nums) {
        log.info("Get endpoint findMissingNumber(List<Integer> nums) has called.");
        return service.findMissingNumber(nums);
    }
}
