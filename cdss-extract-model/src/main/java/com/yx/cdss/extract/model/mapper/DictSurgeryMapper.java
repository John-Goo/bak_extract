package com.yx.cdss.extract.model.mapper;

import com.yx.cdss.extract.model.entity.DictSurgery;
import com.yx.cdss.extract.model.entity.DictSurgeryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DictSurgeryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_surgery
     *
     * @mbg.generated
     */
    long countByExample(DictSurgeryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_surgery
     *
     * @mbg.generated
     */
    int deleteByExample(DictSurgeryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_surgery
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long dsId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_surgery
     *
     * @mbg.generated
     */
    int insert(DictSurgery record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_surgery
     *
     * @mbg.generated
     */
    int insertSelective(DictSurgery record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_surgery
     *
     * @mbg.generated
     */
    List<DictSurgery> selectByExample(DictSurgeryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_surgery
     *
     * @mbg.generated
     */
    DictSurgery selectByPrimaryKey(Long dsId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_surgery
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") DictSurgery record, @Param("example") DictSurgeryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_surgery
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") DictSurgery record, @Param("example") DictSurgeryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_surgery
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(DictSurgery record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_surgery
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DictSurgery record);
}