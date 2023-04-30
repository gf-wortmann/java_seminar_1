/*
    Given an input string s, reverse the order of the words.
    A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
    Return a string of the words in reverse order concatenated by a single space.
    Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string
    should only have a single space separating the words. Do not include any extra spaces.
 */

package org.example.seminar_1.ht_1;

import java.util.ArrayDeque;

public class ht_1 {
    public static void main ( String[] args ) {
        String input = ( " the   sky is blue " );
        String reversed = reverseWords ( input );
        System.out.printf ( "result is: %s\n" , reversed );
    }

    static String reverseWords ( String input ) {
/*
Remove end blanks
 */
//        input.strip ( );
/*
    Forming the input to the array, splitting it on blanks
 */
        String[] words = input.split ( " " );
/*
    We'll reverse the array of words with the Deque class as this one is designed for LIFO queues
    Blank words will be filtered by comparing ones to zero length string
 */
        ArrayDeque <String> adq = new ArrayDeque <> ( );
        for ( String word : words ) {
            if ( !word.strip ( ).equals ( "" ) ) adq.push ( word.strip ( ) );
        }
/*
    Forming the result string by StringBuilder class.
    Extracting words from Deque in reversal order, as usual for Deque class
 */
        StringBuilder sb1 = new StringBuilder ( );
        while ( !adq.isEmpty ( ) ) {
            sb1.append ( adq.pop ( ) ).append ( " " );
        }
        return sb1.toString ( ).strip ( );
    }
}
