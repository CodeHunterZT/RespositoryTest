package com.algorithmService.sortService;

public class AbstractSorter{
	
	protected boolean less(Comparable v,Comparable w) {
		return v.compareTo(w) < 0;
	}
	
	protected void exch(Comparable[] a,int i,int j) {
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = a[i];
	}
	
	protected void show(Comparable[] a) {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
	
	/**
	 * Test if a is sorted.
	 * @param a
	 * @return
	 */
	protected boolean isSorted(Comparable[] a) {
		for(int i=1;i<a.length;i++) {
			if(less(a[i], a[i-1])) return false;
		}
		return true;
	}
}
