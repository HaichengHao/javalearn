//title: 关于成员的修饰符,结合mytest3
/*tips:
    类成员修饰符号:public、private、protected、default(大前提:要现有访问类的权限)
* */
public class fifth {
//    公有类可以被任意调用，但是其中可能有其它修饰符的成员不能被直接调用
//    tips:类中带public的成员有权访问
//     带private的不能随便访问
//     带protected的成员

    //tips:public成员是可以被访问的
    public static void main(String[] args){
        System.out.println("你好");
    }
//    声明其它修饰符的成员(或者叫方法)
// tips:   私有类，只可以被类内调用
    private void gavv(){
        System.out.println("咬");
    }
    public void show(){
        System.out.println("hello from fifth");
    }


}
