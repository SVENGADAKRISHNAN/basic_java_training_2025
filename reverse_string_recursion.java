public class reverse_string_recursion {
    public static void main(String[] args) {
        String str= "four";
        System.out.println(rev(str));
    }
    public static String rev(String str){
        if(str.isEmpty() || str.length()==0) return str;
        return rev(str.substring(1))+str.charAt(0);
    }
}
