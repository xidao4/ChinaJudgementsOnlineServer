package com.example.chinalawtranslate.po;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Doc {
    /**
     * 案件id
     */
    private Integer id;
    /**
     * 案件标题
     */
    private String title;
    /**
     * 案件类型
     */
    private String type;
    /**
     * 法院名称
     */
    private String court;
    /**
     * 案由
     */
    private String cause;
    /**
     * 案件正文
     */
    private String content;
    /**
     * 状态
     */
    private String status;
    /**
     * 时间
     */
    private Date time;
}
