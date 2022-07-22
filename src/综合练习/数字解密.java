package 综合练习;

public class 数字解密 {
    public static void main(String[] args) {
        //需求:数字解密
        //1.定义一个数组存放解密后的结果
        int[] arr = {8, 3, 4, 6};
        //2.将数字反转
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        //3.每一位数字对10求余数
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0 && arr[i] <= 4) {
                arr[i] += 10;
            }
        }
        //4.每一位数字-5
        for (int i = 0; i < arr.length; i++) {
            arr[i] -= 5;
        }
        //输出结果
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
