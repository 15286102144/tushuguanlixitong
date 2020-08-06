package com.group.service;

import com.group.pojo.Borrowbooks;

import java.util.List;

public interface BorrowbooksService {
    int add(Borrowbooks borrowbooks);

    int select(Integer userid);

    Borrowbooks selectbyid(Integer bookid);

    List<Borrowbooks> selectByuserid(Integer userid);

    int updateBybookid(Borrowbooks borrowbooks);
}
