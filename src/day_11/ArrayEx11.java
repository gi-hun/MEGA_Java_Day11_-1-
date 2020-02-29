/*
 * # 중복숫자 금지[1단계]
 * 1. 0~4 사이의 숫자를 arr배열에 저장한다.
 * 2. 단, 중복되는 숫자는 없어야 한다.
 * 힌트) 랜덤 숫자를 check배열의 인덱스로 활용한다.
 * 
 * 예)
 * 랜덤숫자 : 1
 * check = {0, 1, 0, 0, 0}
 * arr   = {1, 0, 0, 0, 0}
 * 랜덤숫자 : 3
 * check = {0, 1, 0, 1, 0}
 * arr   = {1, 3, 0, 0, 0}
 * 랜덤숫자 : 2
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
				i--;		//for문의 i와 상쇄된다.
							//i값이 감소하고 for문의 i값이 다시 증가하기 때문에 i값은 변하지 않는다.
			}
		}
		
		for(int i=0;i<5;i++)
		{
			System.out.println(arr[i]);
		}
		
	}
}
