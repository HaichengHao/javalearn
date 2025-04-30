//07整型和字节
/*
有符号
* byte 字节 1字节 -128~127 即-2^7~2^7
* short 短整型 2字节 -32768~32767
* int 整形 4字节 -2147483648~2147483647
* long 长整型 8字节 -9223372036854775808~9223372036854775807

无符号
byte 0-255
short 0-65535
int 0-4,294,967,295
long 0-18,446,744,073,709,551,615
*/

//不同类型的创建方法
//public class seventh {
//    public static void main(String[] args){
//        byte v1 = 32;
//        short v2 = 10000;
//        int v3 = 22221331;
//        long v4 = 554534353424L;
//
//    }
//}

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
//字节数组
public class seventh {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //important:在逆向的过程中有时候会遇到字节数组，这些东西一般都含有相关信息
        //tips:创建一个字节数组
        byte[] dataList = {97, 105, 100, 61, 50, 52, 54, 51, 56, 55, 53, 55, 49, 38, 97, 117, 116, 111, 95, 112, 108, 97, 121, 61, 48, 38, 99, 105, 100, 61, 50, 56, 57, 48, 48, 56, 52, 52, 49, 38, 100, 105, 100, 61, 75, 82, 69, 104, 69, 83, 77, 85, 74, 104, 56, 116, 70, 67, 69, 86, 97, 82, 86, 112, 69, 50, 116, 97, 80, 81, 107, 55, 87, 67, 104, 67, 74, 103, 38, 101, 112, 105, 100, 61, 48, 38, 102, 116, 105, 109, 101, 61, 49, 54, 50, 55, 49, 48, 48, 57, 51, 55, 38, 108, 118, 61, 48, 38, 109, 105, 100, 61, 48, 38, 112, 97, 114, 116, 61, 49, 38, 115, 105, 100, 61, 48, 38, 115, 116, 105, 109, 101, 61, 49, 54, 50, 55, 49, 48, 52, 51, 55, 50, 38, 115, 117, 98, 95, 116, 121, 112, 101, 61, 48, 38, 116, 121, 112, 101, 61, 51};
        //tips:然后创建一个字符串对象，利用String的方式将字节数组转化为字符串
        String dataString= new String(dataList);
        //tips:打印输出
        System.out.println("字符串是:"+dataString);


        //important:将字符串转化为字节
        try {
            String name = "张三";
            //pyton中的name.encode('gbk')
            byte[] v1 = name.getBytes("GBK");//一个字符俩字节
            System.out.println(v1);
            System.out.println(Arrays.toString(v1)); //tips:将转化成字节数组的数据重新转为字符串
            //python中的name.encode('utf-8')
            byte[] v2 = name.getBytes("UTF-8"); //一个字符三个字节
            System.out.println(Arrays.toString(v2));

        }catch (Exception e){

        }
    }
}
/*
* [B@4e50df2e
[-43, -59, -56, -3]
[-27, -68, -96, -28, -72, -119]*/

