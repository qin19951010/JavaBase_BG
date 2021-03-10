package com.jiangnanyidianyu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
//@Controller
public class helloJWT {

    @GetMapping("/{id}")
    public String hello(@PathVariable String id)
    {
        return "Hello SpringBoot,its about " + id;
    }

    @GetMapping("/getByid")
    private Map<String, Object> getbyid(@RequestParam(value="id", required=true) int idnum,
                                        @RequestParam(value="idno", required=true) String idno,
                                        @RequestParam(value="idname", required=true) String idname){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("idnum", idnum);
        modelMap.put("idno", idno);
        modelMap.put("idname", idname);

        return modelMap;
    }
}
