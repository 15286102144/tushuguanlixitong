package com.group.service.impl;

import com.group.dao.BorrowbooksMapper;
import com.group.pojo.Borrowbooks;
import com.group.service.BorrowbooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BorrowbooksServiceImpl implements BorrowbooksService {
    @Autowired
    BorrowbooksMapper dao;
    public int add(Borrowbooks borrowbooks) {
        return dao.insertSelective(borrowbooks);
    }

    public int select(Integer userid) {
        return dao.select(userid);
    }

    public Borrowbooks selectbyid(Integer bookid) {
        return dao.selectByid(bookid);
    }

    public List<Borrowbooks> selectByuserid(Integer userid) {
        return dao.selectBtuseid(userid);
    }

    public int updateBybookid(Borrowbooks borrowbooks) {
        return dao.updateByPrimaryKeySelective(borrowbooks);
    }

    public Borrowbooks selectByid(Integer bookid) {
        return dao.selectByPrimaryKey(bookid);
    }

}
