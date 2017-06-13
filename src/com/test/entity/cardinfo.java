package com.test.entity;


import javax.persistence.Table;


/**
 * Created by zhengxh on 2017/6/8.
 */
@Table(name = "cardinfo_copy")
public class Cardinfo {
    private Integer id;
    private byte[] photo;
    private Integer ver;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public Integer getVer() {
        return ver;
    }

    public void setVer(Integer ver) {
        this.ver = ver;
    }
}
