package com.romance.literacy_project.community.Service;

import com.romance.literacy_project.community.DTO.CmuDTO;

import java.util.List;

public interface CmuService {

        List<CmuDTO>getAllCmuList();
        void insertCmu(CmuDTO cmu);
        void updateCmu(CmuDTO cmu);
        void deleteCmu(int question_no);
        CmuDTO getCmuByNo(int question_no);

}
