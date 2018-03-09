package utils;

import java.io.File;

import org.dom4j.DocumentException;
import org.junit.Test;

public class XMLUtilsTest {	
	
	@Test
	//succeed
	public void getProperty() throws DocumentException {
		String path = this.getClass().getResource("/xmldata.xml").getPath();
		String data = util.XMLUtils.getProperty(path,"//conf/user/name");
		System.out.println(data);
	}

	@Test
	public void test2() {
		 File f = new File(this.getClass().getResource("/xmldata.xml").getPath());
         System.out.println(f);
		
	}
}
