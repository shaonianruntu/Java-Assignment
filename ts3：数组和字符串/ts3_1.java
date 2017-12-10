/*
 * 定义一个10个元素组成的一维数组，输出该数组中的最大值、最小值、所有元素
 * 总和，以及最大值和最小值在该数组中的位置。
 */

package ts3_1;

public class ts3_1 {
	public static void main(String[] args){
		int[] arr1 = {11,32,3,14,25,6,17,28,39,0};
		int maxNum, minNum, sumNum;
		int maxIndex, minIndex;
		//initialization
		maxNum = minNum = arr1[0];
		maxIndex = minIndex = 0;
		sumNum = arr1[0];
		for(int i = 1; i < arr1.length; i++){
			if(arr1[i] > maxNum){
				maxNum = arr1[i];
				maxIndex = i;
			}
			if(arr1[i] < minNum){
				minNum = arr1[i];
				minIndex = i;
			}
			sumNum += arr1[i];
		}
		//print
		System.out.println("该数组的最大值"+maxNum+"是该数组的第"
				+(maxIndex+1)+"个元素");
		System.out.println("该数组的最小值"+minNum+"是该数组的第"
				+(minIndex+1)+"个元素");
		System.out.println("该数组的总和是"+sumNum);		
	}
}
