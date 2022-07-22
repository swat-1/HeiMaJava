package 综合练习;

public class 数字加密 {
    public static void main(String[] args) {
        //需求:数字密码

        //把整数的每一位数字放到数组中
        int[] arr = {1, 9, 8, 3};

        //加密过程:
        //1.每一位数字+5
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 5;
        }


        //2.每一位数字对10求余数
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] % 10;
        }
        //3.将数字反转
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        //输出这个处理后的数组
        for (int i = 0; i < arr.length; i++) {
            //System.out.print(arr[i] + " ");
        }

        //拼接 :8 3 4 6 -->8346将数组中的数字组合成一个整数
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            number = number * 10 + arr[i];
        }
        System.out.println(number);


    }
}
