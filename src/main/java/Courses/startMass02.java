package Courses;

public class startMass02 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,2,5};
        int x = 2;
        int result = findLast(arr, x);
        System.out.println("результат: " + result);
    }


    public static int findLast(int[] arr, int x) {
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i]==x) {
                return i;
            }
        }
        return -1;
    }
}