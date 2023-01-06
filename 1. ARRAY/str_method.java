package Array;

public class str_method {
    public static void raaj(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i]+" ");
        }
    }
    public static void main(String[] args) {
        String name[]={"raaj","aryan","kunal","deepak","Raaj"};
        raaj(name);
    }
}
