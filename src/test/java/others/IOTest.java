/**
* @author 黄为涛
* @time 2018年1月16日 下午7:57:07
* @projectName JavaUtils
*
**/
package others;

import java.io.File;

import org.junit.Test;

public class IOTest {
	
	/**
	 * File 操作
	 * 获取类的加载路径
	 * /home/taoey/mywork/java/workspace/JavaUtils/target/test-classes
	 */
	@Test
	public void test0() {
        File f = new File(this.getClass().getResource("/").getPath());
        System.out.println();

		
	}

}
