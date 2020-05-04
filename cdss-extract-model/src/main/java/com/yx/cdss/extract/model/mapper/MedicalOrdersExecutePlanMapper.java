package com.yx.cdss.extract.model.mapper;

import com.yx.cdss.extract.model.entity.MedicalOrdersExecutePlan;
import com.yx.cdss.extract.model.entity.MedicalOrdersExecutePlanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MedicalOrdersExecutePlanMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table medical_orders_execute_plan
     *
     * @mbg.generated
     */
    long countByExample(MedicalOrdersExecutePlanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table medical_orders_execute_plan
     *
     * @mbg.generated
     */
    int deleteByExample(MedicalOrdersExecutePlanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table medical_orders_execute_plan
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long moepId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table medical_orders_execute_plan
     *
     * @mbg.generated
     */
    int insert(MedicalOrdersExecutePlan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table medical_orders_execute_plan
     *
     * @mbg.generated
     */
    int insertSelective(MedicalOrdersExecutePlan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table medical_orders_execute_plan
     *
     * @mbg.generated
     */
    List<MedicalOrdersExecutePlan> selectByExample(MedicalOrdersExecutePlanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table medical_orders_execute_plan
     *
     * @mbg.generated
     */
    MedicalOrdersExecutePlan selectByPrimaryKey(Long moepId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table medical_orders_execute_plan
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") MedicalOrdersExecutePlan record, @Param("example") MedicalOrdersExecutePlanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table medical_orders_execute_plan
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") MedicalOrdersExecutePlan record, @Param("example") MedicalOrdersExecutePlanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table medical_orders_execute_plan
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(MedicalOrdersExecutePlan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table medical_orders_execute_plan
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(MedicalOrdersExecutePlan record);
}