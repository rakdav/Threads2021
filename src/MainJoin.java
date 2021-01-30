public class MainJoin
{
    public static void main(String[] args) {
        System.out.println("Main thread started...");
        JThread t=new JThread("JThread");
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Maun thread finished...");
    }
}
