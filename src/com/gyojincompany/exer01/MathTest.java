package com.gyojincompany.exer01;

public class MathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double ran1 = Math.random(); // 0.0 ~ 1.0 사이의 랜덤 실수를 반환(0.0 <= ran1 < 1.0)
		
		System.out.println(ran1);
		
		//1~45 중에서 1개의 숫자를 반환
		
		int lotto1 = (int)(ran1 * 45);
		
		System.out.println(lotto1+1); // 1~45

	}

}
