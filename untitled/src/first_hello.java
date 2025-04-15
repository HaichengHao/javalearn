//public class first_hello {
//    public static void main(String[] args) {
//        System.out.println("哈哈哈");
//    }
//}


//tips:成员和静态成员,如果按照python理解的话就是方法和静态方法
class Mytest{
    public void F1(){  //important public 这是成员修饰符 void 表示返回值类型 F1为方法名,括号内可以传递参数
        System.out.println("f1");

    }
    public static void F2(){ //important static表示这是静态方法(在java里叫成员)，可以不用实例化直接调用
        System.out.println("f2");
    }

}
class Mytest2{
    public int f1(int a1,int a2){
        int result = a1+a2;
        return result;
    }
}
public class first_hello {  //important 类对象前面的public表示其为公有类，一个java文件中智能有一个公有类
    /**
     * 这里可以写函数的描述
     * @param args 参数的注释
     */
    public static void main(String[] args) {  //important 主方法
        //tips:实例化绑定类对象,这里简单记住实例化的写法,如果是python的话只需要obj=Mytest()这里则需要类对象名 实例类对象名 = new 类对象名()
        Mytest obj = new Mytest();
        //tips:对象(在java里叫成员)调用
        obj.F1();
        //tips:静态类方法可以直接调用
        Mytest.F2();

        //tips:创建类对象obj2,绑定Mytest2类
        Mytest2 obj2 = new Mytest2();
        //tips: 让类对象调用方法(成员)f1传入参数指定返回值类型为int类型
        int result2 = obj2.f1(1,2);
        System.out.println(result2); //tips:打印输出结果

    }
}
//tips:java中的注释 //为单行注释，多行注释是/**/
/*
* 这是多行注释*/