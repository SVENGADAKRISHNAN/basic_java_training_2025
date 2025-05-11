public class String_builder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Numbers are");
        System.out.println(builder.capacity());//gives lenght plus 16 as it is te predefined buffer memory
        long start= System.nanoTime();

        for(int i=1;i<=10000;i++){
            builder.append(i);
    }
        long end=System.nanoTime();
        System.out.println("Builder time= "+(end-start));

        String s=new String();
        long start1= System.nanoTime();

        for(int i=1;i<=10000;i++){
            s+=i;
    }
        long end1=System.nanoTime();
        System.out.println("String time= "+(end1-start1));


        //builder<<buffer<<string in time taken
}
}
