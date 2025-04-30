//title:数组
//important:Java中的数组 不等于 Python中的列表
// Java中的数组的长度是固定的，而python中的列表的长度是动态的
// 数组中的元素的类型是有限制的,而python中列表的元素的类型可以是任意的

import java.util.Arrays;
public class nighth {
    public static void main(String[] args){
        //tips:整形数组
        int[] num_arr = {1,2,3,5};
        System.out.println(Arrays.toString(num_arr));
        int[] num_arr2 = new int[3];
        num_arr2[0] = 2;
        num_arr2[1] = 4;
        num_arr2[2] = 5;
        System.out.println(Arrays.toString(num_arr2));

        //字符数组
        String[] str_arr = {"niko","amy","ww"};
        String[] name_arr = new String[]{"niko","amy","ww"};
        System.out.println(Arrays.toString(name_arr));
//        byte[] b1 = str_arr.getBytes("UTF-8");
//        System.out.println(b1);
        //字节数组
        byte[] bt_arr = {10, 22, 31, 11};
        System.out.println(Arrays.toString(bt_arr));

    }
}
