package com.romance.literacy_project.community.DTO;

import org.apache.ibatis.annotations.Mapper;


import java.util.List;

@Mapper

public interface TestDAO {
    List<com.romance.literacy_project.community.DTO.TestDTO> getAllPoemList();
}