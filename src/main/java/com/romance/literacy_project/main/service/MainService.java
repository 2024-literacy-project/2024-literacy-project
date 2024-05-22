package com.romance.literacy_project.main.service;

import com.romance.literacy_project.main.model.dao.MainDAO;
import com.romance.literacy_project.main.model.dto.ContentDTO;
import com.romance.literacy_project.main.model.dto.PoemDTO;
import com.romance.literacy_project.main.model.dto.QuizAnswerDTO;
import com.romance.literacy_project.main.model.dto.QuizDTO;
import com.sun.tools.javac.Main;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainService {

    @Autowired
    private final MainDAO mainDAO;

    @Autowired
    public MainService(MainDAO mainDAO) {
        this.mainDAO = mainDAO;
    }

    public List<PoemDTO> getAllPoemList() {

        System.out.println("TestService getAllPoemList() 호출됨");

        return mainDAO.getAllPoemList();
    }

    public List<ContentDTO> getAllContentList() {

        System.out.println("TestService getAllContentList() 호출됨");

        return mainDAO.getAllContentList();
    }

    public List<QuizDTO> getAllQuizList() {

        System.out.println("TestService getAllQuizList() 호출됨");

        return mainDAO.getAllQuizList();
    }

    public void saveAnswer(QuizAnswerDTO quizAnswerDTO) {
        mainDAO.updateQuizAnswer(quizAnswerDTO);
    }
}