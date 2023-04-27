package com.paishjain.UrlHitCounterApplication.repository;

import org.springframework.stereotype.Repository;

@Repository
public class UrlRepository {

    static int count;
    public String getCount() {
        count++;
        return "Total User Visited : " + Integer.toString(count);
    }
}
