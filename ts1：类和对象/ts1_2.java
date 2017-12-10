/*
 * 利用下列公式计算pi的近似值，要求精确到10-6为止。
 * Pi/4  ≈ 1-1/3 + 1/5 - 1/7 + …
 */

package ts1_2;
	
public class ts1_2 {
	public static void main(String[] args){
		double i = 1.0;
		double n = 1.0;
		double p = 0.0;
		double x = 0.0;
		do{
			x = i / n;
			p += x;
			i *= -1;
			n += 2.0;
		}while(Math.abs(x) > Math.pow(10, -6));
		System.out.println("Pi/4 = "+ p);
	}
}
