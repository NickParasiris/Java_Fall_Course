package ca.ConcordiaCCE_Fall2021.Class_14;

import java.util.ArrayList;
import java.util.List;

public class TwoSum {
    public static void main(String[] args) {

        int[] inputArray = new int[] {11, 4, 5, 6, 7};
        int targetValue = 11;

        List<int[]> result = twoSum(inputArray, targetValue);

        System.out.println("Here are the results");

        for (int[] r : result)
        {
            System.out.println("[" + r[0] + "," + r[1] + "]");
        }


    }

    /**
     * This method finds combination of array elements that adds up to "target".
     * This method should only find the first combination.
     * @param nums The series of numbers input by the user.
     * @param target Target number to be found.
     * @return An array with the index of the found numbers(if any).
     */

    private static List<int[]> twoSum (int[] nums, int target)
    {
        List<int[]> foundCombinations = new ArrayList<>();

        for (int a = 0; a < nums.length; a++)
        {
            if (nums[a] >= target)
            {
                continue;
            }
            for (int b = a + 1; b < nums.length; b++)
            {
                if (nums[b] >= target)
                {
                    continue;
                }

                if (nums[a] + nums[b] == target)
                {
                    foundCombinations.add(new int[] {a, b});
                }
            }
        }
        return foundCombinations;
    }
}
