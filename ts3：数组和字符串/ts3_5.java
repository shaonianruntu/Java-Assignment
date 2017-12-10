/*
 * 编写程序，定义一个2行10列的数组，将数组第1行的数据从小到大排序，第2行数据从大到小排序。
 */

package ts3_5;

public class ts3_5 {
	public static void main(String[] args){
		int[][] arr = {
				{11,32,3,14,25,6,17,28,39,0},
				{11,32,3,14,25,6,17,28,39,0}
		};
		int i, j, k;
		int key1, key2;
		//差值排序
		for(i = 1; i < arr[0].length; i++){
			j = i - 1;
			k = i - 1;
			key1 = arr[0][i];
			key2 = arr[1][i];
			//第一行从小到大排序
			for(; j >= 0 && key1 < arr[0][j]; j--){
				arr[0][j+1] = arr[0][j];
			}
			arr[0][j+1] = key1;
			//第二行从大到小排序
			for(; k >= 0 && key2 > arr[1][k]; k--){
				arr[1][k+1] = arr[1][k];
			}
			arr[1][k+1] = key2;	
		}		
		//print
		for(i = 0; i < arr.length; i++){
			for(j = 0; j < arr[0].length; j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}	
}
