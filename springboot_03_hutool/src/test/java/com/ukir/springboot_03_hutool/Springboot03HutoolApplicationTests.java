package com.ukir.springboot_03_hutool;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.date.DateUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class Springboot03HutoolApplicationTests {

    @Test
    void typeConversion() {
        String param = "10";
        //Convert:将任意可能的类型转换为指定类型
        Integer paramInt = Convert.toInt(param);
        //第二个参数 defaultValue 可用于在转换失败时返回一个默认值
        int paramIntDefaul = Convert.toInt(param,0);
//        System.out.println(paramInt + " , " + paramIntDefaul);

        //将字符串转换成日期
        String dateStr = "2020年7月20日";
        Date date = Convert.toDate(dateStr);
//        System.out.println(date);

        //时间和日期
        //输出当前时间
        Date date1 = DateUtil.date();
//        System.out.println(date1);

        //字符串转日期
        String str = "2022-7-20";
        Date strToDate = DateUtil.parse(str);
        System.out.println(strToDate);
    }

}
