package jerry.jtuple;

public class Tuple3<T1, T2 , T3> extends Tuple2<T1, T2> {
	protected T3 t3;
	
	public final static <T1,T2,T3> Tuple3<T1,T2,T3> with(final T1 t1,final T2 t2,final T3 t3) {
		Tuple3<T1,T2,T3> tuple = new Tuple3<T1,T2,T3>();
		tuple.t1 = t1;
		tuple.t2 = t2;
		tuple.t3 = t3;
		return tuple;
	}
	
	public final T3 getValue3() {
		return t3;
	}
}
