import java.util.*;

public class ProblemSet9 {

    public static void main (String[] args){
        int[] a = {1, 2, 3};
        int[] b = {2, 3, 5};
        System.out.println(pairs(a, b));
        //(Arrays.toString(
    }

    public static int[] evenOdd(int[] arr) {
    if (arr == null){
       return null;
    }
    List<Integer> evens = new ArrayList<>();
    List<Integer> odds = new ArrayList<>();

    for(int i : arr){
        if(i % 2 == 0){
            evens.add(i);
        } else{
            odds.add(i);
        }
    }
    evens.addAll(odds);

        int[] finalArray = new int[evens.size()];
        for (int i=0; i < finalArray.length; i++)
        {
            finalArray[i] = evens.get(i).intValue();
        }

        return finalArray;
     }

    public static int[] notAlone(int[] arr, int alone) {
        if (arr == null || arr.length == 0){
            return null;
        }
        for(int i = 1; i < arr.length-1; i ++){
            if (arr[i] == alone){
                   if(arr[i-1] > arr[i]+1){
                       arr[i] = arr[i-1];
                   } else{
                       arr[i] = arr[i+1];
                   }
            }
        }
        return arr;
        }

    public static int[] shiftLeft(int[] arr) {
    if(arr == null){
        return null;
    }
        int[] cloned = arr.clone();
        cloned[0] = arr[arr.length-1];
            for(int i = 0; i < arr.length-1; i++){
                cloned[i+1] = arr[i];
            }
        return cloned;
    }

    public static int[] fillIn(int start, int end) {
    if(start > end){
        return null;
         }
    int[] list = new int[end-start];
        //list[0] = start;
        for(int i=0; i < list.length; i++){
            list[i] = start + i;
        }

        return list;
        /*
        * Plan:
        * create array with length = to difference between start and end
        * Array starts with int start
        * each value after should be 1 more than previous
        * */
    }

    public static boolean triple(int[] arr) {
        if(arr == null){
        return false;
    }
     int threeCount = 0;
     boolean answer = false;
        for(int i = 0; i<arr.length ; i++){
            if(arr[i] == 3){
                threeCount ++;
            }
        }
      if(threeCount == 3){
          answer = true;
      }
      return answer;
    }

    public static int pairs(int[] a, int[] b) {
    if(a == null || b == null || a.length != b.length){
        return -1;
    }
    int counter =0;
    for(int i = 0; i < a.length; i++){
        if(a[i] != b[i] && (a[i] - b[i]) < 3 && (b[i] - a[i]) < 3) {
            counter++;
        }
    }
        return counter;
    }

    public boolean twentyFour(int[] arr) {

    }
/*
    public boolean fourteen(int[] arr) {

    }

    public int centeredAverage(int[] arr) {

    }

    public int outliers(int[] arr) {

    } */
}