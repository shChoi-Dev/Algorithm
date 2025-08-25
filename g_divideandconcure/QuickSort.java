package com.mc.algorithm.g_divideandconcure;

import com.mc.algorithm.util.SortUtil;

public class QuickSort {

	public static void main(String[] args) {
		
		int[] arr = SortUtil.createRandamIntArray(100000000);
		SortUtil.checkTime(() -> {
			quickSort(arr, 0, arr.length-1);
		});
		
	}
	
	// 재귀를 사용하지 않는 퀵 정렬
	private static void quickSort(int[] arr, int left, int right) {
		if()
		
	}

	private static int partition(int[] arr, int first, int last) {
		int pivotElement = arr[first];
		int lp = first;
		int rp = last;

		while(true) {
			while(lp < last && arr[lp] <= pivotElement) {
				lp++;
			}
			
			while(rp > first && arr[rp] > pivotElement) {
				rp--;
			}
			
			if(lp >= rp) break;
			SortUtil.swap(arr, lp, rp);
			lp++;
			rp--;
		}
		
		SortUtil.swap(arr, first, rp);
		return rp;
	}
	
}
