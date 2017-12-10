/*
 * 在文本文件English.txt中包含有很英语短文，编写程序要求统计文件的所有
 * 短文中包含英文字母“A”的个数。
 */

package ts4_4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ts4_4 {
	public static void main(String[] args){
		if(args.length != 2){
			System.out.println("命令行形式因为：java ts4_4 searchFile searchStr");
			System.exit(0);
		}
		
		try{
			File searchFile = new File(args[0]);
			if(!searchFile.isFile()){
				System.out.println("源文件"+args[0]+"不存在");
				System.exit(0);
			}
			
			String searchStr = args[1];
		
			BufferedReader sourceFile = new BufferedReader(new FileReader(searchFile));
			
			String str;
			int count = 0;
			while((str = sourceFile.readLine()) != null){
				int len = str.length();
				//通过将所有要查找的字符串都变化空字符，比较变化前后读取缓存区中的字符串长度变化
	            str = str.replaceAll(searchStr, "");
	            len -= str.length();
	            count += len / searchStr.length();			            
			}
			System.out.println("源文件"+args[0]+"中包含"+count+"个"+args[1]);
		}
		catch (IOException e) {
			System.out.println(e);
		}
	}
}
