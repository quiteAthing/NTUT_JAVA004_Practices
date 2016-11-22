package ch05hw;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class TimeCal {

	public static void main(String[] args) {

		GregorianCalendar gc = new GregorianCalendar();
		Scanner scan = new Scanner(System.in);

		int days[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		double y = 0, m = 0, d = 0;
		int total = 0;

		while (true) {
			System.out.println("請輸入年,月,日");

			if (scan.hasNextDouble()) // 取得輸入的日期
				y = scan.nextDouble();
			if (scan.hasNextDouble())
				m = scan.nextDouble();
			if (scan.hasNextDouble())
				d = scan.nextDouble();

			if (y >= 1 && y % 1.0 == 0.0 && m >= 1 && m <= 12 && m % 1.0 == 0.0 && d >= 1 && d <= 31
					&& d % 1.0 == 0.0) {
				// 判斷輸入資料是否範圍內的整數
				for (int i = 0; i < (m - 1); i++) { // 進行完整月份的加總
					total += days[i];
				}
				if (gc.isLeapYear((int) y) && (m > 2)) { // 判斷是否為閏年
					total += 1;
				}

				total += d; // 加上該月已過天數

				System.out.println((int) y + "年" + (int) m + "月" + (int) d + "日為該年的第" + total + "天");
				break;
			} else {
				System.out.println("輸入有誤");

			}
		}

	}

}
