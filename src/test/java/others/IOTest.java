/**
* @author 黄为涛
* @time 2018年1月16日 下午7:57:07
* @projectName JavaUtils
*
**/
package others;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

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
	
	/**
	 * 打开一个gbk文件，并将其保存为utf-8 文件（Linux系统下）
	 * @throws IOException
	 */
	@Test 
	public void test1() throws IOException {
		//获得文件流
		FileInputStream fileInputStream = new FileInputStream(new File("/home/taoey/temp/gbkFile.txt"));
		//获得解码流
		InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream,"GBK");
		//获得缓存流(内存中的数据)
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		String s = "";	
		//获得输出文件流
		FileOutputStream fileOutputStream = new FileOutputStream(new File("/home/taoey/temp/utf-8.txt"));
		//缓存流到文件输出流
		OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "UTF-8");
		while ((s = bufferedReader.readLine()) != null) { // 判断最后一行不存在，为空结束循环
			outputStreamWriter.write(s);// 将要写入文件的内容，写入到新文件
		}
		
		fileInputStream.close();
		inputStreamReader.close();
		
		outputStreamWriter.flush();
		outputStreamWriter.close();
		fileOutputStream.flush();
		fileInputStream.close();
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
