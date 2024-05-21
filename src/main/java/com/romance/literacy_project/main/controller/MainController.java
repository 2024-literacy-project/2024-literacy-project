package com.romance.literacy_project.main.controller;

import com.romance.literacy_project.main.model.dto.ContentDTO;
import com.romance.literacy_project.main.model.dto.PoemDTO;
import com.romance.literacy_project.main.model.dto.QuizDTO;
import com.romance.literacy_project.main.service.MainService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class MainController {
    private final MainService mainService;

    public MainController(MainService mainService) {
        this.mainService = mainService;
    }

    @RequestMapping("/")
    public ModelAndView openAll() throws Exception {
        ModelAndView mv = new ModelAndView("main/main");
        List<PoemDTO> listPoem = mainService.getAllPoemList();
        List<ContentDTO> listContent = mainService.getAllContentList();
        List<QuizDTO> listQuiz = mainService.getAllQuizList();

        mv.addObject("listPoem", listPoem);
        mv.addObject("listContent", listContent);
        mv.addObject("listQuiz", listQuiz);

        return mv;
    }

    @RequestMapping("/content")
    public ModelAndView content() throws Exception {
        ModelAndView mv = new ModelAndView("main/content");
        List<ContentDTO> listContent = mainService.getAllContentList();
        mv.addObject("listContent", listContent);
        return mv;
    }



}
