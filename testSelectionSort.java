/*
 * testSelectionSort.java
 *
* To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Assert;
import org.junit.Test;
public class testSelectionSort {
	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
		}

	public testSelectionSort() {
    }


		public void testMixed(){
		        int[] arr = new int[5];
		        arr[0] = 8;
		        arr[1] = -9;
		        arr[2] = 0;
		        arr[3] = -10;
		        arr[4] = 2;

		        int[] Sortedarr = new int[5];
		        Sortedarr[0] = -10;
		        Sortedarr[1] = -9;
		        Sortedarr[2] = 0;
		        Sortedarr[3] = 2;
		        Sortedarr[4] = 8;

		        SelectionSort test = new SelectionSort();
		        arr = test.basicSelectionSort(arr);

		    	/** Test data contains with both positive, negative and zeros **/
		        boolean sortedCorrectly = Sortedarr[0] == arr[0] && Sortedarr[1] == arr[1] && Sortedarr[2] == arr[2] && Sortedarr[3] == arr[3] && Sortedarr[4] == arr[4];
		        assertTrue("testMixed did not sort the array correctly.", sortedCorrectly);
					}


		  public void testDuplicates(){
		        int[] arr = new int[5];
		        arr[0] = 7;
		        arr[1] = 9;
		        arr[2] = 7;
		        arr[3] = 10;
		        arr[4] = 2;

		        int[] Sortedarr = new int[5];
		        Sortedarr[0] = 2;
		        Sortedarr[1] = 7;
		        Sortedarr[2] = 7;
		        Sortedarr[3] = 9;
		        Sortedarr[4] = 10;

		        SelectionSort test = new SelectionSort();
		        arr = test.basicSelectionSort(arr);

		    	/** Test data contains duplicates **/
		        boolean sortedCorrectly = Sortedarr[0] == arr[0] && Sortedarr[1] == arr[1] && Sortedarr[2] == arr[2] && Sortedarr[3] == arr[3] && Sortedarr[4] == arr[4];
		        assertTrue("testDuplicate did not sort the array correctly.", sortedCorrectly);
					}
    }
