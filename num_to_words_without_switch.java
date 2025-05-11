import java.util.*;
public class num_to_words_without_switch{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int flag=0;
        //int digit=log10(n)+1;
        String[] arr1={"","One","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
        String[] arr2={"","","twenty","thirty","forty","fivty","sixty","seventy","eighty","ninety","hundred"};
        if(n>=1000 && n<10000){
            System.out.print(arr1[n/1000]+" "+"thousand ");
            n=n%1000;
        }
        if(n>=100&& n<1000){ 
            System.out.print(arr1[n/100]+" "+"hundred ");
            flag=1;
            n=n%100;
        }
        if(n>=20 && n<100){
            if(flag==1){
                System.out.print("and ");
            }
            System.out.print(arr2[n/10]+" ");
            n=n%10;
        }
        if(n<20){
            System.out.println(arr1[n]);
        }
    }
}