package com.group.dao;

import com.group.pojo.Borrowbooks;

import java.util.List;

public interface BorrowbooksMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Borrowbooks record);

    int insertSelective(Borrowbooks record);

    Borrowbooks selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Borrowbooks record);

    int updateByPrimaryKey(Borrowbooks record);

    int select(Integer userid);

    Borrowbooks selectByid(Integer bookid);

    List<Borrowbooks> selectBtuseid(Integer userid);
}