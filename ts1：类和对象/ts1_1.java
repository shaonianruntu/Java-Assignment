/*
 * 设计猜数游戏程序，实现如下功能：程序可随机产生一个[1,100]之间的整数，用户通过键盘输入所猜的数。
 * 如果猜对，则结束程序；如果猜的数比实际的数大，则给出提示“太大”，如果猜的数比实际的数小，则给出
 * 提示“太小”，继续猜，直到猜对为止。提示：Math.random()可以随机产生一个[0,1)之间的实数。
 */

package ts1_1;

import java.util.Scanner;

public class ts1_1 {
	public static void main(String[] args){
		int randomNumber = (int)(Math.random() * 100);
		int guessNumber = 0;
		Scanner scanner = new Scanner(System.in);
		while(true){
			System.out.print("请输入你预测的数：");

			guessNumber = scanner.nextInt();
			if(guessNumber > randomNumber){
				System.out.print("你猜的数太大了,");
			}	
			else if(guessNumber < randomNumber){
				System.out.print("你猜的数太小了,");
			}
			else{
				System.out.println("恭喜你，猜对了!");
				break;
			}
		}
	}
}
