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
			System.out.println("�п�J�~,��,��");

			if (scan.hasNextDouble()) // ���o��J�����
				y = scan.nextDouble();
			if (scan.hasNextDouble())
				m = scan.nextDouble();
			if (scan.hasNextDouble())
				d = scan.nextDouble();

			if (y >= 1 && y % 1.0 == 0.0 && m >= 1 && m <= 12 && m % 1.0 == 0.0 && d >= 1 && d <= 31
					&& d % 1.0 == 0.0) {
				// �P�_��J��ƬO�_�d�򤺪����
				for (int i = 0; i < (m - 1); i++) { // �i�槹�������[�`
					total += days[i];
				}
				if (gc.isLeapYear((int) y) && (m > 2)) { // �P�_�O�_���|�~
					total += 1;
				}

				total += d; // �[�W�Ӥ�w�L�Ѽ�

				System.out.println((int) y + "�~" + (int) m + "��" + (int) d + "�鬰�Ӧ~����" + total + "��");
				break;
			} else {
				System.out.println("��J���~");

			}
		}

	}

}
