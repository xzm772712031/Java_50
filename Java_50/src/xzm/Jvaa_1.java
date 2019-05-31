package xzm;

import java.util.Scanner;

/**  
 * 古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，
 * 小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，
 * 问每个月的兔子对数为多少？ 
 * @author xzm77
 *
 */
public class Jvaa_1 {

	public static void main(String[] args) {
		int n =0;
		boolean flag = false;	
		do {
			System.out.println("请输入你想知道的兔子数量的月份：");	
			Scanner sc = new Scanner(System.in);
			if(sc.hasNextInt()) {		
				flag = true;
				n = sc.nextInt();//获取输入的月份数
				System.out.println("第"+n+"个月兔子总数为"+fun(n));
				break;
			}
			else 
			{
				flag = false;		
				System.out.println("请输入正确的整数！！！！");	
			}					
		} 
		while (flag!=true);				
	}
	
	//求得所需月份的兔子的数量，返回值为兔子的数量
    private static int fun(int n) {
		if(n==1||n==2) {
		return 1;
		}else {
		return fun(n-1)+fun(n-2);	
		}
	}
	
}
