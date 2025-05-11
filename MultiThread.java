public class MultiThread extends Thread {
    public static void main(String[] args) {
        MultiThread multiThread = new MultiThread();
        multiThread.start();
        
        //thread 2
        MultiThread multiThread2 = new MultiThread();
        multiThread2.start();   

        //thread 3+
        MultiThread multiThread3 = new MultiThread();
        multiThread3.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(i);
        }
    }
}
// disadvantages 
//deadlock
