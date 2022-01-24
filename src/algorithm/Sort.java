package algorithm;

import org.junit.Assert;
import org.junit.Test;

public class UnitTestSorting {

    /*
      This class is about Unit testing for Sorting Algorithm.
     */
    public static void main(String[] args) {
        int[] unSortedArray = {6, 9, 2, 5, 1, 0, 4};
        int[] sortedArray = {0, 1, 2, 4, 5, 6, 9};
        //Create Sort object
        Sort sort = new Sort();
        //apply unsorted array to selectionSort.
        sort.selectionSort(unSortedArray);
        //verify if the unsorted array is sorted by the selection sort algorithm.
        try {
            Assert.assertEquals(sortedArray, unSortedArray);
        } catch (Exception ex) {
            ex.getMessage();
        }
    }
    //Now implement Unit test for rest of the soring algorithm...................below
    @Test
    public void test0() {
        public int[] selectionSort(int [] array){

            final long startTime = System.currentTimeMillis();
            int [] list = array;

            for(int j=0; j<array.length-1; j++){
                int min = j;
                for(int i=j+1; i<array.length; i++) {
                    if (array[i] < array[min])
                        min = i;
                }
                int temp = array[min];
                array[min] = array[j];
                array[j] = temp;
            }
            final long endTime = System.currentTimeMillis();
            final long executionTime = endTime - startTime;
            this.executionTime = executionTime;
            Assert.assertEquals(endTime, executionTime);
            return list;
        }}
    @Test
    public void test1() {
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        for(int j=1;j<array.length-1;j++){
            int curr= j;
            int j=i;
            while(j>0 && curr<a[j-1]){
                a[j]=a[j-1];
                j--;
            }
            a[j]=curr;
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        Assert.assertEquals(endTime, executionTime);
        return list;
    }

    @Test
    public void test2() {
        int [] list = array;
        int n = list.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(list[j-1] > list[j]){
                    temp = list[j-1];
                    list[j-1] = list[j];
                    list[j] = temp;
                }
            }
        }
        Assert.assertEquals(list, n);
        return list;
    }

    @Test
    public void test3() {
        int [] list = array;
        buildMaxHeap(list);
        int n = list.length;
        int temp;
        for (int i = n - 1; i > 0; i--)
        {
            temp = list[0];
            list[0]=list[i];
            list[i] = temp;
            int j = 0, index;
            do
            {
                index = (2 * j + 1);
                if (index < (i - 1) && list[index] < list[index + 1])
                    index++;
                if (index < i && list[j] < list[index]){
                    temp = list[j];
                    list[j]=list[index];
                    list[index] = temp;
                }
                j = index;
            } while (index < i);
        }
        Assert.assertEquals(n, temp);
        return list;

    }
}