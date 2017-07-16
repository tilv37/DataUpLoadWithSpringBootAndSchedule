package com.example.demo;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by DINGSHUO on 2017/7/16.
 */
@Service
public class DataTask {
    @Autowired
    Repo repo;

    @Autowired
    HttpUtil httpUtil;


    @Scheduled(fixedDelay = 60000L,initialDelay = 5000L)
    public void readAndUpload(){
        List<MeasEntity> list=repo.findAll();
        System.out.println(JSON.toJSONString(list));

        httpUtil.sendPost("http://127.0.0.1:8080/upload", JSON.toJSONString(list));
    }

    public void setDatas(){
        for (int i=0;i<1000;i++){
            MeasEntity measEntity=new MeasEntity();
            measEntity.setPara("PARA"+i);
            measEntity.setValueStr(String.valueOf(i));
            repo.save(measEntity);
        }
    }
}
