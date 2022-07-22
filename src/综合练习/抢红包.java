package 综合练习;

import java.util.Random;

public class 抢红包 {
    public static void main(String[] args) {
        //奖品是[2,588,888,1000,10000]
        //随机抽取,且不重复抽取
        //1.定义数组假定为奖池
        int[] arr = {2, 588, 888, 1000, 10000};
        //2.定义新数组用来存放抽取到的奖项,以避免重复抽取
        int[] newArr = new int[arr.length];
        //3.抽奖
        //一共就5个将循环5次
        Random r = new Random();

        for (int i = 0; i < arr.length; ) {
            //获取随机索引
            int randomIndex = r.nextInt(arr.length);
            //获取奖项
            int prize = arr[randomIndex];
            //判断当前获取的奖项是否存在
            //如果存在则重新抽取
            //如果不存在则有效奖项
            boolean flag = contains(newArr, prize);
            if (!flag) {
                //把当前抽取到的奖项移动到新数组中
                newArr[i] = prize;
                //添加完后移动索引
                i++;
            }
        }
        //4.遍历newArr
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }


    }

    //定义一个方法用来判断抽取到的prize是否存在于新数组中
    public static boolean contains(int[] arr, int prize) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == prize) {
                return true;
            }
        }
        return false;
    }


}
