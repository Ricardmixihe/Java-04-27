package com.jizhong.demo;

import java.util.Scanner;

/**
 * 
 * 
 * if判断结构：
 * 	语法：
 * 		if(boolean表达式){
 * 			if代码块;
 * 		}else{
 * 			else代码块;
 * 		}
 *
 * 	&&	："与"符号，条件同j时满足则返回true，只要有一个条件不满足则返回false
 * 	||	："或"符号，多个条件满足一个即返回true
 * 	!	：如果返回值为true则是false，返回值为false则是true
 */
public class Demo03_if {
	public static void main(String[] args) {
		//判断悟空支出是否大于100   如果大于"念紧箍咒"，小于则什么都不执行
		//1. 获取控制台扫描对象
//		Scanner sc = new Scanner(System.in);
//		//2. 扫描得到输入结果返回给"悟空"变量中
//		double wukong = sc.nextDouble();
//		//3. 如果悟空大于100，"念紧箍咒"
//		if(wukong > 100){	//满足条件，执行代码块
//			System.out.println("紧箍咒！！！！！");
//		}else{
//			System.out.println("悟空吃桃子！！！");
//		}
//		//4. 关闭
//		sc.close();
		
		/*
		 *  &&	："与"符号，条件同时满足则返回true，只要有一个条件不满足则返回false
		 *  ||	："或"符号，多个条件满足一个即返回true
		 *  !	：如果返回值为true则是false，返回值为false则是true
		 * */
		//判断悟空支出小于80，并且给唐僧买1个糖包贿赂
		//或者
		//判断悟空支出小于90，并且给唐僧买2个糖包贿赂
		//满足条件给桃子吃
//		int pay = 70;
//		int baozi = 1;
//		//						   true
//		// 			true            || 	       false
//		if((pay < 80 && baozi == 1) || (pay < 90 && baozi == 2)){
//			System.out.println("悟空吃桃子！！！");
//		}else{
//			System.out.println("紧箍咒");
//		}
		
//		if((true && true) || (true && false)){
//			System.out.println("悟空吃桃子！！！");
//		}else{
//			System.out.println("紧箍咒");
//		}
//		
//		if (true || false) {
//			
//		}else{
//			System.out.println("紧箍咒");
//		}
//		
//		if (true) {
//			System.out.println();
//		}else{
//			System.out.println("紧箍咒");
//		}
		
		int pay = 70;
		//如果支出大于100
//		if(pay > 100){
//			System.out.println("念紧箍咒100遍！！！！");
//		}		
//		//如果支出小于等于100
//		if(pay <= 100){
//			System.out.println("奖励悟空桃子！！！！");
//		}
		
		if(pay > 100){
			System.out.println("念紧箍咒100遍！！！！");
		}else{
			System.out.println("奖励悟空桃子！！！！");
		}
		
		
		
		
		
	}
}
