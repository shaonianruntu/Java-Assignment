/*
 * 给出字符串“Fly in the sky”
 *   （1）请查找该字符串中字符串“y”最后一次出现的位置；
 *   （2）请统计字符“y”出现的次数；
 *   （3）截取子串“he”。
 */

package ts3_2;

public class ts3_2 {
	public static void main(String[] args){
		String str1 = "Fly in the sky";
		//查找该字符串中字符串“y”最后一次出现的位置
		int lastIndex = str1.lastIndexOf("y");
		//统计字符“y”出现的次数
		int numOfchar = 0;
		for(int i = 0; i < str1.length(); i++){
			if((i = str1.indexOf("y", i)) != -1){
				numOfchar += 1;
			}
		}
		//截取子串“he”
		String str2 = str1.substring(8, 10);
		//print
		System.out.println("该字符串中字符串\"y\"最后一次出现在第"+(lastIndex+1)+"位置");
		System.out.println("字符\"y\"在该字符串中出现了"+numOfchar+"次");
		System.out.println("对该字符串进行截取操作得到\""+str2+"\"");
	}
}
