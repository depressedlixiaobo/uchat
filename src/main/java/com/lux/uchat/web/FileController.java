package com.lux.uchat.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FileController {
    @RequestMapping("/upload")
    public  String upload(){
        return  "upload";
    }
}
