package day01;

public class copy {
    public static void main(String[] args) {
        //1.定义原始数组
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //2.调用拷贝数据的方法
        int[] copyArr = copyOfRangeOfRange(arr, 0, 9);
        //3.遍历copyArr数组
        for (int i = 0; i < copyArr.length; i++) {
            System.out.print(copyArr[i] + " ");
        }
    }

    //方法为从form索引到to索引复制到新数组中
    public static int[] copyOfRangeOfRange(int[] arr, int from, int to) {
        //1.定义数组
        //静态(知道所有元素时使用)
        //动态(要知道存几个元素)
        int[] newArr = new int[to - from];

        //2.把原始数组arr中from到to中对应的元素,直接拷贝到newArr中
        //伪造索引变量:index
        int index = 0;
        for (int i = from; i < to; i++) {
            //拿到索引,没有拿到元素
            //要拿到元素为: 数组名[索引] = 元素(数据值)
            newArr[index] = arr[i];
            //newArr索引是从0开始
            index++;

        }
        return newArr;
    }
}

