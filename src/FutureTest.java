import java.util.concurrent.*;

/**
 * Created by feng on 2017/9/15.
 */
public class FutureTest implements Callable<Integer>{
    private int a,b;
    public FutureTest(int a,int b){
        this.a =a;
        this.b=b;
    }

    @Override
    public Integer call() throws Exception {
        Integer result = a+b;
        return result;
    }

    public static void main(String[]args)throws InterruptedException,ExecutionException{
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer>future = executor.submit(new FutureTest(1,2));
        if(future.isDone()==true){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        
        System.out.println("start");
        Integer result = future.get();
        if(future.isDone()==true){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        System.out.println("end:"+result);
    }
}
