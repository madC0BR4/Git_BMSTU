public class Main {
    public static int max(int[] arr){
        int m = 0;
        for (int i=0; i<arr.length; i++){
            if (arr[i]>m) {
                m = arr[i];
            }
        }
        return m;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,7,54,6};
        System.out.println(max(arr));
    } 
}