package com.example.chinalawtranslate.service;

import com.example.chinalawtranslate.po.Doc;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface DocService {

    @WebMethod
    Doc getByTitle(@WebParam String title);
}
