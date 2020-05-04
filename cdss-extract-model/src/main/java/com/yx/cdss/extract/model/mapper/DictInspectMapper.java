package com.yx.cdss.extract.model.mapper;

import com.yx.cdss.extract.model.entity.DictInspect;
import com.yx.cdss.extract.model.entity.DictInspectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictInspectMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_inspect
     *
     * @mbg.generated
     */
    long countByExample(DictInspectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_inspect
     *
     * @mbg.generated
     */
    int deleteByExample(DictInspectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_inspect
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long diId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_inspect
     *
     * @mbg.generated
     */
    int insert(DictInspect record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_inspect
     *
     * @mbg.generated
     */
    int insertSelective(DictInspect record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_inspect
     *
     * @mbg.generated
     */
    List<DictInspect> selectByExample(DictInspectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_inspect
     *
     * @mbg.generated
     */
    DictInspect selectByPrimaryKey(Long diId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_inspect
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") DictInspect record, @Param("example") DictInspectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_inspect
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") DictInspect record, @Param("example") DictInspectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_inspect
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(DictInspect record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_inspect
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DictInspect record);
}