package jerry.jtuple;

public class Tuple4<T1, T2, T3 ,T4> extends Tuple3<T1, T2, T3> {
	protected T4 t4;
	
	public final static <T1,T2,T3,T4> Tuple4<T1,T2,T3,T4> with(final T1 t1,final T2 t2,final T3 t3,final T4 t4) {
		Tuple4<T1,T2,T3,T4> tuple = new Tuple4<T1,T2,T3,T4>();
		tuple.t1 = t1;
		tuple.t2 = t2;
		tuple.t3 = t3;
		tuple.t4 = t4;
		return tuple;
	}
	
	public final T4 getValue4() {
		return t4;
	}
}
