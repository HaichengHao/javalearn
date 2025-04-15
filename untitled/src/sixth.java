//循环语句

//while循环语句
/*
public class sixth {
    public static void main(String[] args){
        int count=0;
        while (count<4){
            System.out.println("你好啊!!");
            count+=1;
        }
    }
}
*/


//do while循环
/*
public class sixth {
    public static void main(String[] args){
        int count=0;
        do{
            System.out.println("你好啊!!");
            count+=1;
        }
        while(count<4);
    }
}
*/

//for 循环 其也是支持break和continue的
/*
public class sixth {
    public static void main(String[] args){
        for(int i = 0;i<=5;i++){
            System.out.println("你好呀!");
        }
    }
}
 */
//for循环遍历字符串数组
public class sixth {
    //创建一个字符串数组

    public static void main(String[] args){
        String[] nameList={"张三","李四","王五","赵六"};
        for(int i = 0;i<nameList.length;i++){
            System.out.println(nameList[i]);
        }
    }
}