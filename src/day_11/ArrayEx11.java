/*
 * # �ߺ����� ����[1�ܰ�]
 * 1. 0~4 ������ ���ڸ� arr�迭�� �����Ѵ�.
 * 2. ��, �ߺ��Ǵ� ���ڴ� ����� �Ѵ�.
 * ��Ʈ) ���� ���ڸ� check�迭�� �ε����� Ȱ���Ѵ�.
 * 
 * ��)
 * �������� : 1
 * check = {0, 1, 0, 0, 0}
 * arr   = {1, 0, 0, 0, 0}
 * �������� : 3
 * check = {0, 1, 0, 1, 0}
 * arr   = {1, 3, 0, 0, 0}
 * �������� : 2
 * check = {0, 1, 1, 1, 0}
 * arr   = {1, 3, 2, 0, 0}
 */
package day_11;

import java.util.Random;

public class ArrayEx11 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		int[] check = new int[5];
		
		Random ran = new Random();
		
		for(int i=0;i<5;i++)
		{
			int num = ran.nextInt(5);
			arr[i] = num;
			System.out.println("i:"+i);
			System.out.println("num:"+num);
			if(check[num] == 0)
			{
				check[num] = 1;
			}
			else
			{
				i--;		//for���� i�� ���ȴ�.
							//i���� �����ϰ� for���� i���� �ٽ� �����ϱ� ������ i���� ������ �ʴ´�.
			}
		}
		
		for(int i=0;i<5;i++)
		{
			System.out.println(arr[i]);
		}
		
	}
}
