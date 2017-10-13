package jerry.jtuple;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
    	Tuple tuple = with("aaaaa", 123, "bbbbb");
    	System.out.println("tuple.size : " + tuple.getSize());
    	System.out.println(tuple.getValue0().getClass() + " : " + tuple.getValue0());
        System.out.println(tuple.getValue1().getClass() + " : " + tuple.getValue1());
        System.out.println(tuple.getValue2().getClass() + " : " + tuple.getValue2());
        
        Map<String,Integer> map = new HashMap<String, Integer>();
        map.put("abc", 1);
        map.put("def", 2);
        tuple = with("aaaaa", 123, "bbbbb",map);
    	System.out.println("tuple.size : " + tuple.getSize());
        System.out.println(tuple.getValue3().getClass() + " : " + tuple.getValue3());
        
        Map<String,Integer> m = tuple.getValue3();
        
        
        Tuple2 tuple2 = Tuple2.with("aaaaa", 123);
    	System.out.println(tuple2.getValue1().getClass() + " : " + tuple.getValue1());
    	System.out.println(tuple2.getValue2().getClass() + " : " + tuple.getValue2());
    }
    
	private static Tuple with(String a,Integer b,String c) {
		return SimpleTuple.with(a,b,c);
	}
	private static Tuple with(String a,Integer b,String c,Map<String,Integer> d) {
		return SimpleTuple.with(a,b,c,d);
	}
}
