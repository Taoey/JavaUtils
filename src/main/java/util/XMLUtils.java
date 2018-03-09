package util;

import java.io.File;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

public class XMLUtils {
	
	/**
	 * 建立一个xml文件
	 */
	public static void  createXML() {
		
	}
	
	/**
	 * 获取特定的XML属性
	 * @param propertyName
	 * @return
	 * @throws DocumentException 
	 */
	public static String getProperty(String path , String propertyName) throws DocumentException {
		String key="";
		SAXReader saxReader = new SAXReader();
		File f = new File(path);
		Document  document = saxReader.read(f);
		key = document.selectSingleNode(propertyName).getText();
		
		
		return key;
	}
	
	/**
	 * 修改XML属性和值
	 * @param propertyName
	 * @param propertyKey
	 * @return
	 * @throws DocumentException 
	 */
	public static String updateProperty(File f, String propertyName , String propertyKey) throws DocumentException {
		SAXReader saxReader = new SAXReader();
		Document  document = saxReader.read(f);
		
		
		
		return propertyKey;
	}
	
	/**
	 * 删除特定的XML属性对应的值
	 * @param propertyName
	 */
	public static void deleteProperty(String propertyName) {
		
	}
}
