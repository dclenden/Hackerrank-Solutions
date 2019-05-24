/*
* @author David W. Clendenning Jr.
*/
package Challenges;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class FindGoogle {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String string = bufferedReader.readLine();

        // Create your code here
        
        System.out.println(regExMatch(string));

        bufferedReader.close();
    }
    public static boolean regExMatch(String s){
        ArrayList<String> o = new ArrayList<>(Arrays.asList("o", "O", "0", "()", "<>", "[]"));
        ArrayList<String> l = new ArrayList<>(Arrays.asList("l", "L", "I"));
        ArrayList<String> e = new ArrayList<>(Arrays.asList("e", "E", "3"));
        Pattern p = Pattern.compile("^[Gg]+([oO0]{1}|([(]+[)])|([<]+[>])|([\\[]+[\\]])){2}+[Gg]+[IlL]+[e3E]$");
        Matcher m = p.matcher(s);
        if(m.matches()) {
        	System.out.println("True");
        	return true;
        }
        else {
        	System.out.println("False");
        	return false;
        }
    }
}
