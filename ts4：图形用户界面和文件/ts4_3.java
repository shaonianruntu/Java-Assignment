/*
 * 编写一个Java应用程序，完成文件的复制功能，源文件名及目标文件名通过命令行参数得到。
 * 在完成文件复制后，在控制台输出:”复制已经完成”，共复制字节数为XXX。此外，要求程序
 * 正确处理读写文件可能引发的异常，在文件复制完成后关闭文件。
 */

package ts4_3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ts4_3 {
	public static void main(String[] args){

		if(args.length != 2){
			System.out.println("命令行形式应为：java ts4_3 fromFile ToFile");
			System.exit(0);
		}
		try{
			File fromFile = new File(args[0]);
			if(!fromFile.isFile()){
				System.out.println("源文件"+args[0]+"不存在 ！");
				System.exit(0);
			}
			
			File toFile = new File(args[1]);
			if(toFile.exists()){
				System.out.println("目标文件"+args[1]+"已存在！");
				System.exit(0);
			}
			
			FileInputStream inFile = new FileInputStream(fromFile);
			FileOutputStream outFile = new FileOutputStream(toFile);
			
			int ch;
			int index = 0;
			while((ch = inFile.read()) != -1){
				outFile.write(ch);
				index++;
			}

			System.out.println("复制已经完成，共复制字节数为" + index);
			
			inFile.close();
			outFile.close();
			
		}
		catch(IOException e){
			System.out.println(e);
		}
	}
}
