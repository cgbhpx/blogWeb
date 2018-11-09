package com.chai.testProj.utils;

import java.util.Date;

public class CreateId {
    private static byte[] lock = new byte[0];
    // 位数，默认是8位
    private final static long w = 1000000000;

    public String getUUID() {
        long r = 0;
        long s = 0;
        synchronized (lock) {
            r = (long) ((Math.random() + 1) * w);
        }
            return String.valueOf(r) ;
    }

}
