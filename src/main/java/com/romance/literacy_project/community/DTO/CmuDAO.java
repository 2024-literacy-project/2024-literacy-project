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


    CmuDTO findById(int question_no);

    /*코멘트 리스트*/
    List<CommentDTO> selectCommentsByquestion_no(int question_no);
    /*댓글 추가*/
    void insertComment(CommentDTO comment);

    void deleteComment(int comment_no);




}
