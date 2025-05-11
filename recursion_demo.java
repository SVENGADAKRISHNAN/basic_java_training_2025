public class recursion_demo {
    public static void main(String[] args) {
        //print(5);
        printNumbers(100,1);//Integer.Max value will throw a stack overflow error
        printNumbers2(100);
    }
    public static void print(int count){
        //base case
        if(count<1) return;
        System.out.println("Hello world");
        print(count-1);
    }

    //print 1-100 
    public static void printNumbers(int num,int start){//Every time this method is called it will call a stack METHOD CALL STACK
        if(num<1) return;
        System.out.println(start);
        printNumbers(num-1,start+1);
    }
    public static void printNumbers2(int num){//Every time this method is called it will call a stack METHOD CALL STACK
        if(num<1) return;
        printNumbers2(num-1);//leaves behind some code and completes it after backtracking
        //imagine with stack
        System.out.println(num);
        
    }///


    ////types of recursion
    /// 1.DIRECT RECURSION
    /// 2.INDIRECT RECURSION
    /// METH1(){
    /// METH2()
    /// }
    /// METH2(){
    /// METH1()
    /// }
    /// 3.TAIL RECURSION
    /// FUN(){
    /// FUN()//THIS IS THE FINAL LINE OF CODE SO THERE IS NO BACKTRACKING
    /// }
    /// 
    /// 4.HEAD RECURSION
    /// CALLING THE RECURSION IN THE BASE CONDITION
    /// 5.TREE RECURSION
    /// 6.NESTED RECURSION
    
}
