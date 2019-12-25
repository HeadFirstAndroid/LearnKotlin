package me.yifeiyuan.learnkotlin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by 程序亦非猿 on 2019/12/20.
 */
public class TF {


    private void foo() {

        int len = 20;

        String[] str = new String[20];

        long d = System.currentTimeMillis();
        System.out.println("d:" + d);

        String ds = Long.toString(d, 36);//k4dtcho7

        System.out.println(ds);

        Random random = new Random();

        int r;
        while (len-- > 0) {
            r = random.nextInt(36);
            System.out.println("r:" + r);
            String c = Integer.toString(r, 36);
            System.out.println("c:" + c);
            str[len] = r % 3 == 0 ? c.toUpperCase() : c;
        }

        ArrayList<String> arr = new ArrayList<>(Arrays.asList(str));
        System.out.println(arr);

        //在arr的下标为2、5、8、11、14、17、20、23
        for (int i = 0; i < 8; i++) {
            arr.add(i * 3 + 2, ds.charAt(i) + "");
        }
        System.out.println(arr);

        StringBuilder sb = new StringBuilder();

        for (String s : arr) {
            sb.append(s);
        }

        String result = sb.toString();

        System.out.println(result);
    }
}
