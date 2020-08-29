package com.org;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * @author yyli
 * @create 2020-08-28 16:37
 */
public class Pojo {
    private static final int COUNT=10;
    private String ss;

    public String getSs() {
        return ss;
    }

    public void setSs(String ss) {
        this.ss = ss;
    }

    public static void main(String[] args) {
        System.out.println();
        ArrayList list = new ArrayList();
        System.out.println("1111");

        HashMap map = new HashMap();
//        list.add();
        new Date();
        try {
            FileInputStream fos=new FileInputStream("na.txt");
        } catch (FileNotFoundException e) {

        }
    }


}

