/*
 * ��дһ��JavaӦ�ó�������ļ��ĸ��ƹ��ܣ�Դ�ļ�����Ŀ���ļ���ͨ�������в����õ���
 * ������ļ����ƺ��ڿ���̨���:�������Ѿ���ɡ����������ֽ���ΪXXX�����⣬Ҫ�����
 * ��ȷ�����д�ļ������������쳣�����ļ�������ɺ�ر��ļ���
 */

package ts4_3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ts4_3 {
	public static void main(String[] args){

		if(args.length != 2){
			System.out.println("��������ʽӦΪ��java ts4_3 fromFile ToFile");
			System.exit(0);
		}
		try{
			File fromFile = new File(args[0]);
			if(!fromFile.isFile()){
				System.out.println("Դ�ļ�"+args[0]+"������ ��");
				System.exit(0);
			}
			
			File toFile = new File(args[1]);
			if(toFile.exists()){
				System.out.println("Ŀ���ļ�"+args[1]+"�Ѵ��ڣ�");
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

			System.out.println("�����Ѿ���ɣ��������ֽ���Ϊ" + index);
			
			inFile.close();
			outFile.close();
			
		}
		catch(IOException e){
			System.out.println(e);
		}
	}
}
