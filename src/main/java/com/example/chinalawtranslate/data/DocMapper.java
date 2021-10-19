package com.example.chinalawtranslate.data;

import com.example.chinalawtranslate.po.Doc;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface DocMapper {

    Doc getByTitle(String title);

}
