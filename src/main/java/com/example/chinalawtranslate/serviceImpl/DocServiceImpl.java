package com.example.chinalawtranslate.serviceImpl;

import com.example.chinalawtranslate.data.DocMapper;
import com.example.chinalawtranslate.po.Doc;
import com.example.chinalawtranslate.po.Status;
import com.example.chinalawtranslate.service.DocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.WebService;

@WebService
@Service
public class DocServiceImpl implements DocService {

    @Autowired
    DocMapper docMapper;

    @Override
    public Doc getByTitle(String title) {
        return docMapper.getByTitle(title);
//        return new Doc("title", "type", "court",
//                "cause", "content", Status.fromValue("0"));
    }
}
