package com.yx.cdss.extract.model.entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table medical_orders_execute_plan
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class MedicalOrdersExecutePlan implements Serializable {
    /**
     * Database Column Remarks:
     *   主键ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column medical_orders_execute_plan.moep_id
     *
     * @mbg.generated
     */
    private Long moepId;

    /**
     * Database Column Remarks:
     *   住院�?
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column medical_orders_execute_plan.admission_number
     *
     * @mbg.generated
     */
    private String admissionNumber;

    /**
     * Database Column Remarks:
     *   患�?�ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column medical_orders_execute_plan.patient_id
     *
     * @mbg.generated
     */
    private String patientId;

    /**
     * Database Column Remarks:
     *   医嘱ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column medical_orders_execute_plan.medical_orders_id
     *
     * @mbg.generated
     */
    private String medicalOrdersId;

    /**
     * Database Column Remarks:
     *   计划ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column medical_orders_execute_plan.plan_id
     *
     * @mbg.generated
     */
    private String planId;

    /**
     * Database Column Remarks:
     *   计划时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column medical_orders_execute_plan.plan_time
     *
     * @mbg.generated
     */
    private Date planTime;

    /**
     * Database Column Remarks:
     *   执行时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column medical_orders_execute_plan.execute_time
     *
     * @mbg.generated
     */
    private Date executeTime;

    /**
     * Database Column Remarks:
     *   执行状�??(0-待执�?,1-执行�?,2-已执�?)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column medical_orders_execute_plan.execute_status
     *
     * @mbg.generated
     */
    private Integer executeStatus;

    /**
     * Database Column Remarks:
     *   执行�?
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column medical_orders_execute_plan.execute_man
     *
     * @mbg.generated
     */
    private String executeMan;

    /**
     * Database Column Remarks:
     *   执行人编�?
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column medical_orders_execute_plan.execute_man_code
     *
     * @mbg.generated
     */
    private String executeManCode;

    /**
     * Database Column Remarks:
     *   �?属医院编�?
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column medical_orders_execute_plan.hospital_code
     *
     * @mbg.generated
     */
    private String hospitalCode;

    /**
     * Database Column Remarks:
     *   抽取时间,数据同步�?
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column medical_orders_execute_plan.extract_time
     *
     * @mbg.generated
     */
    private Date extractTime;

    /**
     * Database Column Remarks:
     *   记录状�??:1-进行�?,2-完成
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column medical_orders_execute_plan.record_status
     *
     * @mbg.generated
     */
    private Integer recordStatus;

    /**
     * Database Column Remarks:
     *   预留字段1
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column medical_orders_execute_plan.attribute1
     *
     * @mbg.generated
     */
    private String attribute1;

    /**
     * Database Column Remarks:
     *   预留字段2
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column medical_orders_execute_plan.attribute2
     *
     * @mbg.generated
     */
    private String attribute2;

    /**
     * Database Column Remarks:
     *   预留字段3
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column medical_orders_execute_plan.attribute3
     *
     * @mbg.generated
     */
    private String attribute3;

    /**
     * Database Column Remarks:
     *   预留字段4
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column medical_orders_execute_plan.attribute4
     *
     * @mbg.generated
     */
    private String attribute4;

    /**
     * Database Column Remarks:
     *   预留字段5
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column medical_orders_execute_plan.attribute5
     *
     * @mbg.generated
     */
    private String attribute5;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table medical_orders_execute_plan
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column medical_orders_execute_plan.moep_id
     *
     * @return the value of medical_orders_execute_plan.moep_id
     *
     * @mbg.generated
     */
    public Long getMoepId() {
        return moepId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column medical_orders_execute_plan.moep_id
     *
     * @param moepId the value for medical_orders_execute_plan.moep_id
     *
     * @mbg.generated
     */
    public void setMoepId(Long moepId) {
        this.moepId = moepId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column medical_orders_execute_plan.admission_number
     *
     * @return the value of medical_orders_execute_plan.admission_number
     *
     * @mbg.generated
     */
    public String getAdmissionNumber() {
        return admissionNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column medical_orders_execute_plan.admission_number
     *
     * @param admissionNumber the value for medical_orders_execute_plan.admission_number
     *
     * @mbg.generated
     */
    public void setAdmissionNumber(String admissionNumber) {
        this.admissionNumber = admissionNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column medical_orders_execute_plan.patient_id
     *
     * @return the value of medical_orders_execute_plan.patient_id
     *
     * @mbg.generated
     */
    public String getPatientId() {
        return patientId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column medical_orders_execute_plan.patient_id
     *
     * @param patientId the value for medical_orders_execute_plan.patient_id
     *
     * @mbg.generated
     */
    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column medical_orders_execute_plan.medical_orders_id
     *
     * @return the value of medical_orders_execute_plan.medical_orders_id
     *
     * @mbg.generated
     */
    public String getMedicalOrdersId() {
        return medicalOrdersId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column medical_orders_execute_plan.medical_orders_id
     *
     * @param medicalOrdersId the value for medical_orders_execute_plan.medical_orders_id
     *
     * @mbg.generated
     */
    public void setMedicalOrdersId(String medicalOrdersId) {
        this.medicalOrdersId = medicalOrdersId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column medical_orders_execute_plan.plan_id
     *
     * @return the value of medical_orders_execute_plan.plan_id
     *
     * @mbg.generated
     */
    public String getPlanId() {
        return planId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column medical_orders_execute_plan.plan_id
     *
     * @param planId the value for medical_orders_execute_plan.plan_id
     *
     * @mbg.generated
     */
    public void setPlanId(String planId) {
        this.planId = planId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column medical_orders_execute_plan.plan_time
     *
     * @return the value of medical_orders_execute_plan.plan_time
     *
     * @mbg.generated
     */
    public Date getPlanTime() {
        return planTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column medical_orders_execute_plan.plan_time
     *
     * @param planTime the value for medical_orders_execute_plan.plan_time
     *
     * @mbg.generated
     */
    public void setPlanTime(Date planTime) {
        this.planTime = planTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column medical_orders_execute_plan.execute_time
     *
     * @return the value of medical_orders_execute_plan.execute_time
     *
     * @mbg.generated
     */
    public Date getExecuteTime() {
        return executeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column medical_orders_execute_plan.execute_time
     *
     * @param executeTime the value for medical_orders_execute_plan.execute_time
     *
     * @mbg.generated
     */
    public void setExecuteTime(Date executeTime) {
        this.executeTime = executeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column medical_orders_execute_plan.execute_status
     *
     * @return the value of medical_orders_execute_plan.execute_status
     *
     * @mbg.generated
     */
    public Integer getExecuteStatus() {
        return executeStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column medical_orders_execute_plan.execute_status
     *
     * @param executeStatus the value for medical_orders_execute_plan.execute_status
     *
     * @mbg.generated
     */
    public void setExecuteStatus(Integer executeStatus) {
        this.executeStatus = executeStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column medical_orders_execute_plan.execute_man
     *
     * @return the value of medical_orders_execute_plan.execute_man
     *
     * @mbg.generated
     */
    public String getExecuteMan() {
        return executeMan;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column medical_orders_execute_plan.execute_man
     *
     * @param executeMan the value for medical_orders_execute_plan.execute_man
     *
     * @mbg.generated
     */
    public void setExecuteMan(String executeMan) {
        this.executeMan = executeMan;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column medical_orders_execute_plan.execute_man_code
     *
     * @return the value of medical_orders_execute_plan.execute_man_code
     *
     * @mbg.generated
     */
    public String getExecuteManCode() {
        return executeManCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column medical_orders_execute_plan.execute_man_code
     *
     * @param executeManCode the value for medical_orders_execute_plan.execute_man_code
     *
     * @mbg.generated
     */
    public void setExecuteManCode(String executeManCode) {
        this.executeManCode = executeManCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column medical_orders_execute_plan.hospital_code
     *
     * @return the value of medical_orders_execute_plan.hospital_code
     *
     * @mbg.generated
     */
    public String getHospitalCode() {
        return hospitalCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column medical_orders_execute_plan.hospital_code
     *
     * @param hospitalCode the value for medical_orders_execute_plan.hospital_code
     *
     * @mbg.generated
     */
    public void setHospitalCode(String hospitalCode) {
        this.hospitalCode = hospitalCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column medical_orders_execute_plan.extract_time
     *
     * @return the value of medical_orders_execute_plan.extract_time
     *
     * @mbg.generated
     */
    public Date getExtractTime() {
        return extractTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column medical_orders_execute_plan.extract_time
     *
     * @param extractTime the value for medical_orders_execute_plan.extract_time
     *
     * @mbg.generated
     */
    public void setExtractTime(Date extractTime) {
        this.extractTime = extractTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column medical_orders_execute_plan.record_status
     *
     * @return the value of medical_orders_execute_plan.record_status
     *
     * @mbg.generated
     */
    public Integer getRecordStatus() {
        return recordStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column medical_orders_execute_plan.record_status
     *
     * @param recordStatus the value for medical_orders_execute_plan.record_status
     *
     * @mbg.generated
     */
    public void setRecordStatus(Integer recordStatus) {
        this.recordStatus = recordStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column medical_orders_execute_plan.attribute1
     *
     * @return the value of medical_orders_execute_plan.attribute1
     *
     * @mbg.generated
     */
    public String getAttribute1() {
        return attribute1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column medical_orders_execute_plan.attribute1
     *
     * @param attribute1 the value for medical_orders_execute_plan.attribute1
     *
     * @mbg.generated
     */
    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column medical_orders_execute_plan.attribute2
     *
     * @return the value of medical_orders_execute_plan.attribute2
     *
     * @mbg.generated
     */
    public String getAttribute2() {
        return attribute2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column medical_orders_execute_plan.attribute2
     *
     * @param attribute2 the value for medical_orders_execute_plan.attribute2
     *
     * @mbg.generated
     */
    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column medical_orders_execute_plan.attribute3
     *
     * @return the value of medical_orders_execute_plan.attribute3
     *
     * @mbg.generated
     */
    public String getAttribute3() {
        return attribute3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column medical_orders_execute_plan.attribute3
     *
     * @param attribute3 the value for medical_orders_execute_plan.attribute3
     *
     * @mbg.generated
     */
    public void setAttribute3(String attribute3) {
        this.attribute3 = attribute3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column medical_orders_execute_plan.attribute4
     *
     * @return the value of medical_orders_execute_plan.attribute4
     *
     * @mbg.generated
     */
    public String getAttribute4() {
        return attribute4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column medical_orders_execute_plan.attribute4
     *
     * @param attribute4 the value for medical_orders_execute_plan.attribute4
     *
     * @mbg.generated
     */
    public void setAttribute4(String attribute4) {
        this.attribute4 = attribute4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column medical_orders_execute_plan.attribute5
     *
     * @return the value of medical_orders_execute_plan.attribute5
     *
     * @mbg.generated
     */
    public String getAttribute5() {
        return attribute5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column medical_orders_execute_plan.attribute5
     *
     * @param attribute5 the value for medical_orders_execute_plan.attribute5
     *
     * @mbg.generated
     */
    public void setAttribute5(String attribute5) {
        this.attribute5 = attribute5;
    }
}