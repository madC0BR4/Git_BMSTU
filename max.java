import java.util.Scanner;

public class Main {
    public static int max(int[] arr){
        int m = arr[0];
        for (int i=1; i<arr.length; i++){
            if (arr[i]>m) {
                m = arr[i];
            }
        }
        return m;
    }
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Input length of array: ");
        int len = myObj.nextInt();
        int[] arr;
        arr = new int[len];
        System.out.print("Input numbers: ");
        for (int i=0; i<len; i++){
            int a = myObj.nextInt();
            arr[i] = a;
        }
        System.out.print("Max number is: ");
        System.out.println(max(arr));
    } 
}