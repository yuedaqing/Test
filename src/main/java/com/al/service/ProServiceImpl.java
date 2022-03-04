package com.al.service;

import com.al.dao.ProDao;
import com.al.pojo.Province;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author 岳岳
 * version  1.0
 */
@Service
public class ProServiceImpl implements ProService {
    @Autowired
    private ProDao proDao;

    @Override
    public List<Province> queryProVince() {
        List<Province> provinceList = proDao.queryProVince();
        return provinceList;
    }

    @Override
    public List<Map<String, Object>> queryCity(Integer pNo) {
        List<Map<String, Object>> maps = proDao.queryCity(pNo);
        return maps;
    }
}

