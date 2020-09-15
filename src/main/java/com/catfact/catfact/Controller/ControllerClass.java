package com.catfact.catfact.Controller;

import com.catfact.catfact.Service.CatService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerClass {
    private String text;

    CatService cat = new CatService();

    @RequestMapping(value = "/")
    @ResponseBody
    public String frontPage() {
        return "Welcome to our application. In here you will find all sorts of info on cats";
    }

    @GetMapping("/getSingle")
    @ResponseBody
    public String getSingle() {
        return text;
    }

    @GetMapping("/GetTen")
    @ResponseBody
    public String getTen() {
        return text;
    }

    public String getTenSortByDate() {
        return text;
    }

    @GetMapping("/contains")
    @ResponseBody
    public String getContains() {
        return text;
    }

}
