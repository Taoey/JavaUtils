/**
* @author 黄为涛
* @time 2018年1月16日 上午10:28:50
* @projectName JavaUtils
*
**/
package utils;

import java.io.IOException;

import org.junit.Test;

public class StringUtilTest {
 
	@Test
	public void addString2File() {
		utils.StringUtil.addString2File("D://data.txt", "test");
		//utils.FileUtil.addString2File("D://data//data.txt", "test");   //抛出异常，失败(data文件夹不存在)
	}
	
	@Test
	public void string2File() throws IOException {
		utils.StringUtil.string2File("test1133", "D://data.txt");
	}
	
}
