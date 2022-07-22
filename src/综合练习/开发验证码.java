package 综合练习;

import java.util.Random;

public class 开发验证码 {
    public static void main(String[] args) {
        /*定义方法实现随机产生一个5位数的验证码
        验证码格式:
        1.长度为5
        2.前四位是大写字母或者小写字幕
        3.最后一位是数字
        */
        //分析:
        //随机:A~Z a~z
        //方法:以后我们要在一堆没有什么规律的数据中随机抽取
        //可以先把这些数据放到数组中
        //再随机抽区一个索引

        //1.大写字母和小写字母放到数组中
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            //ASCII码表 数字和字母一一对应 char (97) -->'a'
            if (i <= 25) {
                //添加小写字母
                chs[i] = (char) (97 + i);
            }else{
                //大于25的都是大写字母
                chs[i] = (char) (65 + i - 26);
            }

        }
        //遍历
        /*for (int i = 0; i < chs.length; i++) {
            System.out.print(chs[i] + " ");
        }*/


        //定义一个(长度为0什么都没有的空的)字符串类型的变量,用来记录最终的结果
        String result = "";
        //2.随机抽取4次
        //随机抽取数组中的额索引
        Random r=new Random();
        //索引范围0~51也是52同样==chs.length
        for (int i = 0; i < 4; i++) {
            int randomIndex = r.nextInt(chs.length);
            //利用随机索引获取对应的chs中的元素
            //输出4个随机索引出来的对应元素
            // System.out.println(chs[randomIndex]);
            //相当于"" + 'a' =" a ";
            result += chs[randomIndex];
        }
        //System.out.println(result);
        //3.随机抽取一个0~9的数字
        int number = r.nextInt(10);
        //生成最终的结果
        result = result + number;
        //打印最终结果
        System.out.println(result);
    }

}
