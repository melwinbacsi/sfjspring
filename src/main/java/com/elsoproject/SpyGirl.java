package com.elsoproject;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class SpyGirl {
    public String iSaySomething(){
        return "kémkedek Levike";
    }
}
