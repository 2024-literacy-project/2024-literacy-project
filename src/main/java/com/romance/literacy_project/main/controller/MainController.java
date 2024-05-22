package com.romance.literacy_project.main.controller;

import com.romance.literacy_project.main.model.dto.ContentDTO;
import com.romance.literacy_project.main.model.dto.PoemDTO;
import com.romance.literacy_project.main.model.dto.QuizAnswerDTO;
import com.romance.literacy_project.main.model.dto.QuizDTO;
import com.romance.literacy_project.main.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;

@Controller
public class MainController {

    @Autowired
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

    @PostMapping("submit")
    public String submitQuizAnswer(@RequestParam String selected_option,
                                   @RequestParam String mem_nick, Model model) {
        List<QuizDTO> listQuiz = mainService.getAllQuizList();
        boolean is_correct = selected_option.equals(listQuiz.get(0).getQuiz_answer());

        model.addAttribute("is_correct", is_correct);
        model.addAttribute("listQuiz", listQuiz);
        return "quizResult";

    }

    @RequestMapping("/content")
    public ModelAndView content() throws Exception {
        ModelAndView mv = new ModelAndView("main/content");
        List<ContentDTO> listContent = mainService.getAllContentList();
        mv.addObject("listContent", listContent);
        return mv;
    }


}