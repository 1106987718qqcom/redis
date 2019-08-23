package com.ch.controller;

import com.ch.dao.MapperDao;
import com.ch.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class Test {
   @Value("${username}")
    private String username;
    @RequestMapping("/test")
   public String test(){
        System.out.println(username);
       return username;

   }
   @Autowired
    private MapperDao mapperDao;

    @RequestMapping("/findAll")
   public List<User> findAll(){
        List<User> all = mapperDao.findAll();
        System.out.println(all);
        return all;
   }

}
