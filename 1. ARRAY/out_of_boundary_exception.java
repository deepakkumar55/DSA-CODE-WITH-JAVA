package Array;

public class out_of_boundary_exception {
    public static void main(String[] args) {
        int arrr[]={1,2,3,4,5,66,7,8,0,9,8,71,6,5,4,3};
        for (int i : arrr) {
           
                System.out.println("Element at index " + i + 
                                    " : "+ arrr[i]);
            
        }
    }
    
}
