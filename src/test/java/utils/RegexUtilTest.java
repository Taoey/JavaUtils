package utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

public class RegexUtilTest {

	/**
	 * 正则的标准写法
	 */
	@Test
	public void test0() {
		String reg = "";
		String source = "";
		Matcher m = Pattern.compile(reg).matcher(source);
		
		while(m.find()) {
			String result = m.group(0);
			System.out.println(result);
		}
		
	}		
	/**
	 * 测试文本是否匹配成功
	 */
	@Test
	public void test1() {
		
		Pattern p = Pattern.compile("a*b");
		Matcher m = p.matcher("aaaaab");
		boolean b = m.matches();
		
		System.out.println("b:"+b);
		
		boolean c = Pattern.matches("a*b", "aaaaab");
		System.out.println("c:"+c);
	}
	
	@Test
	public void test2() {
		String str="aaaaab";
		Pattern p = Pattern.compile("a*b");
		Matcher m = p.matcher(str);
		if(m.find()) {
			String result = m.group(1);
			System.out.println(result);
		}
	}

	
	
	
	
}
