import java.util.Arrays;

public class ProblemSet9 {

    public static void main (String[] args){
        int[] arr = {1, 2, 3};
       // int alone = 1;
        System.out.println(evenOdd(arr));
        //(Arrays.toString(
    }

    public static int[] evenOdd(int[] arr) {
    if (arr == null){ //conditions
       return null;
    }
    int arrayLength = arr.length;
    int[] comboArray = new int[arrayLength];
    int evenNumber = 0; //creating even number counter
    int oddNumber= 0;   //creating odd number counter

    for(int i : arr){   //for loop looks at each value
        if(i % 2 == 0){  //if i is even,
            evenNumber += 1; //records that there is an even number
        } else {
            oddNumber += 1;  //otherwise, records there is an odd number
        }
    int[] evens = new int[evenNumber]; //creates array with enough values to hold all evens
    int currentSizeEvens = 0;
    int[] odds = new int[oddNumber];   //creates array with enough values to hold all odds
         int currentSizeOdds = 0;

        for (int j : arr) {
            if(j % 2 == 0) {
                evens[currentSizeEvens] = arr[j];    // add element to array\
                currentSizeEvens ++;
            } else{
                odds[currentSizeOdds] = arr[j];
                currentSizeOdds ++;
            }

        }
        /*First, iterate through each value in evens, each evens[i] becomes combo[i]
        * Next, iterate through odds, each odd[i] becomes combo[i+(evens.length)]*/

        for(int k : evens){
            comboArray[k] = evens[k];
        }
        for (int f : odds){
            comboArray[f+(evens.length)] = odds[f];
        }
    }
        return comboArray;
    }
/*
    public int[] notAlone(int[] arr, int alone) {

    }

    public int[] shiftLeft(int[] arr) {

    }

    public int[] fillIn(int start, int end) {

    }

    public boolean triple(int[] arr) {

    }

    public int pairs(int[] a, int[] b) {

    }

    public boolean twentyFour(int[] arr) {

    }

    public boolean fourteen(int[] arr) {

    }

    public int centeredAverage(int[] arr) {

    }

    public int outliers(int[] arr) {

    } */
}