public class bit_wise {
    public static void main(String[] args) {
        int a=3;
        int b=5;
        //AND &
        System.out.println("3 and 5 = " + (a & b));


        //OR |
        System.out.println("3 OR 5 = " + (a | b));

        //XOR ^
        System.out.println("3 XOR 5 = " + (a ^ b));


        //NOT ~
        System.out.println("3 NOT = " +  (~a));

        //ODD OR EVEN

        if((a & 1)==0){
            System.out.println("even");
        }  
    }
}
