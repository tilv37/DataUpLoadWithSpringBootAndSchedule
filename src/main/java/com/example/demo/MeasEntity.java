package com.example.demo;

import javax.persistence.*;

/**
 * Created by DINGSHUO on 2017/7/16.
 */
@Entity
public class MeasEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Basic
    private String para;

    @Lob
    @Column(columnDefinition="TEXT")
    private String valueStr;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPara() {
        return para;
    }

    public void setPara(String para) {
        this.para = para;
    }

    public String getValueStr() {
        return valueStr;
    }

    public void setValueStr(String valueStr) {
        this.valueStr = valueStr;
    }
}
