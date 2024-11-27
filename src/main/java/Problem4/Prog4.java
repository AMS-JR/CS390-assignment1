package Problem4;

import java.util.Arrays;

public class Prog4 {
    public static void main(String[] args){
        String [] inputArray = {"horse", "dog", "horse", "dog", "cat", "cow","goat","goat"};
        String [] result = new String[0];

        for (String string : inputArray) {
            boolean notduplicate = true;
            for (String s : result) {
                if (string.equals(s)) {
                    notduplicate = false;
                    break;
                }
            }
            if (notduplicate) {
                result = Arrays.copyOf(result, (result.length + 1));
                result[result.length - 1] = string;
            }
        }
        System.out.println(Arrays.toString(result));
    }

}
