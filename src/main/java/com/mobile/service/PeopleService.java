package com.mobile.service;

import com.mobile.bean.People;
import com.mobile.dao.PeopleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeopleService {

    @Autowired
    PeopleMapper peopleMapper;

    public List<People> getAll(){
        return peopleMapper.selectByExample(null);
    }

}
