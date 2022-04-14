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

		public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;

        SelectionSort test = new SelectionSort();
        arr = test.basicSelectionSort(arr);

        /** add tests to check for this unit test **/
        boolean sortedCorrectly = Sortedarr[0] == arr[0] && Sortedarr[1] == arr[1] && Sortedarr[2] == arr[2] && Sortedarr[3] == arr[3] && Sortedarr[4] == arr[4];
        assertTrue("testPositive did not sort the array correctly.", sortedCorrectly);
        }


    public void testNegative(){
        int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = -9;
        arr[2] = -7;
        arr[3] = -10;
        arr[4] = -2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -10;
        Sortedarr[1] = -9;
        Sortedarr[2] = -8;
        Sortedarr[3] = -7;
        Sortedarr[4] = -2;

        SelectionSort test = new SelectionSort();
        arr = test.basicSelectionSort(arr);

    	/** Test data contains negative values only **/
        boolean sortedCorrectly = Sortedarr[0] == arr[0] && Sortedarr[1] == arr[1] && Sortedarr[2] == arr[2] && Sortedarr[3] == arr[3] && Sortedarr[4] == arr[4];
        assertTrue("testNegative did not sort the array correctly.", sortedCorrectly);
        }



    public void testMixed(){
    	/** Test data contains with both positive, negative and zeros **/
        }


    public void testDuplicates(){
    	/** Test data contains duplicates **/

        }
    }
