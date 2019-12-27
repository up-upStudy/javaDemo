package com.Array;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArrayTest {

	@Test
	public void testArray() {
		int[] array=new int[] {1,2,3};
		String[] array1=new String[] {"1","2","3"};
		
		String[] arr1= {"字符串",null,"字符串2",""};
		System.out.println(Arrays.toString(arr1));
		
		Integer[] arr2= {2,3,4,5,6};
		for(int i=0;i<arr2.length;i++) {
		System.out.println(String.format("下标是：%d,存放的值是：%d",i,arr2[i]));
		}
		int i=0;
		for(int val:arr2) {// for each语法
			System.out.println("第"+i+"取到"+arr2[i]);
			i++;
		}
	}

}
