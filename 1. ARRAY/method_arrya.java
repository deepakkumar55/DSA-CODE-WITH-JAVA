package Array;

public class method_arrya {
    public static void raaj(int [] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] ={3,4,5,6,7,3,8,4,2,1,4,5,6,2,4,1,5,2};
        raaj(arr);
    }
}
