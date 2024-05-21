package com.romance.literacy_project.community.Service;

import com.romance.literacy_project.community.DTO.CmuDTO;
import com.romance.literacy_project.community.DTO.CommentDTO;

import java.util.List;
import java.util.Optional;

public interface CmuService {

        /* 리스트 */
        List<CmuDTO>getAllCmuList();

        CmuDTO getCmuByNo(int question_no);

        /* 추가 */
        void insertCmu(CmuDTO cmu);

        /* 삭제 */
        void deleteCmu(int question_no);

        /* 수정 */
        void updateCmu(CmuDTO cmu);

                /* 특정 ID로 조회 */
        Optional<CmuDTO> findById(int question_no);

        /*댓글 기능*/
        /*댓글 목록 기능*/
        List<CommentDTO> getCommentsByquestion_no(int question_no);

        /*댓글 추가 기능*/
        void insertComment(CommentDTO commentDTO);

        /*댓글 삭제 기능*/
        void deleteComment(int comment_no);



//    Object findById(Long id);

}
