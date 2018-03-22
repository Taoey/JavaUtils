package others;

import org.junit.Test;

public class DailyTest {
	
	/**
	 * int类型和Integer类型对比
	 */
	@Test
	public void tese00() {		
		Integer f0 = new Integer(100);
        Integer f1 = 100, f2 = 100, f3 = 150, f4 = 150; //自动装箱成Integer类型
        int f5 = 100;
        System.out.println(f0 == f1);  //false 两个引用没有引用同一对象
        System.out.println(f1 == f2);  //true 整型字面量的值在-128到127之间，那么不会new新的Integer对象，而是直接引用常量池中的Integer对象
        System.out.println(f3 == f4);  //false
        System.out.println(f0 == f5);  //true f0自动拆箱成int类型再和c比较
	}
}
