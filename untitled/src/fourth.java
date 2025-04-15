//04条件语句

//01 if—else
import java.util.Scanner;
/*
public class fourth {
    public static void main(String[] args){
        int age = 20;
        if (age<18){
            System.out.println("少年");
        }else if(age<50){
            System.out.println("中年人");
        }else {
            System.out.println("老年人");
        }

    }
}*/


//02 switch-case
public class fourth {
    public static void main(String[] args){
        int score = 50;
        switch(score){
            case 10:
                System.out.println("不适合上学");
                break;
            case 20:
                System.out.println("有救但不多");
                break;
            case 30:
                System.out.println("有救");
                break;
            case 40:
                System.out.println("成绩差");
                break;
            case 50:
                System.out.println("还是不及格");
        }

    }
}

