package com.test.entity;

import javax.persistence.*;

/**
 * Created by zhengxh on 2017/6/7.
 */
@Table(name = "menu")
public class IndexMenu extends BaseEntity{

    //菜单名称
    @Column(name = "name")
    private  String name;
    //跳转链接
    @Column(name="link")
    private String link;
    //父菜单Id
    @Column(name="parent_id")
    private Long parentId;
    //排序
    @Column(name="sort")
    private Integer sort;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Long getParentId() {
        return parentId;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }
}
