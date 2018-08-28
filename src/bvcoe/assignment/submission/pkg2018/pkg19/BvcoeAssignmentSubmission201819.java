/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bvcoe.assignment.submission.pkg2018.pkg19;

/**
 *
 * @author mca
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
 
 
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
 
class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        for(int i=0;i<t;i++){
            int key = Integer.parseInt(br.readLine());
            String s = br.readLine();
            String result = "";
            
            for(int j=0;j<s.length();j++){
            	
            	char ch = s.charAt(j);
            	int charValue = ch;
            	
            	if(key>=0 && key<=25)
            	{
            		if(charValue>=65 && charValue<=90)
                	{
                		
                		int newCharValue = charValue+key;
                		
                		while(newCharValue > 90)
                		{
                			newCharValue = 65+(newCharValue-90)-1;
                		}
                			result = result+(char)newCharValue;
                	}
                	else if(charValue>=97 && charValue<=122)
                	{
                		
                		int newCharValue = charValue+key;
                		while(newCharValue > 122)
                		{
                			newCharValue = 97+(newCharValue-122)-1;
                		}
                		
                		result = result+(char)newCharValue;
                		
                	}
                	else if(ch == '.')
                		result = result+" ";
                	else
                		result = result+ch;
            	}
            	
            	else if(key>=26 && key<=51)
            	{
 
            		if(charValue>=65 && charValue<=90)
                	{
                		
                		int newCharValue = charValue+key;
                		
                		while(newCharValue > 90)
                		{
                			newCharValue = 65+(newCharValue-90)-1;
                		}
                		
                		result = result+changeCase((char)newCharValue);
                	}
                	else if(charValue>=97 && charValue<=122)
                	{
                		
                		int newCharValue = charValue+key;
                		
                		while(newCharValue > 122)
                		{
                			newCharValue = 97+(newCharValue-122)-1;
                		}
                		
                		result = result+changeCase((char)newCharValue);
                	}
                	else if(ch == '.')
                		result = result+" ";
                	else
                		result = result+changeCase(ch);
            	
            	}
            	
            }
            System.out.println(result);
        }
 
    }
    
    
    static char changeCase(char ch){
    	Character ch1 = ch;
    	String Case = "";
    	if(ch >=65 && ch<=90)
    		Case = ch1.toString().toLowerCase();
    	else if(ch>=97 && ch<=122)
    		Case = ch1.toString().toUpperCase();
    	
    	return Case.charAt(0);
    }
}
