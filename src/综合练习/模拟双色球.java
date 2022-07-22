package 综合练习;

import java.util.Random;

public class 模拟双色球 {
    public static void main(String[] args) {
        //1.生成中奖号码




    }

    public static int [] creatNumber() {
        //1.创建数组用于添加中奖号码
        //6个红球和1个蓝球,数组长度为7,用动态数组
        int[] arr = new int[7];
        //2.随机生成号码并添加到数组当中
        //红球:不能重复:1 2 3 4 5 6
        //蓝球:可以和红球重复 5 6 7
        //3.生成红球号码添加到数组当中
        Random r = new Random();
        for (int i = 0; i < 6; ) {
            //获取红球号码
            int redNumber = r.nextInt(33) + 1;
            boolean flag = contains(arr, redNumber);
            if (!flag) {
                //把红球添加到数组当中,也只有成功添加后才会进行下次循环
                arr[i] = redNumber;
                i++;
            }
        }
        //4.生成蓝球号码添加到数组当中
        int blueNumber = r.nextInt(16) + 1;
        arr[arr.length - 1] = blueNumber;
        //5.红球蓝球已经全部生成
        return arr;
    }

    //用于判断数字在数组中是否存在
    public static boolean contains(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }
}
