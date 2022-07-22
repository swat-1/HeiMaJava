package 综合练习;

import java.util.Scanner;

public class 整数变数组 {
    public static void main(String[] args){
        //把整数的每一位数字放到数组中





        //1.计算数组长度
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入一个整数");
        int number = sc.nextInt();
        //int number = 12345;
        //临时定义temp第三部使用
        int temp =number;
        //定义变量进行统计长度
        int count = 0;
        //每一次循环去掉一个数字(最右侧数字开始)计数器就自增一次
        while (number != 0){
            number = number / 10;
            //System.out.println(number);
            count++;
        }

        //System.out.println(count);


        //2.得有一个数组:静态/动态
        //>0的整数 所以用动态
        int[]arr = new int[count];
        //3.把整数的每一位数字放到数组中
        //定义一个索引
        int index = arr.length - 1;
        while (temp != 0){ //1 2 3 4 5
            //循环获取temp的每一位数字
            int ge = temp % 10;
            //去掉最右边的个位,每次循环保留左侧数字
            temp = temp / 10;
            //把当前获取到的左侧数字添加到数组中去
            //数组名[索引] = 数据; 即可添加进数组中
            arr [index] = ge;
            index --;
        }
        //验证
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }



    }
}
