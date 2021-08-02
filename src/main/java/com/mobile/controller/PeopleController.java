package com.mobile.controller;

import com.mobile.bean.People;
import com.mobile.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/info")
public class PeopleController {

    @Autowired
    PeopleService peopleService;

    @ResponseBody
    @RequestMapping(value = "/people", method = RequestMethod.GET)
    public List<People> getPeople(){
        List<People> people = peopleService.getAll();
        return people;
    }

}
