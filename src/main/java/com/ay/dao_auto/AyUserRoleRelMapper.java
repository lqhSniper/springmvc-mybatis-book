package com.ay.dao_auto;

import com.ay.model_auto.AyUserRoleRel;
import com.ay.model_auto.AyUserRoleRelExample;
import java.util.List;

public interface AyUserRoleRelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ay_user_role_rel
     *
     * @mbg.generated
     */
    long countByExample(AyUserRoleRelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ay_user_role_rel
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ay_user_role_rel
     *
     * @mbg.generated
     */
    int insert(AyUserRoleRel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ay_user_role_rel
     *
     * @mbg.generated
     */
    int insertSelective(AyUserRoleRel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ay_user_role_rel
     *
     * @mbg.generated
     */
    List<AyUserRoleRel> selectByExample(AyUserRoleRelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ay_user_role_rel
     *
     * @mbg.generated
     */
    AyUserRoleRel selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ay_user_role_rel
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(AyUserRoleRel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ay_user_role_rel
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(AyUserRoleRel record);
}