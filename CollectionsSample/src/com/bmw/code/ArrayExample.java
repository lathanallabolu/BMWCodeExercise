package com.bmw.code;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayExample {	
	
	
	public String getMinNumericsString(String[] input)
	{   
		String result=null;
		List<String> inputList;			
		if(isArrayEmptyOrNull(input)) return result;
		try{
		    inputList=parseInput(input);		
		    result=processInputList(inputList);	
		}catch(Exception e)
		{
			System.out.println("Exception in processing The Input");
		}
		return result;
	}

	private String processInputList(List<String> inputList) {		
		boolean firstItem = true;
		String result=null;	
		
		for(String currentString:inputList)
		{		
		  		  
		  if(isStringEmptyOrNull(currentString))
		  {
			  continue;			  
		  }		  
		  
		  if(firstItem)
		  {
			 result=currentString;			 
			 firstItem=false;
		  }
		  else{
			 result=compareStrings(currentString,result);
		  }	  
			
		}	
		return result;
	}

	public String compareStrings(String currentString, String minNumericString) {
		
		int curNumericsCount = getNumCount(currentString);
		int currentStringLength=currentString.length();
		int minNumericCount=getNumCount(minNumericString);
		int minStringLength=minNumericString.length();
		String result=minNumericString;
		if(minNumericCount>curNumericsCount){
			  
		  result=currentString;
		}
		else if(minNumericCount==curNumericsCount && minStringLength<currentStringLength)
		{				 
		  result=currentString;
		}				  
			  
		return result;
	}
	
	public int getNumCount(String myString)
	{
		int count = 0;
		for (int i = 0; i < myString.length(); i++) {
		    if (Character.isDigit(myString.charAt(i))) {
		        count++;  
		    }
		}
		return count;
		
	}
	
	private List<String> parseInput(String[] input)
	{
		List<String> inputList= new ArrayList<String>();		
		inputList=Arrays.asList(input);
		return inputList;
		
	}
	public boolean isArrayEmptyOrNull(String[] input)
	{
		if(input==null || input.length==0)
			return true;
		
		else 
			return false;
			
		
	}
	public boolean isStringEmptyOrNull(String myString)
	{
		if(myString==null || myString.isEmpty() || myString.equals(" "))
			return true;
		
		else 
			return false;
			
		
	}
	

	

}
