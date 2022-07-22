package 综合练习;

import java.util.Scanner;

public class 评委打分 {
    public static void main(String[] args) {
        /*需求:
        6个评委打分,分数范围0~100,要求去掉最高分和最低分最后取
        剩下4为评委的分数平均值作为最终分数
         */
        //1.将评委的6个分数存入数组中
        int [] scoreArr = getArr();
        for (int i = 0; i < scoreArr.length; i++) {
            System.out.print(scoreArr [i] + "  ");
        }
        //2.求出最高分
        int maxScore = getMax(scoreArr);
        System.out.println("最大为:" + maxScore);
        //3.求出最底分
        int minScore = getMin(scoreArr);
        System.out.println("最小为:" + minScore);
        //4.求出数组的总和分数
        int sum = getSum(scoreArr);
        System.out.println("评委总分为" + sum);
        //5.求出平均分 (总分-最高-最低)/4
        int finalScore = (sum - maxScore - minScore)/(scoreArr.length - 2);
        System.out.println("最终分数为 :" + finalScore);
    }
    //定义方法获取数组getArr;6个评委打分,分数范围0~100
    public static int [] getArr() {
        //定义分数的数组并初始化(6个评委长度为6)
        int [] scores = new int[6];
        //键盘录入通用语句
        Scanner sc = new Scanner(System.in);
        //for循环用来遍历分数数组并通过键盘录入进数组元素中
        for (int i = 0; i < scores.length; ) {
            //提示语句
            System.out.println("请输入评委分数");
            //定义变量score接受评委的分数
            int score = sc.nextInt();
            //scores [i] (i从0开始自增所以第一次循环是吧第一个评委的数字录入0索引)= score
            if(score >= 0 && score <= 100){
                scores [i] = score;
                i++;
            }else {
                System.out.println("成绩输入有误");
            }
        }
        return scores;
    }
    //定义方法求最大值
    public static int getMax(int [] scores) {
        int max = scores [0];
        for (int i = 1; i < scores.length; i++) {
            if(scores [i] > max){
                max = scores [i];
            }
        }
        return max;
    }
    //定义方法求最小值
    public static int getMin(int [] scores) {
        int min = scores [0];
        for (int i = 1; i < scores.length; i++) {
            if(scores [i] < min){
                min = scores [i];
            }
        }
        return min;
    }

    //定义方法求和
    public static int getSum(int [] scores) {
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores [i];
        }
        return sum;
    }

}

