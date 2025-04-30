import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

//title:List常见方法
// 以及补充的迭代器

//ArryList默认内部存放的是混合数据类型
//ArryList<String> data = new ArryList<String>();
//ArryList<Object> data = new ArryList<Object>();
public class twelveth {
    public static void main(String[] args){
        ArrayList data = new ArrayList();
        data.add("张三");
        data.add("李四");
        data.add(666);
        data.add("jacky");

        //直接这样些可能会报错
//        String value = data.get(1); 这样的话声明一个变量接收索引位置的数据可能有问题
        //所以可以使用强制类型转换来实现

        //获取指定索引位置的元素
        Object value = (String) data.get(1);
        System.out.println(value);


        //也可以使用set来设置指定索引位置的值
        data.set(2,"王五");
        System.out.println(data);
        //[张三, 李四, 王五, jacky]

        //也可以进行删除
        data.remove(0);
        System.out.println(data);

        //可以获取列表的大小
        int size = data.size();
        System.out.println(size);

        //检验是否包含指定的数据,返回的是布尔
        boolean exisdts = data.contains("王五");
        System.out.println(exisdts);


        //打印输出列表中的元素
        for (Object item:data){
            System.out.println(item);
        }

        //或者这样
        for(int i = 0;i<data.size();i++){
            Object item = data.get(i);
            System.out.println(item);

        }

        //LinkedList和ArryList的用法几乎是一样的

        LinkedList data2 = new LinkedList();
        data2.add("云深");
        data2.add("见");
        data2.add("小");
        data2.add("鹿");

        data2.remove(1);
        System.out.println(data2);

        data2.set(2,"见");
        System.out.println(data2);

        data2.push("你好");
        data2.addFirst("(｡･∀･)ﾉﾞ嗨");

        System.out.println(data2);

        //important:注意python中的迭代器用法
        // it = iter(可迭代对象如列表字符串等)
        // next(it)
        Iterator it = data2.iterator();
        while (it.hasNext()){
            Object item = (String) it.next();
            System.out.println(item);
        }


    }
}
