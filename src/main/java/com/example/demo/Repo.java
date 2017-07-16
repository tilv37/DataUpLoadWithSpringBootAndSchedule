package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by DINGSHUO on 2017/7/16.
 */
@Repository
public interface Repo extends JpaRepository<MeasEntity,Long>{
}
