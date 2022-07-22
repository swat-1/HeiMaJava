package 综合练习;

public class 数组元素复制 {
    public static void main(String[] args) {
        //将老数组的每一个元素复制到新的数组中并遍历打印出来
        //1.定义一个老数组
        int [] arr = {1,2,3,4,5,6};
        //2.定义个新数组并把新数组的长度和老数组长度设为一致
        //初始化数组newArr驼峰命名法
        int [] newArr = new int[arr.length];
        //3.用for循环将老数组遍历
        for (int i = 0; i < arr.length; i++) {
            //System.out.print(arr [i]);//遍历老数组元素
            //此处将老arr的每一个元素赋值给新arr的元素中
            newArr [i] =arr [i];
          System.out.println(newArr [i]);
        }
    }
}
