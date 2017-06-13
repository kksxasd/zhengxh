package com.test.dao;

import com.test.entity.IndexMenu;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by zhengxh on 2017/6/7.
 * 主页菜单
 */
@Repository
public interface IndexMenuDao {
    int selectId();

    IndexMenu getAll();

    List<IndexMenu> getParentMenu();

    List<IndexMenu> getChildrenMenu(@Param("parentId") Long parentId);
}
