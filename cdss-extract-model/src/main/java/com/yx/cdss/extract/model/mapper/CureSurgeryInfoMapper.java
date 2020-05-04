package com.yx.cdss.extract.model.mapper;

import com.yx.cdss.extract.model.entity.CureSurgeryInfo;
import com.yx.cdss.extract.model.entity.CureSurgeryInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CureSurgeryInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cure_surgery_info
     *
     * @mbg.generated
     */
    long countByExample(CureSurgeryInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cure_surgery_info
     *
     * @mbg.generated
     */
    int deleteByExample(CureSurgeryInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cure_surgery_info
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long csrId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cure_surgery_info
     *
     * @mbg.generated
     */
    int insert(CureSurgeryInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cure_surgery_info
     *
     * @mbg.generated
     */
    int insertSelective(CureSurgeryInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cure_surgery_info
     *
     * @mbg.generated
     */
    List<CureSurgeryInfo> selectByExample(CureSurgeryInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cure_surgery_info
     *
     * @mbg.generated
     */
    CureSurgeryInfo selectByPrimaryKey(Long csrId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cure_surgery_info
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") CureSurgeryInfo record, @Param("example") CureSurgeryInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cure_surgery_info
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") CureSurgeryInfo record, @Param("example") CureSurgeryInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cure_surgery_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CureSurgeryInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cure_surgery_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(CureSurgeryInfo record);
}