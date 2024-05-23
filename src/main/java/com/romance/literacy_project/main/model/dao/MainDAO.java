package com.romance.literacy_project.main.model.dao;

import com.romance.literacy_project.main.model.dto.ContentDTO;
import com.romance.literacy_project.main.model.dto.PoemDTO;
import com.romance.literacy_project.main.model.dto.QuizAnswerDTO;
import com.romance.literacy_project.main.model.dto.QuizDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MainDAO {

    List<PoemDTO> getAllPoemList();
    List<ContentDTO> getAllContentList();
    List<QuizDTO> getAllQuizList();

//    void updateQuizAnswer(QuizAnswerDTO quizAnswerDTO);

}
