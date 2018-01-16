/**
* @author 黄为涛
* @time 2018年1月16日 上午10:41:52
* @projectName JavaUtils
*
**/
package utils;

import java.io.FileWriter;
import java.io.IOException;

public class FileUtil {

    /**   
     * 追加文件：使用FileWriter   
     * 如果文件不存在则创建，如果包含不存在的文件夹则会出现异常
     * 
     * @param fileName   文件的绝对路径
     * @param content   
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
