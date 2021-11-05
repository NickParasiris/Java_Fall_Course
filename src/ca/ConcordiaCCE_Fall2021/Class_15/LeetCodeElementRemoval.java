package ca.ConcordiaCCE_Fall2021.Class_15;

import java.util.Arrays;

public class LeetCodeElementRemoval {
    public static void main(String[] args) {

        int[] source = new int[] {3, 2, 3, 2};
        int processed = removeElement(source, 2);

        System.out.println(processed);
        System.out.println(Arrays.toString(source));

        for(int x = 0; x < processed; x++)
        {
            System.out.print(source[x]);
        }

    }

    public static int removeElement(int[] nums, int val)
    {
        int count = 0;

        for (int x = 0; x < nums.length; x++)
        {
            if (nums[x] != val)
            {
                nums[count++] = nums[x];
            }
        }
        return count;
    }
}
