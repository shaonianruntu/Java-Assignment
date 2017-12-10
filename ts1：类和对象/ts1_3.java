/*
 * 用重载方法实现两个整数或3个浮点数的排序，按照从小到大的顺利将排序结果输出。
 */

package ts1_3;

import java.util.Scanner;

public class ts1_3 {
	public static void main(String[] args){
		int ia,ib;
		double da,db,dc;
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入两个整数：");
		ia = scanner.nextInt();
		ib = scanner.nextInt();
		sort(ia, ib);
		System.out.println("请输入三个浮点数：");
		da = scanner.nextDouble();
		db = scanner.nextDouble();
		dc = scanner.nextDouble();
		sort(da, db, dc);
		
	}
	
	//从小到大的顺序
	public static void sort(int a, int b){
		int temp;
		if(a > b){
			temp = a;
			a = b;
			b = temp;
		}
		System.out.println("排序后:"+a+"\t"+b);
	}
	
	public static void sort(double a, double b, double c){
		double temp;
		if(a > b){
			temp = a;
			a = b;
			b = temp;
		}
		if(b > c){
			temp = b;
			b = c;
			c = temp;
		}
		if(a > b){
			temp = a;
			a = b;
			b = temp;
		}
		System.out.println("排序后:"+a+"\t"+b+"\t"+c);
	}	
}
 