package com.yx.cdss.extract.model.mapper;

import com.yx.cdss.extract.model.entity.DrugMedicaLordersDetail;
import com.yx.cdss.extract.model.entity.DrugMedicaLordersDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DrugMedicaLordersDetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drug_medica_lorders_detail
     *
     * @mbg.generated
     */
    long countByExample(DrugMedicaLordersDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drug_medica_lorders_detail
     *
     * @mbg.generated
     */
    int deleteByExample(DrugMedicaLordersDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drug_medica_lorders_detail
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long dmld);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drug_medica_lorders_detail
     *
     * @mbg.generated
     */
    int insert(DrugMedicaLordersDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drug_medica_lorders_detail
     *
     * @mbg.generated
     */
    int insertSelective(DrugMedicaLordersDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drug_medica_lorders_detail
     *
     * @mbg.generated
     */
    List<DrugMedicaLordersDetail> selectByExample(DrugMedicaLordersDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drug_medica_lorders_detail
     *
     * @mbg.generated
     */
    DrugMedicaLordersDetail selectByPrimaryKey(Long dmld);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drug_medica_lorders_detail
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") DrugMedicaLordersDetail record, @Param("example") DrugMedicaLordersDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drug_medica_lorders_detail
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") DrugMedicaLordersDetail record, @Param("example") DrugMedicaLordersDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drug_medica_lorders_detail
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(DrugMedicaLordersDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drug_medica_lorders_detail
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DrugMedicaLordersDetail record);
}