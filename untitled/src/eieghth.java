//title:Java中的字符串和StringBuilder

import java.io.UnsupportedEncodingException;

public class eieghth {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String v1 = "王中王";
        String v2 = new String("王中王");
        String v4 = new String(new byte[]{-26,-83,-90,-26,-78,-101,-23,67,-112});
        String v5 = new String(new byte[]{-50,-28,-59,-26,-58,-21},"GBK");
//        String v6 = new String(new char[]{"王","中","王"});
//
//        java: 不兼容的类型: java.lang.String无法转换为char
        String origin = "U love u,I Love Me";
        char v7 = origin.charAt(5); //找到第五个索引然后取到索引位置的字符然后赋给v7
        System.out.println(v7);
        int strlen = origin.length();
        System.out.println(strlen);
        System.out.println(origin.toLowerCase());
        System.out.println(origin.toUpperCase());

        //分割
//        String[] strarr = origin.split('o');
//        System.out.println(strarr);//分割

        //替换
        System.out.println(origin.replace("ove","ike"));

        //子字符串=python中的切片
        System.out.println(origin.substring(2,8));

        //判断是否相同
        System.out.println(origin.equals("U love u,I Love ME"));

        //判断字符串是否包含指定的字符
        System.out.println(origin.contains("ov"));

        //判断是否是指定的字符开头
        System.out.println(origin.startsWith("I"));

        //字符串拼接
        System.out.println(origin.concat("\nthat's why we love"));


        //important:利用StringBuilder
        StringBuilder sbd = new StringBuilder();
        sbd.append("you");
        sbd.append("love");
        sbd.append("u");
        sbd.append("I");
        sbd.append("love");
        sbd.append("me");
        String dataString = sbd.toString();
        System.out.println(dataString);



    }
}
