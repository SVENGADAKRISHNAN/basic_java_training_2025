import java.util.*;
public class num_to_words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        ArrayList<String> arr= new ArrayList<>();
        while(num!=0){
            int dig=num%10;
            switch(dig){
                case(1):
                arr.add("one");
                break;
                case(2):
                arr.add("two");
                break;
                case(3):
                arr.add("three");
                break;
                case(4):
                arr.add("four");
                break;
                case(5):
                arr.add("five");
                break;
                case(6):
                arr.add("six");
                break;
                case(7):
                arr.add("seven");
                break;
                case(8):
                arr.add("eight");
                break;
                case(9):
                arr.add("nine");
                break;
                case(0):
                arr.add("zero");
                break;
            }
            num=num/10;
        }
        for(int i=arr.size()-1;i>=0;i--){
            System.out.print(arr.get(i)+" ");
        }
    }
}
