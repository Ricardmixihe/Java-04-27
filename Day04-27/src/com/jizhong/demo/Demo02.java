package com.jizhong.demo;

/**
 * 逻辑运算符： > < == >= <= !=
 * 
 * 字符串进行判断：
 * 		==           ：会判断值和内存地址值
 * 		str.equals() ：只会判断两个字符串的值是否一样，不会判断内存地址值
 *
 */
public class Demo02 {
	public static void main(String[] args){
		//八戒一天吃200馒头  沙僧吃120馒头       (沙同学，看不出来你那么精瘦的样子，竟然比八戒老兄吃的还多啊！) 判断这句话的真假
//		int bajie = 200;	//八戒 200
//		int shaseng = 120;	//沙僧 120
//		boolean b = shaseng > bajie;
//		System.out.println(b);	//false 说明上面的话是假的
		
//		String str1 = "a";
//		String str2 = "a";
//		System.out.println(str1 == str2);
		
		String str1 = new String("a");
		String str2 = new String("a");
		
		//字符串值判断
		boolean b = str1.equals(str2);
		System.out.println(b);
	}
}
