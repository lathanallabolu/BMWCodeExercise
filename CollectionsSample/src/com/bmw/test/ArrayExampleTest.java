package com.bmw.test;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.bmw.code.ArrayExample;

public class ArrayExampleTest {
	
	ArrayExample example;
	
    @Before
    public void executedBeforeEach() {
    	example	=new ArrayExample();
    }

    
	@Test
	public void shouldReturnMaxLengthStringWhenNumCountIsSame() {
				
		String result=example.compareStrings("l123ab", "b123");
		assertEquals("l123ab",result);
	}
	@Test
	public void shouldReturnFirstStringWhenLengthAndNumCountIsSame() {
				
		String result=example.compareStrings("a123", "l123");
		assertEquals("l123",result);
	}
	@Test
	public void shouldReturnMinNumCountString() {
				
		String result=example.compareStrings("l12", "l123");
		assertEquals("l12",result);
	}
	@Test
	public void shouldReturnMinNumCountStringWhenBothDiff() {
				
		String result=example.compareStrings("abc1234", "l123");
		assertEquals("l123",result);
	}
	@Test
	public void shouldReturnMinNumCountStringWhenAllDiffInArray() {
				
	    String[] input={"l123","12abc","b3c5"};
	    String result=example.getMinNumericsString(input);		
		assertEquals("12abc",result);
	}
	@Test
	public void shouldReturnFirstStringWhenTwoEqualLengthAndEqualNumCountInArray() {
				
		String[] input={"l123","12a3","b3c567"};
	    String result=example.getMinNumericsString(input);		
		assertEquals("l123",result);
	}
	@Test
	public void shouldReturnNullWhenArrayNull() {
				
		String[] input=null;
	    String result=example.getMinNumericsString(input);		
		assertEquals(null,result);
	}
	@Test
	public void shouldReturnMinNumCountStringWhenOneValueInArrayEmpty() {
				
		String[] input={"c123"," ","b3c567"};
	    String result=example.getMinNumericsString(input);		
		assertEquals("c123",result);
	}
	@Test
	public void shouldReturnMinNumCountStringWhenOneValueInArrayNull() {
				
		String[] input={"l123",null,"b3c567"};
	    String result=example.getMinNumericsString(input);		
		assertEquals("l123",result);
	}
	@Test
	public void shouldReturnNullWhenArrayEmpty() {
				
		String[] input={};
	    String result=example.getMinNumericsString(input);		
		assertEquals(null,result);
	}
	@Test
	public void shouldReturnNumCountInString() {
				
		int count=example.getNumCount("a1b2c3d475");		
		assertEquals(6,count);
	}
	@Test
	public void shouldReturnTrueWhenArrayEmpty() {
				
		String[] input={};	
		boolean isEmpty=example.isArrayEmptyOrNull(input);
		assertEquals(true,isEmpty);
	}
	@Test
	public void shouldReturnTrueWhenArrayNull() {
				
		String[] input=null;	
		boolean isEmpty=example.isArrayEmptyOrNull(input);
		assertEquals(true,isEmpty);
	}
	@Test
	public void shouldReturnFlaseWhenArrayEmptyIsNotEmpty() {
				
		String[] input={"abc","123"};	
		boolean isEmpty=example.isArrayEmptyOrNull(input);
		assertEquals(false,isEmpty);
	}
	@Test
	public void shouldReturnTrueWhenStringEmpty() {
				
		String input=" ";	
		boolean isEmpty=example.isStringEmptyOrNull(input);
		assertEquals(true,isEmpty);
	}
	@Test
	public void shouldReturnTrueWhenStringNull() {
				
		String input=null;	
		boolean isEmpty=example.isStringEmptyOrNull(input);
		assertEquals(true,isEmpty);
	}
	@Test
	public void shouldReturnFalseWhenStringIsNotEmpty() {
				
		String input="test";	
		boolean isEmpty=example.isStringEmptyOrNull(input);
		assertEquals(false,isEmpty);
	}

}
