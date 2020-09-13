package com.catfact.catfact.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class EndPoints {
    private String text;

    @GetMapping("/")
    @ResponseBody
    public String frontPage() {
        return text;
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
