package problem6;

public class Prog6 {

    public static void main(String[] args){
        secondMin(new int[]{4, 2, 36, 0, 44, 32, 1});
    }
    public static void secondMin(int[] arrayOfInts){
        int min = arrayOfInts[0];
        int secondMin = arrayOfInts[1];

        for (int n: arrayOfInts){
            if(n<secondMin & n>min){
                secondMin = n;
            }
            else if(n<min){
                min = n;
            }
        }
        System.out.println(secondMin);
    }
}