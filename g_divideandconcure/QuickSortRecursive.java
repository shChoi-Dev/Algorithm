package com.mc.algorithm.g_divideandconcure;

import java.util.Arrays;

import com.mc.algorithm.util.SortUtil;

public class QuickSortRecursive {
	
	public static void main(String[] args) {
		
		int[] arr = SortUtil.createRandamIntArray(100000000);
		//int [] arr = {1,3,5,7,9,2,4,6,8,10};
		SortUtil.checkTime(() -> { 
			quickSort(arr, 0, arr.length-1);
			//System.out.println(Arrays.toString(arr));
		});
		
		
	}

	private static void quickSort(int[] arr, int left, int right) {
		if(left >= right) return;
		int pivot = partition(arr, left, right);
		quickSort(arr, left, pivot - 1);
		quickSort(arr, pivot + 1, right);
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
