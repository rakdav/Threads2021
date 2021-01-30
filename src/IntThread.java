public class IntThread extends Thread
{
    public IntThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" started");
        int count=1;
        while (!isInterrupted()){
            System.out.println("Loop "+count++);
        }
        System.out.println(Thread.currentThread().getName()+" finished");
    }
}
