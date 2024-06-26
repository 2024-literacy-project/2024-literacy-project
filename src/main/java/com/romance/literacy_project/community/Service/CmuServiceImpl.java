package com.romance.literacy_project.community.Service;

import com.romance.literacy_project.community.DTO.CmuDAO;
import com.romance.literacy_project.community.DTO.CmuDTO;
import com.romance.literacy_project.community.DTO.CommentDTO;
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
//        CmuDTO cmuDTO = cmuDAO.getCmuByNo(question_no);
        CmuDTO cmuDTO = cmuDAO.findById(question_no);
        return Optional.ofNullable(cmuDTO);
    }

    @Override
    public List<CommentDTO> getCommentsByQuestion_no(int question_no) {
        return cmuDAO.selectCommentsByQuestion_no(question_no);
    }

    @Override
    public void insertComment(CommentDTO commentDTO) {
        cmuDAO.insertComment(commentDTO);
    }

    @Override
    public void deleteComment(int comment_no) {
        cmuDAO.deleteComment(comment_no);
    }


}
