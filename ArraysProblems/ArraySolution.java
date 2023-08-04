package ArraysProblems;

import java.util.Arrays;

public class ArraySolution {
    public static void main(String[] args) throws Exception {
        ArraySolution solution = new ArraySolution();

        int[] nums = { 3, 0, 6, 1, 5 };
        solution.hIndex(nums);
    }

    public int hIndex(int[] citations) {
        // Sort
        Arrays.sort(citations);

        for(int i=0; i<citations.length; i++) {
                        
        }
        return 0;
    }
}
