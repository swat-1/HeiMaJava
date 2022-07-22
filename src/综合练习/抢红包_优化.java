package 综合练习;

import java.util.Random;

public class 抢红包_优化 {
    public static void main(String[] args) {
        //奖品是[2,588,888,1000,10000]
        //随机抽取,且不重复抽取
        //1.把奖池所有奖项打乱顺序
        int[] arr = {2, 588, 888, 1000, 10000};
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            //获取随机索引也就是将数组长度0-5打乱
            int randomIndex = r.nextInt(arr.length);
            //将i和随机索引randomIndex互换
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
        //2.遍历打乱奖项后的奖池
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
