package com.test.service;

import com.test.dao.IndexMenuDao;
import com.test.entity.IndexMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2017/6/7.
 * 主页菜单服务类
 */
@Service
@Transactional
public class IndexMenuService {
    @Autowired
    private IndexMenuDao indexMenuDao;

    public int getId() {
        return indexMenuDao.selectId();
    }

    public IndexMenu getAll() {
        return indexMenuDao.getAll();
    }

    public List<IndexMenu> getParentMenu() {
        return indexMenuDao.getParentMenu();
    }

    public List<IndexMenu> getChildrenMenu(Long parentId) {
        return indexMenuDao.getChildrenMenu(parentId);
    }
}
