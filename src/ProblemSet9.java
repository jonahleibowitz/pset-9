import java.util.*;

public class ProblemSet9 {

    public int[] evenOdd(int[] arr) {
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


    public int[] notAlone(int[] arr, int alone) {
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


    public int[] shiftLeft(int[] arr) {
    if(arr == null){
        return null;
    }
        int[] cloned = arr.clone();
        cloned[arr.length-1] = arr[0];
            for(int i = 0; i < arr.length-1; i++){
                cloned[i] = arr[i+1];
            }
        return cloned;
    }


    public int[] fillIn(int start, int end) {
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


    public boolean triple(int[] arr) {
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


    public int pairs(int[] a, int[] b) {
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
    if (arr == null){
        return false;
    }
    boolean two = false;
    boolean four = false;
    boolean answer = false;
    //2 loop
    for(int i = 1; i < arr.length; i++){
        if(arr[i] == 2){
            if(arr[i-1] == 2 || arr[i+1] == 2){
                two = true;
            }
        }
    }
    //4 loop
        for(int i = 1; i < arr.length; i++){
            if(arr[i] == 4){
                if(arr[i-1] == 4 || arr[i+1] == 4){
                    four = true;
                }
            }
        }
    if(two != four){
        answer = true;
    }
    return answer;
    }


    public boolean fourteen(int[] arr) {
    if(arr == null){
        return false;
    }
    boolean check = false;
    for(int i : arr){
        if(i != 1 && i != 4){
            check = false;
        } else{
            check =true;
        }
    }
    return check;
    }


    public int centeredAverage(int[] arr) {
    if(arr == null || arr.length < 3){
        return -1;
    }
    int min = arr[0];
    int max = arr[0];
    int minIndex=0;
    int maxIndex=0;
    for(int i = 0; i < arr.length; i++){
        if(arr[i] > max){
            max = arr[i];
            maxIndex = i;
        } else if (arr[i] < min){
            min = arr [i];
            minIndex = i;
        }
    }
        int[] cloned = arr.clone();
        cloned[maxIndex] = 0;
        cloned[minIndex] = 0;
     //averaging
     int sum = 0;
        for (int j : cloned) {
            sum = sum + j;
        }
     int average = sum/(arr.length-2);
        return average;
    }


    public int outliers(int[] arr) {
        if (arr == null || arr.length < 1) {
            return -1;
        }
        int min = arr[0];
        int max = arr[0];
        for(int i= 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            } else if(arr[i] < min){
                min = arr[i];
            }
        }
        int difference = max - min;
        return difference;
    }
}