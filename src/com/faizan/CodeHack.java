package com.faizan;

public class CodeHack {

	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,4,1,2,3,10};
		System.out.println(func(arr));
		
	}
	public static boolean func(int a[]) {
		//int count = 0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length-1;j++) {
				if(a[i]==a[j]) {
					return true;
				}				
			}
		}
		return false;
	}

}
