package com.romance.literacy_project.community.Service;

import com.romance.literacy_project.community.DTO.CmuDAO;
import com.romance.literacy_project.community.DTO.CmuDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CmuServiceImpl implements CmuService {

    @Autowired
    private CmuDAO cmuDAO;

    /* 리스트 */
    @Override
    public List<CmuDTO> getAllCmuList() {
        return cmuDAO.getAllCmuList();
    }

    @Override
    public CmuDTO getCmuByNo(int question_no) {
        return cmuDAO.getCmuByNo(question_no);
    }

    /* 추가 */
    @Override
    public void insertCmu(CmuDTO cmu) {
        cmuDAO.insertCmu(cmu);
    }

    /* 삭제 */
    @Override
    public void deleteCmu(int question_no) {
        cmuDAO.deleteCmu(question_no);
    }

    /* 수정 */
    @Override
    public void updateCmu(CmuDTO cmu) {
        cmuDAO.updateCmu(cmu);
    }

    /* 특정 ID로 조회 */
    @Override
    public Optional<CmuDTO> findById(int question_no) {
        CmuDTO cmuDTO = cmuDAO.getCmuByNo(question_no);
        return Optional.ofNullable(cmuDTO);
    }

}
