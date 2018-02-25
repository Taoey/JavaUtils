/**
* @author 黄为涛
* @time 2018年1月16日 上午10:28:33
* @projectName JavaUtils
*
**/
package util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class StringUtil {
	/**
	 * string到本地文件的转换
	 * @param str     要写入的内容
	 * @param path    文件的绝对路径
	 * @throws IOException
	 */
	public static void string2File(String str,String path) throws IOException {
		File file=new File(path);
		if(!file.exists()){
			file.createNewFile();
		}
		
		OutputStream out=new FileOutputStream(file);
		BufferedWriter   rd   =   new BufferedWriter(new OutputStreamWriter(out,"utf-8"));
		rd.write(str);
		rd.close();
		out.close();
	}

    /**   
     * 追加String：使用FileWriter   
     * 如果文件不存在则创建，如果包含不存在的文件夹则会出现异常
     * 
     * @param fileName   文件的绝对路径
     * @param content    string内容
     */    
    public static void addString2File(String fileName, String content) {   
        FileWriter writer = null;  
        try {     
            // 打开一个写文件器，构造函数中的第二个参数true表示以追加形式写文件     
            writer = new FileWriter(fileName, true);     
            writer.write(content);       
        } catch (IOException e) {     
            e.printStackTrace();     
        } finally {     
            try {     
                if(writer != null){  
                    writer.close();     
                }  
            } catch (IOException e) {     
                e.printStackTrace();     
            }     
        }   
    } 

}
