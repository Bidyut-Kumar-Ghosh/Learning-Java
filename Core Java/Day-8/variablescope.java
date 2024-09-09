public class variablescope {

    public static void main(String[] args) {
        int x = 10;
        System.out.println("Inside main : x = " + x);
        if (true) {
            int y = 25;
            System.out.println("Inside if block : y = " + y);
        }
        System.out.println("Block in main : x = " + x);
    }

}
