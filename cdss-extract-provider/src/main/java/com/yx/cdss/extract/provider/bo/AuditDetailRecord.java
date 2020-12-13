package com.yx.cdss.extract.provider.bo;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 开源学社
 ==========================================================================*/

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: AuditDetailRecord
 * @Desc: TODO
 * @history v1.0
 */
@Data
@Document(collection = "audit_detail_record")
public class AuditDetailRecord {
    @Id
    private ObjectId id;
    private String  contentId;
    // 流水号
    private String  serialNumber;
    private Integer nodeStep =0;
    private String  nodeName;
    private Integer maxNodeStep=3;
    private Integer auditStatus;
    private String  auditRemark="--";

    private Long    auditBy;
    private String  auditByName;
    private Integer auditRole;
    private String  auditRoleName;

    private Date auditTime;
    private Date createTime;

}
