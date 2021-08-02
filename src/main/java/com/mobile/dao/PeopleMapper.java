package com.mobile.dao;

import com.mobile.bean.People;
import com.mobile.bean.PeopleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PeopleMapper {
    long countByExample(PeopleExample example);

    int deleteByExample(PeopleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(People record);

    int insertSelective(People record);

    List<People> selectByExample(PeopleExample example);

    People selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") People record, @Param("example") PeopleExample example);

    int updateByExample(@Param("record") People record, @Param("example") PeopleExample example);

    int updateByPrimaryKeySelective(People record);

    int updateByPrimaryKey(People record);
}