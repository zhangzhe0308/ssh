package com.zz.sp;

import org.springframework.stereotype.Service;

/**
 * Created by zzhang on 2017/2/21.
 */
public class SField {
    private String sss;

    public String getSss() {
        return sss;
    }

    public void setSss(String sss) {
        this.sss = sss;
    }

    @Override
    public String toString() {
        return "SField{" +
                "sss='" + sss + '\'' +
                '}';
    }
}
