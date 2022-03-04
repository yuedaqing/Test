package com.al.dao;

import com.al.pojo.Province;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @author 岳岳
 * version  1.0
 */
public interface ProDao {
    @Select("select * from province")
    List<Province> queryProVince();
    @Select("select * from city where pno=#{pNo}")
    List<Map<String,Object>> queryCity(Integer pNo);
}
