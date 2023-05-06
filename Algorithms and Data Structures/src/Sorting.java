import java.lang.Comparable;
import java.util.Arrays;
/*
 * Class sorting contain all sorting algorithms that I've learned coded in generic programming.
 * 
 */
public class Sorting {
	private static <T extends Comparable<T>> void swap(T[] array, int j, int i) {
		if (i != j) {
			T temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		}
	}

	/*
	 * Insertion sort: has Worst case of O(n^2). Work good with small arrays.
	 */
	static <T extends Comparable<T>> void insertionSort(T[] array) {
		for (int i = 1; i < array.length; i++) {
			for (int j = i; (j > 0) && (array[j].compareTo(array[j - 1]) < 0); j--) {
				swap(array, j, j - 1);
			}
		}
	}

	//Optimized insertion sort:
	// Instead of swapping, "shift" the values down the array
	static void insertionSortShift(int[] A) {
	  for (int i=1; i<A.length; i++) { 
	    int j;
	    int temp = A[i];
	    for (j=i; (j>0) && (temp < A[j-1]); j--) {
	      A[j] = A[j-1];
	    }
	    A[j] = temp;
	  }
	}

	
	/*
	 * Bubble sort: has Worst case of O(n^2). Work good with small arrays.
	 */
	static <T extends Comparable<T>> void bubbleSort(T[] A) {
		for (int i = 0; i < A.length - 1; i++) {
			for (int j = 1; j < A.length - i; j++) {
				if (A[j - 1].compareTo(A[j]) > 0) {
					swap(A, j - 1, j);
				}
			}
		}
	}

	//Optimized bubble sort:
	static <T extends Comparable<T>> void bubbleSortCheckSwap(T[] A) {
		  int n = A.length - 1;
		  while (n > 0) {
		    int newn = 0;
		    for (int i = 0; i < n; i++) {
		      /* if this pair is out of order */
		      if (A[i].compareTo(A[i+1]) > 0) {
		        swap(A, i, i+1);
		        newn = i;
		      }
		    }
		    n = newn;
		  }
		}
	
	
	/*
	 * Selection sort:
	 */
	static <T extends Comparable<T>> void selectionSort(T[] A) {
		  for (int i=0; i<A.length-1; i++) {       // Select i'th biggest record
		    int bigindex = 0;                      // Current biggest index
		    for (int j=1; j<A.length-i; j++) {      // Find the max value
		      if (A[j].compareTo(A[bigindex]) > 0) {// Found something bigger
		        bigindex = j;                      // Remember bigger index
		      }
		    }
		    swap(A, bigindex, A.length-i-1);       // Put it into place
		  }
		}

	/*
	 * Shell sort:
	 * Best case: nlog(n)
	 * Average case: nsqrt(n)
	 * Worst case: n^2
	 */
	static <T extends Comparable<T>> void shellSort(T[] A) {
	    for (int i = A.length / 2; i > 2; i /= 2) { // For each increment
	        for (int j = 0; j < i; j++) {           // Sort each sublist
	            inssort2(A, j, i);
	        }
	    }
	    inssort2(A, 0, 1);     // Could call regular inssort here
	}

	/** Modified Insertion Sort for varying increments */
	static <T extends Comparable<T>> void inssort2(T[] A, int start, int incr) {
	    for (int i = start + incr; i < A.length; i += incr) {
	        for (int j = i; j >= incr && A[j].compareTo(A[j - incr]) < 0; j -= incr) {
	            swap(A, j, j - incr);
	        }
	    }
	}

	// Merge sort:
	// Best, Average and worst cases are O(nlog(n)).
	static void mergeSort(Comparable[] A, Comparable[] temp, int left, int right) {
		  if (left == right) { return; }       // List has one record
		  int mid = (left+right)/2;          // Select midpoint
		  mergeSort(A, temp, left, mid);     // Mergesort first half
		  mergeSort(A, temp, mid+1, right);  // Mergesort second half
		  for (int i=left; i<=right; i++) {    // Copy subarray to temp
		    temp[i] = A[i];
		  }
		  // Do the merge operation back to A
		  int i1 = left;
		  int i2 = mid + 1;
		  for (int curr = left; curr <= right; curr++) {
		    if (i1 == mid+1) {                 // Left sublist exhausted
		      A[curr] = temp[i2++];
		    }
		    else if (i2 > right) {             // Right sublist exhausted
		      A[curr] = temp[i1++];
		    }
		    else if (temp[i1].compareTo(temp[i2]) <= 0) {  // Get smaller value
		      A[curr] = temp[i1++];
		    }
		    else{
		      A[curr] = temp[i2++];
		    }
		  }
		}
	
	
}

