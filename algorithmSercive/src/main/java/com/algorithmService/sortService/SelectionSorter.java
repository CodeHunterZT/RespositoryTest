package com.algorithmService.sortService;

/**
 * selection sorter 
 * @author ZuoTong
 *
 */
public class SelectionSorter extends AbstractSorter implements Sorter{

	public void sort(Comparable[] a) {
		// TODO Auto-generated method stub
		int N = a.length;
		for(int i=0;i<N;i++) {
			int min = i;
			for(int j=i+1;j<N;j++) {
				if(less(a[j], a[min])) min = j;
			}
			exch(a, i, min);
		}
	}
	
	
}
