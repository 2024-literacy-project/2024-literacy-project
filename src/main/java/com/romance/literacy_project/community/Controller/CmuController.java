package com.romance.literacy_project.community.Controller;

import com.romance.literacy_project.community.DTO.CmuDTO;

import com.romance.literacy_project.community.Service.CmuService;
import com.romance.literacy_project.community.Service.CmuServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/community")
public class CmuController {

    @Autowired
    private CmuService cmuService;
    @Autowired
    private CmuServiceImpl cmuServiceImpl;

    @GetMapping("/list")
    public String getAllCmuList(Model model) {
        model.addAttribute("cmuList", cmuServiceImpl.getAllCmuList());
        return "community/list";
    }

    @PostMapping("/add")
    public String insertCmu(@ModelAttribute CmuDTO cmu) {
        cmuServiceImpl.insertCmu(cmu);
        return "redirect:/community/list";
    }

    @PostMapping("/update")
    public String updateCmu(@ModelAttribute CmuDTO cmu) {
        cmuServiceImpl.updateCmu(cmu);
        return "redirect:/community/list";
    }

    @GetMapping("/delete/{question_no}")
    public String deleteCmu(@PathVariable int question_no) {
        cmuServiceImpl.deleteCmu(question_no);
        return "redirect:/community/list";
    }

    @GetMapping("/{question_no}")
    public String getCmuByNo(@PathVariable String question_no, Model model) {
        try {
            int no = Integer.parseInt(question_no);
            model.addAttribute("cmu", cmuServiceImpl.getCmuByNo(no));
            return "community/detail";
        } catch (NumberFormatException e) {
            // 숫자가 아닌 값이 입력된 경우의 처리 로직
            return "community/errorPage"; // 적절한 에러 페이지로 리다이렉트
        }
    }


    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("cmu", new CmuDTO());
        return "community/addForm"; // 새 글 작성 폼을 보여줄 HTML 파일명
    }
}
