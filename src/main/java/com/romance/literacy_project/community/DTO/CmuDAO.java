package com.romance.literacy_project.community.DTO;

import java.util.List;

public interface CmuDAO {

    /* 리스트 */
    List<CmuDTO> getAllCmuList();

    CmuDTO getCmuByNo(int question_no);

    /* 추가 */
    void insertCmu(CmuDTO cmu);

    /* 삭제 */
    void deleteCmu(int question_no);

    /* 수정 */
    void updateCmu(CmuDTO cmu);


}
