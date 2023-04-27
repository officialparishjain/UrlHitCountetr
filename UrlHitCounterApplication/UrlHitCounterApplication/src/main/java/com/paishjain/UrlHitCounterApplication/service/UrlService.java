package com.paishjain.UrlHitCounterApplication.service;

import com.paishjain.UrlHitCounterApplication.repository.UrlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UrlService {

    @Autowired
    UrlRepository urlRepository;
    public String getVisitorCount() {
        return urlRepository.getCount();
    }
}
