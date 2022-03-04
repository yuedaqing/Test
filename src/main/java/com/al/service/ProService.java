package com.al.service;

import com.al.pojo.Province;

import java.util.List;
import java.util.Map;

/**
 * @author 岳岳
 * version  1.0
 */
public interface ProService {
    List<Province> queryProVince();
    List<Map<String,Object>> queryCity(Integer pNo);

}
