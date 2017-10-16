package jerry.jtuple;
/**
 * 元组接口
 * @author jerry.deng
 *
 */
public interface Tuple {
	/**
	 * 获取元组的第一个值
	 * @return
	 */
	public <T> T getValue0();
	/**
	 * 获取元组的第二个值
	 * @return
	 */
	public <T> T getValue1();
	/**
	 * 获取元组的第三个值
	 * @return
	 */
	public <T> T getValue2();
	/**
	 * 获取元组的第死个值
	 * @return
	 */
	public <T> T getValue3();
	/**
	 * 获取元组的第五个值
	 * @return
	 */
	public <T> T getValue4();
	/**
	 * 获取元组的第六个值
	 * @return
	 */
	public <T> T getValue5();
	/**
	 * 获取元组的第七个值
	 * @return
	 */
	public <T> T getValue6();
	/**
	 * 获取元组的第八个值
	 * @return
	 */
	public <T> T getValue7();
	/**
	 * 获取元组的第九个值
	 * @return
	 */
	public <T> T getValue8();
	/**
	 * 获取元组的第十个值
	 * @return
	 */
	public <T> T getValue9();
	/**
	 * 获取元组的元素个数
	 * @return
	 */
	public int getSize();
}
