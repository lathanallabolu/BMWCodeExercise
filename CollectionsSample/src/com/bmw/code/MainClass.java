package com.bmw.code;




public class MainClass {
	
	public static void main(String[] args) {
		
	    ArrayExample example=new ArrayExample();
        String[] input={"abcd12345","222","l1t24aaaaa","l2225aaaaa","11123abc","l2222"};
        String result=example.getMinNumericsString(input);
        System.out.println(result);
	}

}
	