package com.yx.cdss.extract.model.entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table dict_physiotherapy
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class DictPhysiotherapy implements Serializable {
    /**
     * Database Column Remarks:
     *   主键ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_physiotherapy.dp_id
     *
     * @mbg.generated
     */
    private Long dpId;

    /**
     * Database Column Remarks:
     *   理疗名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_physiotherapy.phys_name
     *
     * @mbg.generated
     */
    private String physName;

    /**
     * Database Column Remarks:
     *   理疗编码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_physiotherapy.phys_code
     *
     * @mbg.generated
     */
    private String physCode;

    /**
     * Database Column Remarks:
     *   抽取时间,数据同步�?
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_physiotherapy.extract_time
     *
     * @mbg.generated
     */
    private Date extractTime;

    /**
     * Database Column Remarks:
     *   预留字段1
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_physiotherapy.attribute1
     *
     * @mbg.generated
     */
    private String attribute1;

    /**
     * Database Column Remarks:
     *   预留字段2
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_physiotherapy.attribute2
     *
     * @mbg.generated
     */
    private String attribute2;

    /**
     * Database Column Remarks:
     *   预留字段3
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_physiotherapy.attribute3
     *
     * @mbg.generated
     */
    private String attribute3;

    /**
     * Database Column Remarks:
     *   预留字段4
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_physiotherapy.attribute4
     *
     * @mbg.generated
     */
    private String attribute4;

    /**
     * Database Column Remarks:
     *   预留字段5
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_physiotherapy.attribute5
     *
     * @mbg.generated
     */
    private String attribute5;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dict_physiotherapy
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_physiotherapy.dp_id
     *
     * @return the value of dict_physiotherapy.dp_id
     *
     * @mbg.generated
     */
    public Long getDpId() {
        return dpId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_physiotherapy.dp_id
     *
     * @param dpId the value for dict_physiotherapy.dp_id
     *
     * @mbg.generated
     */
    public void setDpId(Long dpId) {
        this.dpId = dpId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_physiotherapy.phys_name
     *
     * @return the value of dict_physiotherapy.phys_name
     *
     * @mbg.generated
     */
    public String getPhysName() {
        return physName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_physiotherapy.phys_name
     *
     * @param physName the value for dict_physiotherapy.phys_name
     *
     * @mbg.generated
     */
    public void setPhysName(String physName) {
        this.physName = physName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_physiotherapy.phys_code
     *
     * @return the value of dict_physiotherapy.phys_code
     *
     * @mbg.generated
     */
    public String getPhysCode() {
        return physCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_physiotherapy.phys_code
     *
     * @param physCode the value for dict_physiotherapy.phys_code
     *
     * @mbg.generated
     */
    public void setPhysCode(String physCode) {
        this.physCode = physCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_physiotherapy.extract_time
     *
     * @return the value of dict_physiotherapy.extract_time
     *
     * @mbg.generated
     */
    public Date getExtractTime() {
        return extractTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_physiotherapy.extract_time
     *
     * @param extractTime the value for dict_physiotherapy.extract_time
     *
     * @mbg.generated
     */
    public void setExtractTime(Date extractTime) {
        this.extractTime = extractTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_physiotherapy.attribute1
     *
     * @return the value of dict_physiotherapy.attribute1
     *
     * @mbg.generated
     */
    public String getAttribute1() {
        return attribute1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_physiotherapy.attribute1
     *
     * @param attribute1 the value for dict_physiotherapy.attribute1
     *
     * @mbg.generated
     */
    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_physiotherapy.attribute2
     *
     * @return the value of dict_physiotherapy.attribute2
     *
     * @mbg.generated
     */
    public String getAttribute2() {
        return attribute2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_physiotherapy.attribute2
     *
     * @param attribute2 the value for dict_physiotherapy.attribute2
     *
     * @mbg.generated
     */
    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_physiotherapy.attribute3
     *
     * @return the value of dict_physiotherapy.attribute3
     *
     * @mbg.generated
     */
    public String getAttribute3() {
        return attribute3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_physiotherapy.attribute3
     *
     * @param attribute3 the value for dict_physiotherapy.attribute3
     *
     * @mbg.generated
     */
    public void setAttribute3(String attribute3) {
        this.attribute3 = attribute3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_physiotherapy.attribute4
     *
     * @return the value of dict_physiotherapy.attribute4
     *
     * @mbg.generated
     */
    public String getAttribute4() {
        return attribute4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_physiotherapy.attribute4
     *
     * @param attribute4 the value for dict_physiotherapy.attribute4
     *
     * @mbg.generated
     */
    public void setAttribute4(String attribute4) {
        this.attribute4 = attribute4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_physiotherapy.attribute5
     *
     * @return the value of dict_physiotherapy.attribute5
     *
     * @mbg.generated
     */
    public String getAttribute5() {
        return attribute5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_physiotherapy.attribute5
     *
     * @param attribute5 the value for dict_physiotherapy.attribute5
     *
     * @mbg.generated
     */
    public void setAttribute5(String attribute5) {
        this.attribute5 = attribute5;
    }
}