/**
* @author 黄为涛
* @time 2018年1月16日 上午10:42:27
* @projectName JavaUtils
*
**/
package utils;

import java.io.IOException;

import org.junit.Test;

import util.PropertiesUtil;

public class PropertiesUtilTest {
	
	@Test
	public void getProperty() throws IOException {
		String path = PropertiesUtil.class.getClassLoader().getResource("config.properties").getPath();
		System.out.println(path);
		String property = util.PropertiesUtil.getProperty(path,"sex");
		System.out.println(property);
	}
	@Test
	public void addProperty() throws IOException {
		String path = PropertiesUtil.class.getClassLoader().getResource("config.properties").getPath();
		util.PropertiesUtil.setProperty(path, "sex", "1");
		util.PropertiesUtil.setProperty(path, "hair", "3");
	}

}
