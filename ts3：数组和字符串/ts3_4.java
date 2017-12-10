/*
 * 编写一个Java程序，完成以下功能：
 * 1）声明一个名为name的String对象，内容是“My name is Networkcrazy”；
 * 2）输出字符串的长度；
 * 3）输出字符串的第一个字符；
 * 4）输出字符串的最后一个字符；
 * 5）输出字符串的第一个单词；
 * 6）输出字符串crazy的位置（从0开始编号的位置）。
 */

package ts3_4;

public class ts3_4 {
	public static void main(String[] args){
		String name = "My name is Networkcrazy";
		
		System.out.println("该字符串的长度是"+name.length());
		System.out.println("该字符串的第一个字符是"+name.charAt(0));		
		System.out.println("该字符串的最后一个字符是"+
				name.charAt(name.length()-1));	
		System.out.println("该字符串的第一个单词是"+
				name.substring(0, name.indexOf(' ')));			
		System.out.println("该字符串的crazy的位置是"+
				name.indexOf("crazy"));			
	}
}
