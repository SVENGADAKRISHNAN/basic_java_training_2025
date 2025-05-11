public class String_methods {
    public static void main(String[] args) {
        String str=new String("lorem harry potter");
        ///str="" CREATES A NEW MEMORY
        ///str=null memory is not even created
        System.out.println(str.charAt(5));
        System.out.println(str.contains("lo"));
        System.out.println(str.equalsIgnoreCase("lorem"));
        System.out.println(str.indexOf("harr"));
        System.out.println(str.isEmpty());//there is a difference between null and empty
        str.trim();//removes unwanted spaces and escape sequemces  


        StringBuilder sb=new StringBuilder("hi how are you");
        sb.delete(0, 2);
        sb.reverse();
        sb.toString();

    }
    
}
