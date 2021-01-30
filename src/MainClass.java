public class MainClass
{
    public static void main(String[] args) {
        Thread t=Thread.currentThread();
        System.out.println(t);
        System.out.println(t.getName());
        t.setName("MyThread");
        System.out.println(t.getName());
        System.out.println(t.getPriority());
        t.setPriority(10);
        System.out.println(t.getPriority());
        System.out.println(t.isAlive());
        System.out.println(t.isInterrupted());
        //join()-ожидает завершения потока
        //run()
        //sleep()
        //start()

    }
}
