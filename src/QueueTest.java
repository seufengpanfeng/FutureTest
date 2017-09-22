import java.util.*;

/**
 * Created by feng on 2017/9/17.
 */
public class QueueTest <T,V>{
    public static <T> Set<T>union(Set<T>s1,Set<T>s2){
        Set<T>result = new HashSet<T>(s1);
        return result;
    }

    public static <T,V> HashMap<T,V> newHashMap(){
        return new HashMap<T, V>();
    }
    public static void main(String[]args){
        String s1 = new String("abc");
        String s2 = new String("abc");
        Set<Integer>set = new HashSet<>();
        System.out.println(s1.compareTo(s2));

    }


}
