package com.example.capturareq.controller;

import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("v1/api/demo")
public class ParametroController {

    @GetMapping("/")
    public String getParametroAll(HttpServletRequest request) {
        System.out.println("Ingreso getParametroAll");
        String clientIp = request.getRemoteAddr();
        System.out.println("IP: "+clientIp);
        return "LA IP ES: "+clientIp;
    }
}
