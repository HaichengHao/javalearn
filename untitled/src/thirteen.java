//title:Set系列
// set是一个接口,常见实现这个接口的有两个类，用于实现不重复的多元素集合
// HashSet 去重,无序
// TreeSet 去重,内部默认排序(ascii、unicode) 不同的数据类型，无法进行比较

import java.util.*;
public class thirteen {
    public static void main(String[] args){
        HashSet s1 = new HashSet();
//        Set s1 = new HashSet();
//        HashSet<String> s1 = new HashSet<String>();
        s1.add("有何不可");
        s1.add("乱乱唱");
        s1.add("哈哈哈");
        s1.add("butu");
        System.out.println(s1);

        HashSet s2 = new HashSet(){
            {
                add("你好");
                add("hello");
                add("Bonjour");
                add("hello");
            }
        };
        System.out.println(s2);
//        [你好, Bonjour, hello] 会去重


        //创建TreeSet
        TreeSet s3 = new TreeSet(){
            {
                add("你好");
                add("bonjour");
                add("aloha");
            }
        } ;
        System.out.println(s3);

        TreeSet s4 = new TreeSet();
        s4.add("你好");
        s4.add("Aloha");
        s4.add("hello");
        System.out.println(s4);

        for (Object item:s4){
            System.out.println(item);
        }

        Iterator it = s4.iterator();
        while (it.hasNext()){
            String item = (String) it.next();
            System.out.println(item);
        }
    }
}
