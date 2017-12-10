/*
 * 某老师这学期开设一门B类专业选修课程，有10个学生选择了他的课程。在课程期间，
 * 该老师根据授课内容进行了4次小测试（Quiz1、Quiz2、Quiz3和Quiz 4），每次小
 * 测试的满分是100. 该老师需要一个具有如下的功能的程序：
 * （1）能入10个学生4次测试的成绩；
 * （2）能计算每个学生的4次小测试的平均分；
 * （3）能计算每次小测试所有学生的平均分；
 * （4）能找出小测试中低于75分的学生序号及小测试序号。
 * 后面3个要求分别用方法实现；
 */

package ts3_6;

import java.util.Scanner;

public class ts3_6 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int[][] grade = new int[4][10];
		int i, j;
		//获取10个学生4次测试的成绩
		for(i = 0; i < grade.length; i++){
			System.out.println("请输入第"+(i+1)+"次测试所有同学的成绩：");
			for(j = 0; j < grade[0].length; j++){
				grade[i][j] = scanner.nextInt();
			}
		}
		//计算每个学生的4次小测试的平均分
		averageForEveryStudent(grade);		
		//计算计算每次小测试所有学生的平均分
		averageForEveryQuiz(grade);		
		//找出小测试中低于75分的学生序号及小测试序号
		gradeBiggerThan75(grade);
	}
	
	public static void averageForEveryStudent(int[][] arr){
		int i, j;
		float[] aveStu = new float[arr[0].length];
		System.out.println("*************************");
		for(j = 0; j < arr[0].length; j++){
			for(i = 0; i < arr.length; i++){
				aveStu[j] += arr[i][j];
			}
			aveStu[j] = aveStu[j] / (float)arr.length;
			System.out.println("学生"+(j+1)+"在4次小测试中的平均分是"+aveStu[j]);
		}	
		System.out.println("*************************");
	}
	
	public static void averageForEveryQuiz(int[][] arr){
		int i, j;
		float[] aveQuiz = new float[arr.length];
		System.out.println("*************************");
		for(i = 0; i < arr.length; i++){
			for(j = 0; j < arr[0].length; j++){
				aveQuiz[i] += arr[i][j];
			}
			aveQuiz[i] = aveQuiz[i] / (float)arr[0].length;
			System.out.println("第"+(i+1)+"次小测试所有学生的平均分"+aveQuiz[i]);
		}
		System.out.println("*************************");
	}
	
	public static void gradeBiggerThan75(int[][] arr){
		int i, j;
		System.out.println("*************************");
		System.out.println("在所有测试中，成绩低于75分的学生情况如下：");
		for(i = 0; i < arr.length; i++){
			for(j = 0; j < arr[0].length; j++){
				if(arr[i][j] < 75){
					System.out.println("第"+(i+1)+"次测试中学生"+(j+1)+"考了"+
							arr[i][j]+"分");
				}
			}
		}	
		System.out.println("*************************");
	}
}
