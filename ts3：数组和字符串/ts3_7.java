/*
 * 定义一个类A，包含一个int型数据成员i及必要的方法。另外定义一个主类，在主类的main方法中，
 * 创建一个有5个元素的A类对象数组a，并将这些元素的数据成员i值分别初始化为10、5、8、2、6。
 * 利用Arrays类对数组a进行排序并输出结果，然后在其中查找是否存在用户输入的元素值并输出结果。
 */

package ts3_7;

import java.util.Arrays;
import java.util.Scanner;

class A implements Comparable{
	private int i;	
	public A(int i){
		this.i = i;
	}	
	public int get(){
		return this.i;
	}
    public int compareTo(Object o) {
        A s = (A) o;
        int result = i > s.i ? 1 : (i == s.i ? 0 : -1);
        return result;  
     }  
}

public class ts3_7 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		A[] a = new A[5];
		A[] b = new A[5];
		int j;
		System.out.println("请输入数组初始化所需的5个元素：");
//		int[] numFora = {10, 5, 8, 2, 6};
		for(j = 0; j < 5; j++){
			b[j] = new A(scanner.nextInt());
			a[j] = new A(b[j].get());
		}
		//利用Arrays类对数组a进行排序并输出结果
		System.out.println("利用Arrays类对数组进行排序后得到：");
		Arrays.sort(a);
		for(j = 0; j < 5; j++){
			System.out.print(a[j].get()+" ");
		}
		System.out.println();
		//在排序后的数组中查找是否存在用户输入的元素值
		System.out.println("*************************");
		boolean tmp = true;
		for(j = 0; j < 5; j++){
			if(Arrays.binarySearch(a, b[j]) == -1){
				System.out.println("排序后的新数组中不存在用户原先输入的"+b[j]);
				tmp = false;
			}
		}
		if(tmp)
			System.out.println("排序后的新数组中存在所有用户输入的元素");
	}
}

