package com.jdbc.service.sluice;

import com.Entity.Sluice;
import com.jdbc.dao.sluice.SluiceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 水闸类的业务类。方法包括增加水闸、删除水闸、修改水闸、
 * 查询水闸、查询所有水闸等。
 */
@Service
public class SluiceService {

    @Autowired
    private SluiceDao sluiceDao;

    /**
     * 增加水闸的方法。
     *
     * @param sluice 要增加的水闸类
     */
    public void addSluice(Sluice sluice) {
        sluiceDao.add(sluice);
    }

    /**
     * 删除水闸的方法。
     *
     * @param id 水闸的编号
     */
    public void deleteSluice(String id) {
        sluiceDao.delete(id);
    }

    /**
     * 修改水闸的方法。
     *
     * @param sluice 要修改的水闸类
     */
    public void updateSluice(Sluice sluice) {
        sluiceDao.update(sluice);
    }

    /**
     * 查询水闸的方法。
     *
     * @param id 水闸的编号
     * @return 查询得到的水闸类
     */
    public Sluice selectSluice(String id) {
        return sluiceDao.select(id);
    }

    /**
     * 查询所有水闸的方法。
     *
     * @return 所有水闸类
     */
    public List<Sluice> selectAllSluice() {
        return sluiceDao.selectAll();
    }
}
