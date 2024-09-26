package prueba2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class prueba2 {
	public static boolean findPair(int[] nums, int target) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            int complement = target - num;
            if (seen.contains(complement)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
  
        int[] nums = {5, 7, 1, 2, 8, 4, 3};
        int target = 10;
       
        if (findPair(nums, target)) {
            System.out.println("Existe una pareja que suma el objetivo");
        } else {
            System.out.println("No existe una pareja que suma el objetivo");
        }
    }
    }

