package 综合练习;
public class 找质数 {
    public static void main(String[] args) {
        /*
        101-200之间找出质数的数量(素数),并输出所有质数(素数)
        10
        思路1:循环判断2~9中能否被10整除
        思路2:2~这个数字平方根中有没有能整除这个数的数字
        思路1:定义变量i ->赋值 100 ->判断i是不是质数
        */
        //定义一个变量用来统计有多少个质数,数量
        int count = 0;
        //外循环:遍历101~200的每一个数字,依次得到这个范围的每一个数字
        for (int i = 101; i < 200; i++) {
            //i表示这个循环(101~200)中的每一个数字
            //继续判断i是否为一个质数
            boolean flag = true;//标识一开始认为i是一个质数
            //内循环:判断当前数字是否为一个质数
            for (int j = 2; j < i; j++) {
                //j代表了2~99中的每一个数字
                if(i % j == 0){
                    flag = false;//一旦成功被整除就表示i不是一个质数
                   //跳出单层循环,内循环
                    break;
                }
            }
            if(flag){

                System.out.println("当前数字" + i +"是一个质数");
                count++;
            }else {
                System.out.println("当前数字" + i +"不是一个质数");
            }




        }

        System.out.println("一共有" + count + "个质数");
        
        //以下为定义i判断i是否为质数
        //int i = 7;

    }

}
