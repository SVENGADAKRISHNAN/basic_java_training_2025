public class extra_char_in_string {
    public static void main(String[] args) {
        String str1="hello";
        String str2="heello";
        char result=0;
        String concat= str1+str2;
        char[] arr=concat.toCharArray();
        for(int i=0;i<arr.length;i++){
            result=(char) (result ^ arr[i]);//type casting is must in this statement
            //reselt ^=arr[i]  TYPE CASTING IS AUTOMATICALLY DONE
        }
        System.out.println(result);
    }
}
