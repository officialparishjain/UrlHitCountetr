package com.paishjain.UrlHitCounterApplication.controller;

import com.paishjain.UrlHitCounterApplication.service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/visitor-count-app")
public class UrlHitController {

    @Autowired
    public UrlService urlHitService;
    @GetMapping("/count")
    public String getHitCount() {
        return urlHitService.getVisitorCount();
    }
}
