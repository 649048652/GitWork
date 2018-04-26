package com.test.DAOTest;

import com.test.USER.EMP;

public interface EMPMapper {
    int deleteByPrimaryKey(Integer empno);

    int insertSelective(EMP record);
    
    EMP selectByPrimaryKey(Integer empno);

    int updateByPrimaryKeySelective(EMP record);
}