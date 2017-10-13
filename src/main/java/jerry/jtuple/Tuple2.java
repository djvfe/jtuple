package jerry.jtuple;

public class Tuple2<T1,T2> extends Tuple1<T1> {
	protected T2 t2;
	
	public final static <T1,T2> Tuple2<T1,T2> with(final T1 t1,final T2 t2) {
		Tuple2<T1,T2> tuple = new Tuple2<T1,T2>();
		tuple.t1 = t1;
		tuple.t2 = t2;
		return tuple;
	}
	
	public final T2 getValue2() {
		return t2;
	}
}
