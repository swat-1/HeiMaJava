package 综合练习;

import java.util.Random;
import java.util.Scanner;

public class 模拟双色球 {
    public static void main(String[] args) {
        //1.生成中奖号码
        int[] arr = creatNumber();
        //遍历数组arr得到中奖号码数组元素
        System.out.print("中奖号码为:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        //2.用户输入彩票号码(红+蓝)
        int[] userInputArr = userInputNumber();
        for (int i = 0; i < userInputArr.length; i++) {
            System.out.print(userInputArr[i] + " ");
        }
        //3.判断用户中奖情况
        //判断红球
        int redCount = 0;
        //仅仅判断红球情况
        for (int i = 0; i < userInputArr.length - 1; i++) {
            int redNumber = userInputArr[i];
            for (int j = 0; j < arr.length - 1; j++) {
                //判断用户输入的红球与中奖的红球是否一样
                if (redNumber == arr[j]) {
                    redCount++;
                    //如果找到了那么后面的数组就不用继续比较
                    //跳出循环,继续判断下一个红球是否中奖
                    break;
                }

            }
        }

        //判断蓝球
        int blueCount = 0;
        int blueNumber = userInputArr[userInputArr.length-1];
        if (blueNumber == arr[arr.length - 1]) {
            blueCount++;
        }
        System.out.println("");
        System.out.println("红球中了"  +  redCount+ "个");
        System.out.println("蓝球中了"  + blueCount+ "个");

        //根据蓝球和红球的中奖个数来判断
        if(redCount == 6 && blueCount == 1){
            System.out.println("恭喜你中一等奖 6+1!1000万");
        }else if (redCount == 6 && blueCount == 0) {
            System.out.println("恭喜你中二等奖 6+0!500万");
        }else if (redCount == 5 && blueCount == 1) {
            System.out.println("恭喜你中三等奖 5+1!3000元");
        }else if ((redCount == 5 && blueCount == 0) || (redCount == 4 && blueCount == 1) ) {
            System.out.println("恭喜你中四等奖 5+0或者4+1!200元");
        }else if ((redCount == 4 && blueCount == 0) || (redCount == 3 && blueCount == 1) ) {
            System.out.println("恭喜你中五等奖 4+0或者3+1!10元");
        }else if ((redCount == 2 && blueCount == 1) || (redCount == 1 && blueCount == 1) || (redCount == 0 && blueCount == 1) ) {
            System.out.println("恭喜你中六等奖 2+1或者1+1或者0+1!5元");
        }else {
            System.out.println("谢谢惠顾");
        }


    }

    public static int[] userInputNumber() {
        //1.创建数组用于添加用户购买的彩票号码
        //6红1蓝,数组长度为7
        int[] arr = new int[7];
        //2.利用键盘录入让用户输入
        Scanner sc = new Scanner(System.in);
        //红球部分
        for (int i = 0; i < 6; ) {
            System.out.println("请输入第" + (i + 1) + "个红球号码");
            int redNumber = sc.nextInt();
            //redNumber 在1-33中内 且唯一不重复
            if (redNumber >= 1 && redNumber <= 33) {
                boolean flag = contains(arr, redNumber);
                if (!flag) {
                    //不存在数组中的话,就添加到数组中
                    arr[i] = redNumber;
                    i++;
                } else {
                    System.out.println("当前红球号码已经存在,请重新输入");
                }
            } else {
                System.out.println("当前红球号码超出范围,请重新输入");
            }

        }
        //蓝球部分
        System.out.println("请输入蓝球号码");
        //范围1-16
        while (true) {
            int blueNumber = sc.nextInt();
            if (blueNumber >= 1 && blueNumber <= 16) {
                arr[arr.length - 1] = blueNumber;
                break;
            } else {
                System.out.println("当前蓝球号码超出范围");
            }
        }
        return arr;


    }

    //定义方法获取中奖号码
    public static int[] creatNumber() {
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
