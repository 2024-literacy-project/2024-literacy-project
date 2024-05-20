package com.romance.literacy_project.community.DTO;

import java.util.List;

public interface CmuDAO {
    List<CmuDTO> getAllCmuList();
    void insertCmu(CmuDTO cmu);
    void updateCmu(CmuDTO cmu);
    void deleteCmu(int question_no);
    CmuDTO getCmuByNo(int question_no);
}
