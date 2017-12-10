/*
 * 关羽千里走单骑，需要连过3关。如果关羽武力x与守将武力y的差满足条件：（x-y）2+（x-y）+41是素数，
 * 则关羽能够通过该关；如果不是素数，则关羽无法通过该关。
 * 输入描述：首先输入关羽的武力x，以及3关守将的武力y1，y2，y3，（所有人的武力选择范围是0-50，如果不是请提示重新输入）。
 * 输出描述：如果关羽全部通关成功，则输出Win，如果失败，则输出失败关的序号(序号从1开始)。
 * 样例输入：50 49 48 47
 * 样例输出：Win
 */

package ts1_6;

import java.util.Scanner;

public class ts1_6 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int x,y1,y2,y3; 
		System.out.println("关羽千里走单骑游戏开始");
		System.out.println("请输入关羽的武力值：");
		x = scanner.nextInt();
		while(defendNum(x)){
			System.out.println("请重新输入关羽的武力值(0~50)：");
			x = scanner.nextInt();
		}
		System.out.println("请输入第一名守将的武力值：");
		y1 = scanner.nextInt();
		while(defendNum(y1)){
			System.out.println("请重新输入第一名守将的武力值(0~50)：");
			y1 = scanner.nextInt();
		}
		System.out.println("请输入第二名守将的武力值：");
		y2 = scanner.nextInt();
		while(defendNum(y2)){
			System.out.println("请重新输入第二名守将的武力值(0~50)：");
			y2 = scanner.nextInt();
		}
		System.out.println("请输入第三名守将的武力值：");
		y3 = scanner.nextInt();
		while(defendNum(y3)){
			System.out.println("请重新输入第三名守将的武力值(0~50)：");
			y3 = scanner.nextInt();	
		}
		
		//开始闯关
		if(pk(x,y1)){
			System.out.println("项羽死在了第1关");
		}
		else if(pk(x,y2)){
			System.out.println("项羽死在了第2关");
		}
		else if(pk(x,y3)){
			System.out.println("项羽死在了第3关");
		}
		else 
			System.out.println("Win");
		
	}
	
	static boolean defendNum(int i){
		if(i > 0 && i <= 50){
			return false;
		}
		else 
			return true;
	}
	
	//是素数闯关成功
	static boolean pk(int a, int b){
		int temp = (a-b)*(a-b) + (a-b) + 41;
		if(temp < 2){
			return false;
		}
		else{
			for(int i = 2; i <= Math.sqrt(temp); i++){
				if(temp % i == 0){
					return true;
				}
			}
		}
		return false;
	}
}
