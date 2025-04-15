//03输入与输出
import java.util.Scanner;
public class third {
    public static void main(String[] args){
        //输入
        Scanner input = new Scanner(System.in); //扫描输入
        String text = input.nextLine();//读取用户输入的之并将其传给text接收

        //输出
        System.out.println(text);  //println会在尾部加上回车，即换行
//        System.out.print(text);
    }
}
