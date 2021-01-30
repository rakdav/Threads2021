public class ThreadMain
{
    public static void main(String[] args) {
//        System.out.println("Main thread started...");
//        for(int i=1;i<6;i++)
//        new JThread("JThread"+i).start();
//        System.out.println("Maun thread finished...");

//        System.out.println("Main thread started...");
//        Thread myThread=new Thread(new MyThreadRunnable(),"MyThreadRunnable");
//        myThread.start();
//        System.out.println("Maun thread finished...");
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(Thread.currentThread().getName()+" started");
//                try {
//                    Thread.sleep(3000);
//                } catch (InterruptedException e) {
//                    System.out.println("Поток прерван");
//                }
//                System.out.println(Thread.currentThread().getName()+" finished");
//            }
//        }).start();

//        System.out.println("Main thread started...");
//        StopThread myThread=new StopThread();
//        new Thread(myThread,"MyThread").start();
//        try {
//            Thread.sleep(2100);
//            myThread.disable();
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("Maun thread finished...");

//        System.out.println("Main thread started...");
//        IntThread t=new IntThread("MyThread");
//        t.start();
//        try {
//            Thread.sleep(150);
//            t.interrupt();
//            Thread.sleep(150);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("Main thread finished...");
        CommonResource commonResource=new CommonResource();
        for (int i = 1; i <6 ; i++) {
            Thread t=new Thread(new CountThread(commonResource));
            t.setName("Thread "+i);
            t.start();
        }
    }
}
