package com.gox.kewk.controller;

import com.gox.kewk.entity.Kewk;
import com.gox.kewk.service.KewkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class KewkController {

    @Autowired
    public KewkService kewkService;

    @GetMapping("/kewk")
    List<Kewk> all() {
        return kewkService.getAllKewk();
    }
}
