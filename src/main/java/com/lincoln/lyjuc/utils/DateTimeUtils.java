package com.lincoln.lyjuc.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @Author Lincoln Lin
 * @Date 2022/7/25 15:22
 * @Description:
 */
public class DateTimeUtils {

    /**
     * 获取当前的datetime
     * @return
     */
    public static String getNowDateTime(){
        LocalDateTime date = LocalDateTime.now();
        LocalDateTime parseDateTime = LocalDateTime.parse(date.toString(), DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        return String.valueOf(parseDateTime);
    }

}
