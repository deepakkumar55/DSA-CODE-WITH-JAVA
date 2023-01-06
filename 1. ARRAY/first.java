package Array;

public class first {
    public static void main(String[] args) {
        int arr[]={5,5,6,3,6,3,2};
        int arr2[]=new int[6];
        arr2[0]=10;
        arr2[1]=1;
        arr2[2]=15;
        arr2[3]=34;
        arr2[4]=14;
        arr2[5]=124;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + 
                                " : "+ arr[i]);
            
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");

        }
    }
}
