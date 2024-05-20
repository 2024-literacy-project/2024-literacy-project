package com.romance.literacy_project.community.Service;

import com.romance.literacy_project.community.DTO.CmuDAO;
import com.romance.literacy_project.community.DTO.CmuDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CmuServiceImpl implements CmuService {

    @Autowired
    private CmuDAO cmuDAO;

    @Override
    public List<CmuDTO> getAllCmuList() {
        return cmuDAO.getAllCmuList();
    }

    @Override
    public void insertCmu(CmuDTO cmu) {
        cmuDAO.insertCmu(cmu);
    }

    @Override
    public void updateCmu(CmuDTO cmu) {
        cmuDAO.updateCmu(cmu);
    }

    @Override
    public void deleteCmu(int question_no) {
        cmuDAO.deleteCmu(question_no);
    }

    @Override
    public CmuDTO getCmuByNo(int question_no) {
        return cmuDAO.getCmuByNo(question_no);
    }
}
