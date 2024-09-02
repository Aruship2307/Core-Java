package com.java8features.consumer;

import java.util.HashMap;
import java.util.Map;

public class DemoDebugCode {
	   public static int[] twoSum(int[] nums, int target) {
		 int n=nums.length;
	        Map<Integer,Integer> map=new HashMap<>();
	        int[] result=new int[2];
	        for(int i=0;i<n;i++){
	            if(map.containsKey(target-nums[i])){
	                result[1]=i;
	                result[0]=map.get(target-nums[i]);
	                return result;
	            }
	            map.put(nums[i],i);
	        }
	        return result;
		   }
	public static void main(String[] args) {
		int target=9;
		int nums [] = {3,6,9,8};
		int indices [] = DemoDebugCode.twoSum(nums, target);
        System.out.println("Indices of the two numbers that add up to target are: [" + indices[0] + ", " + indices[1] + "]");

	   
	}

}
