package com.yx.cdss.extract.provider.test;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 开源学社
 ==========================================================================*/

import javax.annotation.sql.DataSourceDefinition;

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: Student
 * @Desc: TODO
 * @history v1.0
 */
public class Student {
    private String id;
    private String name;
    private int age;
    private String addr;
    private ContactInfo contactInfo;

    public Student(){
    }

    public Student(String id, String name, int age, String addr) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.addr = addr;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public Student(String id, String name, int age, String addr, ContactInfo contactInfo) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.addr = addr;
        this.contactInfo = contactInfo;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }
}
