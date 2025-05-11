public class Threadrunnable implements Runnable {
    public static void main(String[] args) {
        Threadrunnable threadrunnable=new Threadrunnable();
    }
    @Override
    public void run(){
        for(int i=0;i<20;i++){
            System.out.println(i);
        }
    }
}
