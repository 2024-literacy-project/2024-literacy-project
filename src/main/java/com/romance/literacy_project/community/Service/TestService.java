package com.romance.literacy_project.community.Service;

import com.romance.literacy_project.community.DTO.TestDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    private final TestDAO testDAO;

    @Autowired
    public TestService(TestDAO testDAO) {
        this.testDAO = testDAO;
    }

    public List<com.romance.literacy_project.community.DTO.TestDTO> getAllPoemList() {

        System.out.println("TestService getAllPoemList() 호출됨");

        return testDAO.getAllPoemList();
    }

}