package com.gyojincompany.exer01;

public class StringTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Korea"; // 자바의 문자열 선언
		
		System.out.println(str1.charAt(2)); // 인덱스로 문자열 중 1글자만 추출할때
		
		String str2 = new String("Korea");
		
		int[] intArray = {1,2,3,4,5};
		
//		String str3 = new String(intArray);
		
		int a = 10;
		
//		String str3 = new String(a);
		
		byte[] byteArray = {72,101,108,108,111};
		String str4 = new String(byteArray);
		
		System.out.println(str4);
		
		String str5 = new String(byteArray, 2, 3);
		System.out.println(str5);
		
		String str6 = "자바프로그래밍";
		int a2 = str6.indexOf("프");
		System.out.println(a2);
		int a3 = str6.indexOf("그래"); // 문자열의 첫글자의 인덱스를 반환
		System.out.println(a3);
		int a4 = str6.indexOf("왕자"); // 해당 문자가 문자열에 없으면 무조건 -1 반환
		System.out.println(a4);
		
		if (str6.indexOf("푸로") != -1) { // 참이면 해당 문자열이 존재하는 경우
			
		} else { //해당 문자열이 존재하지 않는 경우
			
		}
		
	}

}
