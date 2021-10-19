package com.example.chinalawtranslate.config;

import com.example.chinalawtranslate.service.DocService;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.apache.cxf.Bus;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

@Configuration
public class CxfWebServiceConfig {

    @Autowired
    private Bus bus;

    @Bean("cxfServletRegistration")
    public ServletRegistrationBean dispatcherServlet() {
        //注册servlet 拦截/ws 开头的请求 不设置 默认为：/services/*
        return new ServletRegistrationBean(new CXFServlet(), "/ws/*");
    }

    /**
     * 发布endpoint
     */
    @Bean
    public Endpoint endpoint(DocService docService) {
        EndpointImpl endpoint = new EndpointImpl(bus, docService);
        endpoint.publish("/doc");//发布地址
        return endpoint;
    }
}
