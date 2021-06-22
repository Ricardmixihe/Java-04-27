package com.jizhong.demo;
/**
 * 多重判断语法：
 * 	if(boolean表达式1){
 * 		表达式1满足执行代码;
 * 	}else if(boolean表达式2){
 * 		表达式2满足执行代码;
 * 	}else{
 * 		if条件都不满足，则最终执行代码;
 * 	}
 *
 */
public class Demo04_elseIf {
	public static void main(String[] args) {
		//0-40元、40-60元、60-80元、80-100元及100元以上
		/*
		 * 
		 * 悟空的采购支出低于100元，奖励香蕉一根，
		 * 低于80元，奖励桃子一个，
		 * 低于60元奖励奖励香蕉一根桃子一个，
		 * 40元以下奖励两个桃子。
		 * 超过100元则念紧箍咒100遍。
		 * */
//		int pay = 101;//支出金额
//		if(pay >= 0 && pay < 40){	// 0~40
//			System.out.println("奖励两个桃子！！！！！");
//		}else if(pay >= 40 && pay < 60){	//40~60
//			System.out.println("奖励香蕉一根桃子一个");
//		}else if(pay >= 60 && pay < 80){	//60~80
//			System.out.println("奖励一个桃子！！！！！");
//		}else if(pay >= 80 && pay <= 100){	//80~100
//			System.out.println("奖励香蕉一根");
//		}else{	//超出100块
//			System.out.println("念紧箍咒100遍");
//		}
		
		boolean b = false;
		System.out.println(b);
		if (!b) {
			System.out.println("我是假的！！！");
		}else{
			System.out.println("我是真的！！！");
		}
	}
}
