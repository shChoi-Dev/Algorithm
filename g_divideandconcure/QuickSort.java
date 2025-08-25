package com.mc.algorithm.g_divideandconcure;

import com.mc.algorithm.d_datastructure.stack._Stack;
import com.mc.algorithm.util.SortUtil;

public class QuickSort {

	public static void main(String[] args) {
		
		int[] arr = SortUtil.createRandamIntArray(100000000);
		SortUtil.checkTime(() -> {
			quickSort(arr, 0, arr.length-1);
			//System.out.println(Arrays.toString(arr));
		});
		
	}
	
	// 재귀를 사용하지 않는 퀵 정렬
	private static void quickSort(int[] arr, int left, int right) {
		if(left >= right) return;
		_Stack<Integer> stack = new _Stack<Integer>();
		
		stack.push(left);
		stack.push(right);
		
		while(!stack.isEmpty()) {
			right = stack.pop();
			left = stack.pop();
			
			int pivotIndex = partition(arr, left, right);
			
			if(pivotIndex -1 > left) {
				stack.push(left);
				stack.push(pivotIndex-1);
				
			}
			
			if (pivotIndex +1 < right) {
				stack.push(pivotIndex+1);
				stack.push(right);
				
			}
			
		}
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
