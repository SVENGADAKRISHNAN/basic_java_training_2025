import java.util.Scanner;

public class floyds_triangle_with_spaces {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=1;
        for(int i=1;i<=n;i++){
            for(int k=0;k<n-i;k++){
                System.out.println(" ");
                
            }
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            
            System.out.println();
        }
    }
}