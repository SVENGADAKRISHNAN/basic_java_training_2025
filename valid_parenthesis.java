import java.util.Scanner;
import java.util.Stack;

public class valid_parenthesis {
    public static boolean isValid(String s) 
    {
        Stack<Character> stack = new Stack<>();

        for( char c : s.toCharArray())
        {
            if(c=='(' || c=='{' || c=='[')
            {
                stack.push(c);
            }
            else{
                if(stack.isEmpty())
                {
                    return false;
                }
                char top = stack.pop();
                if((c==')' && top!='(')|| (c=='}' && top!='{') || (c==']' && top!='['))
                {
                    return false;
                }
            }
        }
        return stack.isEmpty();
        
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st=sc.nextLine();
        System.out.println(isValid(st));
    }
        
}






// import java.util.Stack;
// class Solution {
//     public boolean isValid(String s) 
//     {
//         Stack<Character> stack = new Stack<>();

//         for( char c : s.toCharArray())
//         {
//             if(c=='(' || c=='{' || c=='[')
//             {
//                 stack.push(c);
//             }
//             else{
//                 if(stack.isEmpty())
//                 {
//                     return false;
//                 }
//                 char top = stack.pop();
//                 if((c==')' && top!='(')|| (c=='}' && top!='{') || (c==']' && top!='['))
//                 {
//                     return false;
//                 }
//             }
//         }
//         return stack.isEmpty();
        
//     }
// }