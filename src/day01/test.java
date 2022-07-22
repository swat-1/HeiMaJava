package day01;

public class test {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,61,66,89};
        boolean flag = contains(arr,12);
        System.out.println(flag);
    }

    public static boolean contains (int [] arr, int a) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == a){
                return true;
            }
        }
        return false;
    }
}
