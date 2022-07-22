package day01;

public class getarrmax {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int max = maxx(arr);
        System.out.println(max);
    }

    public static int maxx(int [] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }return max;

    }

}
