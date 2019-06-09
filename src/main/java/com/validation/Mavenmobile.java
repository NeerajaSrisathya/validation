package com.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mavenmobile {
	public Boolean isValidMobile(String number){
		  Pattern p = Pattern.compile("(0/91)?[7-9][0-9]{9}"); 
		   
	      Matcher m = p.matcher(number); 
	      return (m.find() && m.group().equals(number)); 

}
}
