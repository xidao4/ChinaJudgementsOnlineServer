package com.example.chinalawtranslate;

import com.example.chinalawtranslate.data.DocMapper;
import com.example.chinalawtranslate.po.Doc;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ChinaLawTranslateApplicationTests {

    @Autowired
    DocMapper docMapper;

    @Test
    void contextLoads() {
        Doc doc = docMapper.getByTitle("title");
        System.out.println();
    }

}
