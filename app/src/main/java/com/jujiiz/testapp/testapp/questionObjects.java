package com.jujiiz.testapp.testapp;


import android.util.Log;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by JuJiiz on 8/8/2560.
 */

public class questionObjects {
    public static HashMap<String, List<String>> arrayList() {
        HashMap<String, List<String>> hm = new HashMap<String, List<String>>();
        List<String> values;
        values = new ArrayList<String>();
        values.add("กินข้าวกับอะไร?");
        values.add("ไข่เจียว");
        values.add("ผัดกะเพราหมูสับ");
        values.add("ไข่ต้ม");
        values.add("ข้าวผัด");
        values.add("ข้าวผัด");
        hm.put("Q1", values);

        values = new ArrayList<String>();
        values.add("ทำอะไร?");
        values.add("นอน");
        values.add("นั่ง");
        values.add("ตีลังกา");
        values.add("กลิ้งไปมา");
        values.add("นั่ง");
        hm.put("Q2", values);

        values = new ArrayList<String>();
        values.add("ทำการบ้านยัง?");
        values.add("ยังว่ะ");
        values.add("ยังครับ");
        values.add("ยังค่ะ");
        values.add("การบ้านไร?");
        values.add("ยังครับ");
        hm.put("Q3", values);

        return hm;
    }

}
