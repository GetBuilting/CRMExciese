package com.jxxdxy.settings.test;

import com.jxxdxy.crm.utils.DateTimeUtil;
import com.jxxdxy.crm.utils.MD5Util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {
    public static void main(String[] args) {
        //验证失效时间
        String expireTime = "2021-05-16 05:10:10";

//        Date date = new Date();
//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String dateStr = format.format(date);
//        System.out.println(dateStr);
        //当前系统时间
//        String currentTime = DateTimeUtil.getSysTime();
//        int i = expireTime.compareTo(currentTime);
//        System.out.println(i);

        //判断锁定状态
//        String lockState = "0";
//        if ("0".equals(lockState)){
//            System.out.println("账号锁定了");
//        }

        //浏览器端的ip地址
//        String ip = "192.168.1.3";
//        //允许访问的ip
//        String allowIps = "192.168.1.1,192.168.1.2";
//        if (allowIps.contains(ip)){
//            System.out.println("允许访问");
//        }else {
//            System.out.println("你没有访问权限，请联系管理员");
//        }

        //装换秘文
        String pwd = "12345";
        pwd = MD5Util.getMD5(pwd);
        System.out.println(pwd);
    }
}
