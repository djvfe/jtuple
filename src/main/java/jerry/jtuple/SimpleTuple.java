package jerry.jtuple;
/**
 * java 元组
 * @author jerry.deng
 * 2017.10.13
 * @param <T0>
 * @param <T1>
 * @param <T2>
 * @param <T3>
 * @param <T4>
 * @param <T5>
 * @param <T6>
 * @param <T7>
 * @param <T8>
 * @param <T9>
 */
public final class SimpleTuple<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9> implements Tuple {
	private T0 value0;
	private T1 value1;
	private T2 value2;
	private T3 value3;
	private T4 value4;
	private T5 value5;
	private T6 value6;
	private T7 value7;
	private T8 value8;
	private T9 value9;
	
	private int size;
	
	private SimpleTuple() {}
	
	/**
	 * 获得长度
	 */
	public int getSize() {
		return size;
	}
	private static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9> Tuple valueSet(SimpleTuple<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9> tuple,
			T0 value0,T1 value1,T2 value2,T3 value3,T4 value4,T5 value5,T6 value6,T7 value7,T8 value8,T9 value9) {
		if(value0!=null) {
			tuple.value0 = value0;
			tuple.size = 1;
		}
		if(value1!=null) {
			tuple.value1 = value1;
			tuple.size = 2;
		}
		if(value2!=null) {
			tuple.value2 = value2;
			tuple.size = 3;
		}
		if(value3!=null) {
			tuple.value3 = value3;
			tuple.size = 4;
		}
		if(value4!=null) {
			tuple.value4 = value4;
			tuple.size = 5;
		}
		if(value5!=null) {
			tuple.value5 = value5;
			tuple.size = 6;
		}
		if(value6!=null) {
			tuple.value6 = value6;
			tuple.size = 7;
		}
		if(value7!=null) {
			tuple.value7 = value7;
			tuple.size = 8;
		}
		if(value8!=null) {
			tuple.value8 = value8;
			tuple.size = 9;
		}
		if(value9!=null) {
			tuple.value9 = value9;
			tuple.size = 10;
		}
		return tuple;
	}
	/**
	 * 长度为1的元组设值
	 * @param t0
	 * @return
	 */
	public static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9> Tuple with(T0 t0) {
		return valueSet(new SimpleTuple<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9>(), t0, null, null, null, null, null, null, null, null, null);
	}

	/**
	 * 长度为2的元组设值
	 * @param t0
	 * @param t1
	 * @return
	 */
	public static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9> Tuple with(T0 t0, T1 t1) {
		return valueSet(new SimpleTuple<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9>(), t0, t1, null, null, null, null, null, null, null, null);
	}

	/**
	 * 长度为3的元组设值
	 * @param t0
	 * @param t1
	 * @param t2
	 * @return
	 */
	public static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9> Tuple with(T0 t0, T1 t1, T2 t2) {
		return valueSet(new SimpleTuple<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9>(), t0, t1, t2, null, null, null, null, null, null, null);
	}

	/**
	 * 长度为4的元组设值
	 * @param t0
	 * @param t1
	 * @param t2
	 * @param t3
	 * @return
	 */
	public static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9> Tuple with(T0 t0, T1 t1, T2 t2, T3 t3) {
		return valueSet(new SimpleTuple<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9>(), t0, t1, t2, t3, null, null, null, null, null, null);
	}

	/**
	 * 长度为5的元组设值
	 * @param t0
	 * @param t1
	 * @param t2
	 * @param t3
	 * @param t4
	 * @return
	 */
	public static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9> Tuple with(T0 t0, T1 t1, T2 t2, T3 t3, T4 t4) {
		return valueSet(new SimpleTuple<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9>(), t0, t1, t2, t3, t4, null, null, null, null, null);
	}

	/**
	 * 长度为6的元组设值
	 * @param t0
	 * @param t1
	 * @param t2
	 * @param t3
	 * @param t4
	 * @param t5
	 * @return
	 */
	public static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9> Tuple with(T0 t0, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
		return valueSet(new SimpleTuple<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9>(), t0, t1, t2, t3, t4, t5, null, null, null, null);
	}

	/**
	 * 长度为7的元组设值
	 * @param t0
	 * @param t1
	 * @param t2
	 * @param t3
	 * @param t4
	 * @param t5
	 * @param t6
	 * @return
	 */
	public static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9> Tuple with(T0 t0, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
		return valueSet(new SimpleTuple<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9>(), t0, t1, t2, t3, t4, t5, t6, null, null, null);
	}

	/**
	 * 长度为8的元组设值
	 * @param t0
	 * @param t1
	 * @param t2
	 * @param t3
	 * @param t4
	 * @param t5
	 * @param t6
	 * @param t7
	 * @return
	 */
	public static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9> Tuple with(T0 t0, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
		return valueSet(new SimpleTuple<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9>(), t0, t1, t2, t3, t4, t5, t6, t7, null, null);
	}

	/**
	 * 长度为9的元组设值
	 * @param t0
	 * @param t1
	 * @param t2
	 * @param t3
	 * @param t4
	 * @param t5
	 * @param t6
	 * @param t7
	 * @param t8
	 * @return
	 */
	public static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9> Tuple with(T0 t0, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7,
			T8 t8) {
		return valueSet(new SimpleTuple<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9>(), t0, t1, t2, t3, t4, t5, t6, t7, t8, null);
	}

	/**
	 * 长度为10的元组设值
	 * @param t0
	 * @param t1
	 * @param t2
	 * @param t3
	 * @param t4
	 * @param t5
	 * @param t6
	 * @param t7
	 * @param t8
	 * @param t9
	 * @return
	 */
	public static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9> Tuple with(T0 t0, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7,
			T8 t8, T9 t9) {
		return valueSet(new SimpleTuple<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9>(), t0, t1, t2, t3, t4, t5, t6, t7, t8, t9);
	}
	
	private void getValueCheck(int i) {
		if(i>getSize()) {
			throw new IllegalArgumentException("Have not enough size to get value from tuple. Size is " + getSize());
		}
	}

	@SuppressWarnings("unchecked")
	public T0 getValue0() {
		getValueCheck(1);
		return value0;
	}

	@SuppressWarnings("unchecked")
	public T1 getValue1() {
		getValueCheck(2);
		return value1;
	}

	@SuppressWarnings("unchecked")
	public T2 getValue2() {
		getValueCheck(3);
		return value2;
	}

	@SuppressWarnings("unchecked")
	public T3 getValue3() {
		getValueCheck(4);
		return value3;
	}

	@SuppressWarnings("unchecked")
	public T4 getValue4() {
		getValueCheck(5);
		return value4;
	}

	@SuppressWarnings("unchecked")
	public T5 getValue5() {
		getValueCheck(6);
		return value5;
	}

	@SuppressWarnings("unchecked")
	public T6 getValue6() {
		getValueCheck(7);
		return value6;
	}

	@SuppressWarnings("unchecked")
	public T7 getValue7() {
		getValueCheck(8);
		return value7;
	}

	@SuppressWarnings("unchecked")
	public T8 getValue8() {
		getValueCheck(9);
		return value8;
	}

	@SuppressWarnings("unchecked")
	public T9 getValue9() {
		getValueCheck(10);
		return value9;
	}

}
