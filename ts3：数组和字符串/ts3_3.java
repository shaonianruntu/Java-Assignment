/*
 * 创建多维String数组arrayOfString ，初始化为{{“abc”,”de”,”gong”}, {”De”,”abc”}, 
 * { ”Foo”,”gong”}, {“hello”, “java”,”world”}}，编写程序，在该数组中查找”abc”
 * 第一次出现的位置。
 */

package ts3_3;

public class ts3_3 {
	public static void main(String[] agrs){
		String[][] arrayOfString = {
				{"abc","de","gong"},
				{"De","abc"},
				{"Foo","gong"},
				{"hello","java","world"}			
		};
		//在该数组中查找”abc”第一次出现的位置
		for(int i = 0; i < arrayOfString.length; i++){
			for(int j = 0; j < arrayOfString[0].length; j++){
				if(arrayOfString[i][j] == "abc"){
					System.out.println("\"abc\"第一次出现在该数组的第"+
							(i+1)+"行，第"+(j+1)+"行");
					return ;
				}
			}
		}
		System.out.println("\"abc\"并没有在该数组中出现");		
		return;
	}
}
