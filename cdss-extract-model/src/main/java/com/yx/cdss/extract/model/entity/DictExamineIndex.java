package com.yx.cdss.extract.model.entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table dict_examine_index
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class DictExamineIndex implements Serializable {
    /**
     * Database Column Remarks:
     *   主键ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_examine_index.dei_id
     *
     * @mbg.generated
     */
    private Long deiId;

    /**
     * Database Column Remarks:
     *   指标名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_examine_index.index_name
     *
     * @mbg.generated
     */
    private String indexName;

    /**
     * Database Column Remarks:
     *   指标编码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_examine_index.index_code
     *
     * @mbg.generated
     */
    private String indexCode;

    /**
     * Database Column Remarks:
     *   抽取时间,数据同步�?
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_examine_index.extract_time
     *
     * @mbg.generated
     */
    private Date extractTime;

    /**
     * Database Column Remarks:
     *   预留字段1
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_examine_index.attribute1
     *
     * @mbg.generated
     */
    private String attribute1;

    /**
     * Database Column Remarks:
     *   预留字段2
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_examine_index.attribute2
     *
     * @mbg.generated
     */
    private String attribute2;

    /**
     * Database Column Remarks:
     *   预留字段3
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_examine_index.attribute3
     *
     * @mbg.generated
     */
    private String attribute3;

    /**
     * Database Column Remarks:
     *   预留字段4
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_examine_index.attribute4
     *
     * @mbg.generated
     */
    private String attribute4;

    /**
     * Database Column Remarks:
     *   预留字段5
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_examine_index.attribute5
     *
     * @mbg.generated
     */
    private String attribute5;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dict_examine_index
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_examine_index.dei_id
     *
     * @return the value of dict_examine_index.dei_id
     *
     * @mbg.generated
     */
    public Long getDeiId() {
        return deiId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_examine_index.dei_id
     *
     * @param deiId the value for dict_examine_index.dei_id
     *
     * @mbg.generated
     */
    public void setDeiId(Long deiId) {
        this.deiId = deiId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_examine_index.index_name
     *
     * @return the value of dict_examine_index.index_name
     *
     * @mbg.generated
     */
    public String getIndexName() {
        return indexName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_examine_index.index_name
     *
     * @param indexName the value for dict_examine_index.index_name
     *
     * @mbg.generated
     */
    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_examine_index.index_code
     *
     * @return the value of dict_examine_index.index_code
     *
     * @mbg.generated
     */
    public String getIndexCode() {
        return indexCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_examine_index.index_code
     *
     * @param indexCode the value for dict_examine_index.index_code
     *
     * @mbg.generated
     */
    public void setIndexCode(String indexCode) {
        this.indexCode = indexCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_examine_index.extract_time
     *
     * @return the value of dict_examine_index.extract_time
     *
     * @mbg.generated
     */
    public Date getExtractTime() {
        return extractTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_examine_index.extract_time
     *
     * @param extractTime the value for dict_examine_index.extract_time
     *
     * @mbg.generated
     */
    public void setExtractTime(Date extractTime) {
        this.extractTime = extractTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_examine_index.attribute1
     *
     * @return the value of dict_examine_index.attribute1
     *
     * @mbg.generated
     */
    public String getAttribute1() {
        return attribute1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_examine_index.attribute1
     *
     * @param attribute1 the value for dict_examine_index.attribute1
     *
     * @mbg.generated
     */
    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_examine_index.attribute2
     *
     * @return the value of dict_examine_index.attribute2
     *
     * @mbg.generated
     */
    public String getAttribute2() {
        return attribute2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_examine_index.attribute2
     *
     * @param attribute2 the value for dict_examine_index.attribute2
     *
     * @mbg.generated
     */
    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_examine_index.attribute3
     *
     * @return the value of dict_examine_index.attribute3
     *
     * @mbg.generated
     */
    public String getAttribute3() {
        return attribute3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_examine_index.attribute3
     *
     * @param attribute3 the value for dict_examine_index.attribute3
     *
     * @mbg.generated
     */
    public void setAttribute3(String attribute3) {
        this.attribute3 = attribute3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_examine_index.attribute4
     *
     * @return the value of dict_examine_index.attribute4
     *
     * @mbg.generated
     */
    public String getAttribute4() {
        return attribute4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_examine_index.attribute4
     *
     * @param attribute4 the value for dict_examine_index.attribute4
     *
     * @mbg.generated
     */
    public void setAttribute4(String attribute4) {
        this.attribute4 = attribute4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_examine_index.attribute5
     *
     * @return the value of dict_examine_index.attribute5
     *
     * @mbg.generated
     */
    public String getAttribute5() {
        return attribute5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_examine_index.attribute5
     *
     * @param attribute5 the value for dict_examine_index.attribute5
     *
     * @mbg.generated
     */
    public void setAttribute5(String attribute5) {
        this.attribute5 = attribute5;
    }
}