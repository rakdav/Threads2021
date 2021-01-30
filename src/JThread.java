public class JThread extends Thread
{
    public JThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" started");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Поток прерван");
        }
        System.out.println(Thread.currentThread().getName()+" finished");
    }
}
