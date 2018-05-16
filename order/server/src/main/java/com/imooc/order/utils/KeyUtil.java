package com.imooc.order.utils;

import java.util.Random;

public class KeyUtil {
    public static synchronized String genUniqueKey(){
        long currentTime=System.currentTimeMillis();
        Integer number=new Random().nextInt(900000)+100000;
        return String.valueOf(number)+currentTime;
    }
}
