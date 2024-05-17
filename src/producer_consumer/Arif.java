package producer_consumer;

public class Arif {
    int num;
    boolean valueSet=false;
    public synchronized void put(int num){
        while(valueSet){
            try{
                wait();
            }catch(Exception e){
            }
            System.out.println("put"+num);
            this.num=num;
            valueSet=true;
            notify();
        }
    }
    public synchronized void get(){
        while(!valueSet){
            try{
                wait();
            }catch(Exception e){

            }
            System.out.println("get"+num);
            valueSet=false;
            notify();
        }
    }
    static class producer implements Runnable{
        Arif a;
        public producer(Arif a){
            this.a=a;
            Thread t=new Thread(this,"producer");
            t.start();
        }
        public void run(){
            int i=0;
            while(i<=10){
                a.put(i++);
                try{
                    Thread.sleep(1000);
                }catch(Exception e){}
            }
        }
    }
    static class  consumer implements Runnable{
        Arif a;
        public consumer(Arif a){
            this.a=a;
            Thread t=new Thread(this,"consumer");
            t.start();
        }
        public void run(){
            int i=0;
            while(i<=10){
                a.get();
                try{
                    Thread.sleep(1000);
                }catch(Exception e){}
            }
        }
    }
    public static void main(String[] args) {
        Arif a=new Arif();
        new producer(a);
        new consumer(a);
    }
}
