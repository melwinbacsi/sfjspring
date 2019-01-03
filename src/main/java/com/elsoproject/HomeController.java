package com.elsoproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    private SpyGirl spicy = new SpyGirl();

    @Autowired
    public void setSpicy(SpyGirl spicy) {
        this.spicy = spicy;
    }

    @RequestMapping("/")
    public String index(){
        return spicy.iSaySomething();
    }
}
