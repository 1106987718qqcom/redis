package com.ch.dao;

import com.ch.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface MapperDao {
    public List<User> findAll();
}
