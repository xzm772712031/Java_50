package xzm;
/**
 * 打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。例如：153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。
 * @author xzm77
 *
 */

public class Java_3 {

	public static void main(String[] args) {
		for (int i = 100; i < 1000; i++) {

			if (isLotus(i))

				System.out.print(i + " ");

		}

		System.out.println();

		for (int i = 100; i < 1000; i++) {

			if (isLotus2(i))

				System.out.print(i + " ");

		}

		System.out.println();

	}

	// 判断水仙花数（优化）

	private static boolean isLotus(int lotus) {

		int m = 0;

		int n = lotus;

		int sum = 0;

		m = n / 100;

		n -= m * 100;

		sum = m * m * m;

		m = n / 10;

		n -= m * 10;

		sum += m * m * m + n * n * n;

		if (sum == lotus)

			return true;

		else

			return false;

	}

	// 判断水仙花数（基本）
	
	private static boolean isLotus2(int lotus) {
		int m = lotus / 100;
		
		int n = lotus / 10 % 10;
		
		int t = lotus % 10;
		
		int sum = 0;
		
		sum = m * m * m + n * n * n + t * t * t;
		
		if (sum == lotus) {
			
			return true;
			
		} else {
			
			return false;
			
		}
		
	}

}