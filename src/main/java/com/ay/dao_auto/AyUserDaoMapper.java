package com.ay.dao_auto;

import com.ay.model_auto.AyUserDao;
import com.ay.model_auto.AyUserDaoExample;
import java.util.List;

public interface AyUserDaoMapper {
    long countByExample(AyUserDaoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AyUserDao record);

    int insertSelective(AyUserDao record);

    List<AyUserDao> selectByExample(AyUserDaoExample example);

    AyUserDao selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AyUserDao record);

    int updateByPrimaryKey(AyUserDao record);
}