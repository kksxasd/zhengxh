package com.test.service;

import com.test.dao.CardinfoDao;
import com.test.entity.Cardinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by zhengxh on 2017/6/8.
 */
@Service
@Transactional
public class CardinfoServcie {
    @Autowired
    private CardinfoDao cardinfoDao;

    public List<Cardinfo> getPhone(){
        return cardinfoDao.getPhone();
    }

    public void setPhoto(byte[] photo){
        cardinfoDao.setPhoto(photo);
    }
}
