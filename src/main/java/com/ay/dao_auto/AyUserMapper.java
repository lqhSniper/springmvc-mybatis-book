package com.ay.dao_auto;

import com.ay.model_auto.AyUser;
import com.ay.model_auto.AyUserExample;
import java.util.List;

public interface AyUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ay_user
     *
     * @mbg.generated
     */
    long countByExample(AyUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ay_user
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ay_user
     *
     * @mbg.generated
     */
    int insert(AyUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ay_user
     *
     * @mbg.generated
     */
    int insertSelective(AyUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ay_user
     *
     * @mbg.generated
     */
    List<AyUser> selectByExample(AyUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ay_user
     *
     * @mbg.generated
     */
    AyUser selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ay_user
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(AyUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ay_user
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(AyUser record);
}