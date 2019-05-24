package Algorithms;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class shortPalindrome {
	
	public static void main(String[] args) {
		//System.out.println(shortPalindrome0("akkaak"));
		int[] a = new int[5];
		System.out.println(a.length);
		System.out.println(a[5]);
	}
	
	static int shortPalindrome0(String s) {
		
		int mod = (int) (Math.pow(10, 9) + 7);
		
		int freq[] = new int[26];
		int pairfreq[][] = new int[26][26];
		int tripfreq[] = new int[26];
		int count = 0;
        
		for(int i = 0; i < s.length(); i++) {
			int current = s.charAt(i) - 'a';
			count += tripfreq[current];
			for(int j = 0; j < 26; j++) {
				tripfreq[j] += pairfreq[j][current];
			}
			for(int j = 0; j < 26; j++) {
				pairfreq[j][current] += freq[j];
			}
			freq[current]++;
		}
		return count;
	}
	
	static int shortPalindrome1(String s) {
        int m = 1000000007;

        int freq[] = new int[26];

        int pairfreq[][] = new int[26][26];

        int tripfreq[] = new int[26];

        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            int current = s.charAt(i) - 'a';

            count += tripfreq[current] % m;

            count = count % m;

            for (int j = 0; j < 26; j++) {

                tripfreq[j] += pairfreq[j][current] % m;

                tripfreq[j] = tripfreq[j] % m;

            }

            for (int j = 0; j < 26; j++) {

                pairfreq[j][current] += freq[j] % m;

                pairfreq[j][current] = pairfreq[j][current] % m;

            }

            freq[current]++;

            freq[current] = freq[current] % m;
            
        }
        return count;
    }
    
}
