

//title:常见数据类型之list系列
// list是一个接口，Java中没有列表类型
// 在java中，接口是用来约束实现它的类的,约束它里边的成员必须有xxx
// 接口有俩常见的类型(目的是可以像python那样存放动态的多个数据)
// 1 ArryList ,连续的内存地址的存储(内部自动扩容，如100个就满的话有101个数据那么就会开辟一块新的有200个空间的，然后将原来的存放到新的空间)
// 2 LinkedList , 底层基于链表来实现的
import java.util.ArrayList;
import java.util.LinkedList;
public class eleventh {
    public static void main(String[] args){

        //创建ArrayList
        ArrayList v1 = new ArrayList();
        v1.add("张三");
        v1.add("李四");
        v1.add("王五");

        //创建LinkedList，其实创建方式都差不多，只是底层存储的不一样
        LinkedList v2 = new LinkedList();
        v2.add("张三");
        v2.add("李四");
        v2.add("王五");

    }
}
