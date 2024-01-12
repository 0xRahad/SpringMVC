package com.example.springmvc.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @RequestMapping(value = "/server", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String serverPage() {
        return "{\n" +
                "  \"status\": 200,\n" +
                "  \"message\": \"HTTP/2 OK\",\n" +
                "  \"Technology\": \"Web3/Block-EC2\"\n" +
                "}";
    }
}
