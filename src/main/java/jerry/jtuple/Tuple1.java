package jerry.jtuple;

public class Tuple1 <T1> {
	protected T1 t1;
	
	public final static <T1> Tuple1<T1> with(final T1 t1) {
		Tuple1<T1> tuple = new Tuple1<T1>();
		tuple.t1 = t1;
		return tuple;
	}
	
	public final T1 getValue1() {
		return t1;
	}
}
