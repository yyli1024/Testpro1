package com.org;

import java.util.ArrayList;
import java.util.Arrays;
/*
*
* 你好
*
* */

public class bean {

    //模板六 prsf

    private static final int COUNT =0;
    //客户id自定义模板 pric
    private int id ;
    //prsc  自定义模板
    private String name;
    //psf psfi
    public static final int mum=2;
    public static final String trt ="213";

    public static void main(String[] args) {
        System.out.println("23");



        //模板二
        System.out.println("hello");
        //变形 soutp/ soutv/XXX.sout
        System.out.println("args = " + Arrays.deepToString(args));

        System.out.println("bean.main");
        int num =1;
        System.out.println("num = " + num);
        int num2=2;
        System.out.println("num2 = " + num2);

        System.out.println(num);

        //模板三 fori

        String[] str=new String[]{"tom","hanmeimei","lilei"};
        for (int i = 0; i < str.length; i++) {
            System.out.println("str = " + str[i]);
        }
        //变形iter
        for (String s : str) {
            System.out.println("s = " + s);
        }
        
        //变形 itar
        for (int i = 0; i < str.length; i++) {
            String s = str[i];
            System.out.println("s = " + s);
        }

        //模板四 list.for

        ArrayList<Integer> list=new ArrayList();
    list.add(124);
    list.add(123);
    list.add(245);
    list.add(1267);

        for (Integer integer : list) {

        }

        //变形 list.fori

        for (int i = 0; i < list.size(); i++) {

        }

        //变形 list.forr 逆序遍历
        for (int i = list.size() - 1; i >= 0; i--) {

        }
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public  void mothed(){
//模板五 ifn
        System.out.println("bean.mothed");
        ArrayList<Integer> list=new ArrayList();
        list.add(124);
        list.add(123);
        list.add(245);
        list.add(1267);
        if (list == null) {
            
        }
//变形inn
        if (list != null) {

        }
        //变形 xxx.nn xxx.null
        if (list != null) {

        }
        if (list == null) {

        }

    }
}
