package com.al.controller;

import com.al.pojo.Province;
import com.al.service.ProServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * @author 岳岳
 * version  1.0
 */
@Controller
@ResponseBody
public class ProCon {
    @Autowired
    private ProServiceImpl proService;
    @GetMapping("/province/query.do")
    public List<Province> queryProvince(HttpServletResponse response){
        System.out.println("===============");
        response.setHeader("Access-Control-Allow-Origin","*");
        response.setHeader("Access-Control-Allow-Methods","*");
        List<Province> provinces = proService.queryProVince();
        System.out.println("provinces = " + provinces);
        return provinces;
    }

    @GetMapping("/city/query/{pNo}.do")
    public List<Map<String, Object>> queryCity(@PathVariable Integer pNo) {
        return proService.queryCity(pNo);
    }
    public void test(){

    }
}
