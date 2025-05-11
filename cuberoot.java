import java.util.*;

public class cuberoot {
   public static void main(String[] args){
      Scanner sc= new Scanner(System.in);
      double n = sc.nextDouble();
      double left=0;
      double right=n;
      double mid;
      while(left<=right){
         mid=((left+right)/2);
         if(mid*mid*mid==n || mid*mid*mid>n && mid*mid*mid<=n+0.001 || mid*mid*mid<n && mid*mid*mid>=n-0.001)
            {System.out.println("Cube root is "+mid);
            break;}
         else if(mid*mid*mid>n){
            right=mid;}
         else if(mid*mid*mid<n)
            {left=mid;}
      }
   }
  
   }



// import java.util.Scanner;
// public class Cube {
//     public static void main(String[] args) {
//         double n;
//         Scanner sc = new Scanner(System.in);
//         n=sc.nextInt(); 
//         double left=0;
//         double right=n;
//         double mid;
//         while(left<=right){
//             mid=(left+right)/2;
//             if((mid*mid*mid>=n-0.001 && mid*mid*mid<=n) || (mid*mid*mid>=n && mid*mid*mid<=n+0.001) ||(mid*mid*mid==n) ){
//                 System.out.print("Cube root is "+mid);
//                 break;
//             } 
//             else if(mid*mid*mid<=n){
//                 left=mid;
//             }
//             else if (mid*mid*mid>=n){
//                 right=mid;
//             }
           
//         }

//     }
// }