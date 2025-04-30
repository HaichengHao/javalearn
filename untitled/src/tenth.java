//title:Object类
// 像python一样，Object也是Java中所有类的父类
// 所以声明数组的时候可以直接利用Object来声明

import java.util.Arrays;
public class tenth {
    public static void main(String[] args){
        Object str1 = "niko";
        Object i = 2;
        Object[] num_lst = {1,3,5};
        //important：利用Object可以声明含有不同元素类型的数组
        Object[] data_lst = {1,2,"niko","ww"};
        System.out.println(data_lst.getClass());//tips:.getClass()可以获取指定的值的所属的类
        func(str1);
        func(i);
        func(num_lst);
        func(data_lst);

    }
    //利用instanceof可以判断指定的值是否属于某个类，就像python中的isinstance(a,class_name)判断a是否属于指定的类class_name
    public static void func(Object v1){
        if(v1 instanceof String){
            System.out.println("字符串类型");
        }else if (v1 instanceof Integer){
            System.out.println("整型");
        }else {
            System.out.println(v1.getClass());
        }
    }
}
