package com.ict.other;

public class Lotto {
	public static void main(String[] args) {

		int[] arr = new int[6];

		// 배열 6 자리 채우기 (중복 안됨)
		for (int i = 0; i < 6; i++) {
			int su = (int) (Math.random() * 10);
			arr[i] = su;
			for (int j = 0; j < i; j++) {
				if(arr[j] == su) {			//	arr[j] == arr[i] 와 같음
					i--;	//	** 현재자리와 같은 숫자가 있기때문에 다시 이 자리에 넣으려면 
					break;	// 	i 를 1 빼야 바깥 for 문에서 1 증가하면서 현재자리로 된다.
				}					
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		
		
	}
}
