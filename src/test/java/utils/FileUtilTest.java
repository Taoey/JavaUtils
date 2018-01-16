/**
* @author 黄为涛
* @time 2018年1月16日 上午10:42:27
* @projectName JavaUtils
*
**/
package utils;

import org.junit.Test;

public class FileUtilTest {
	
	@Test
	public void addString2File() {
		utils.FileUtil.addString2File("D://data.txt", "test");
		//utils.FileUtil.addString2File("D://data//data.txt", "test");   //抛出异常，失败(data文件夹不存在)
	}

}
