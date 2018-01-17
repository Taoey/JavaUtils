/**
* @author 黄为涛
* @time 2018年1月16日 上午10:41:52
* @projectName JavaUtils
* 
* 用于操作*.properties和*.XML 文件的工具类
* 
* the utility function for XML files and properties files,to load and set datas in these files.
*
**/
package utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Properties;

public class PropertiesUtil {
	/**
	 * 获取某一路径下的property中的属性
	 * @param path      绝对路径
	 * @param key       键
	 * @return
	 * @throws IOException
	 */
	public static String getProperty(String path ,String key) throws IOException {
		BufferedReader br = null;
		Properties datas = new Properties();
		br = new BufferedReader(new InputStreamReader(new  FileInputStream(path), "UTF-8"));
		datas.load(br);
		String value =  datas.getProperty(key);
		
		br.close();
		return value;
		
	}
	/**
	 * 增加/更新一个键值对
	 * 如果原文件中有该属性，修改；反之添加该属性
	 * @param path
	 * @param key
	 * @param value
	 * @throws IOException
	 */
	public static void setProperty(String path,String key,String value) throws IOException {
		/**
		 * 原理：首先加载一个文件到Properties对象，然后对该对象进行操作，之后重新写入到这个文件中（将FileOutputStream构造方法中的append设置为false（或者设置该属性，详情查看文档FileOutputStream的构造方法））
		 */
		BufferedWriter bw = null;
		BufferedReader br = null;
		
		Properties datas = new Properties();		
		br = new BufferedReader(new InputStreamReader(new  FileInputStream(path), "UTF-8"));		
		datas.load(br);
		//要先加载后在建立BufferedWriter，如果在先建立BufferWriter，则文件中的内容会先被清空，BufferReader不会读取到内容（暂时的个人立即）
		bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path), "UTF-8"));
		datas.setProperty(key, value);
		datas.store(bw, "\r");
		
		br.close();
		bw.close();
		//System.out.println(datas.toString());
		
	}
 
}
