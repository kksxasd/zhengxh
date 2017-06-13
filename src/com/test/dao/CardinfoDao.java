package com.test.dao;

import com.test.entity.Cardinfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by zhengxh on 2017/6/8.
 */
@Repository
public interface CardinfoDao {
    List<Cardinfo> getPhone();
    void setPhoto(@Param("photo") byte[] photo);
}
