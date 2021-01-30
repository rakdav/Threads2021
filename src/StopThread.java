public class StopThread implements Runnable{
    private boolean isActive;

    public StopThread() {
        this.isActive = true;
    }

    void disable()
    {
        isActive=false;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" started");
        int count=1;
        while (isActive){
            System.out.println("Loop "+count++);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName()+" finished");
    }
}
