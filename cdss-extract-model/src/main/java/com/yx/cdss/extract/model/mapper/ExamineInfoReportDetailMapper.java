package com.yx.cdss.extract.model.mapper;

import com.yx.cdss.extract.model.entity.ExamineInfoReportDetail;
import com.yx.cdss.extract.model.entity.ExamineInfoReportDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExamineInfoReportDetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table examine_info_report_detail
     *
     * @mbg.generated
     */
    long countByExample(ExamineInfoReportDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table examine_info_report_detail
     *
     * @mbg.generated
     */
    int deleteByExample(ExamineInfoReportDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table examine_info_report_detail
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long eirdId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table examine_info_report_detail
     *
     * @mbg.generated
     */
    int insert(ExamineInfoReportDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table examine_info_report_detail
     *
     * @mbg.generated
     */
    int insertSelective(ExamineInfoReportDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table examine_info_report_detail
     *
     * @mbg.generated
     */
    List<ExamineInfoReportDetail> selectByExample(ExamineInfoReportDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table examine_info_report_detail
     *
     * @mbg.generated
     */
    ExamineInfoReportDetail selectByPrimaryKey(Long eirdId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table examine_info_report_detail
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ExamineInfoReportDetail record, @Param("example") ExamineInfoReportDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table examine_info_report_detail
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ExamineInfoReportDetail record, @Param("example") ExamineInfoReportDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table examine_info_report_detail
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ExamineInfoReportDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table examine_info_report_detail
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ExamineInfoReportDetail record);
}