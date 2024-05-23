package com.romance.literacy_project.community.Controller;

import com.romance.literacy_project.community.DTO.TestDTO;
import com.romance.literacy_project.community.Service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    private final TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping("/list")
    public List<TestDTO> findAll() {
        return testService.getAllPoemList();
    }
}