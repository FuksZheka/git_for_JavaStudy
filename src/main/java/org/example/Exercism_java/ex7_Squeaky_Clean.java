package org.example.Exercism_java;
/*
Introduction
Chars

The Java char type represents the smallest addressable components of text. Multiple chars can comprise a string such as "word" or chars can be processed independently. Their literals have single quotes e.g. 'A'.

There are many builtin library methods to inspect and manipulate chars. These can be found as static methods of the java.lang.Character class.

chars are sometimes used in conjunction with a StringBuilder object. This object has methods that allow a string to be constructed character by character and manipulated. At the end of the process toString can be called on it to output a complete string.
Instructions

In this exercise you will implement a partial set of utility routines to help a developer clean up SqueakyClean names.

In the 4 tasks you will gradually build up the clean method. A valid SqueakyClean name is comprised of zero or more letters and underscores.

In all cases the input string is guaranteed to be non-null. Note that the clean method should treat an empty string as valid.
1. Replace any spaces encountered with underscores

Implement the (static) SqueakyClean.clean() method to replace any spaces with underscores. This also applies to leading and trailing spaces.

SqueakyClean.clean("my   Id");
// => "my___Id"

2. Convert kebab-case to camelCase

Modify the (static) SqueakyClean.clean() method to convert kebab-case to camelCase.

SqueakyClean.clean("a-bc");
// => "aBc"

3. Convert leetspeak to normal text

Modify the (static) SqueakyClean.clean() method to convert leetspeak to normal text.

For simplicity we will only be replacing 4, 3, 0, 1 and 7 with a, e, o, l, and t, respectively.

SqueakyClean.clean("H3ll0 W0rld");
// => "Hello_World"
SqueakyClean.clean("4 73s7");
// => "a_test"

4. Omit characters that are not letters

Modify the (static) SqueakyClean.clean() method to omit any characters that are not letters.

SqueakyClean.clean("a$#.b");
// => "ab"


*/
public class ex7_Squeaky_Clean {
    private static String clean(String identifier) {
        StringBuilder cleaned = new StringBuilder();
        for (int i = 0; i < identifier.length(); i++) {
            char c = identifier.charAt(i);
            if (c == ' ') {
                cleaned.append('_');
            } else if (c == '-') {
                // Skip appending '-', and uppercase the next character
                if (i + 1 < identifier.length()) {  // Avoid out-of-bounds
                    char uppercaseNext = Character.toUpperCase(identifier.charAt(i + 1));
                    cleaned.append(uppercaseNext);
                    i++;  // Skip the next character (since we already processed it)
                }
            } else if (c == '4'|| c == '3' || c == '0' || c == '1' || c == '7') {
                char leetspeak_temp = 0;
                switch (c){
                    case '4' -> leetspeak_temp = 'a';
                    case '3' -> leetspeak_temp='e';
                    case '0' -> leetspeak_temp='o';
                    case '1' -> leetspeak_temp='l';
                    case '7' -> leetspeak_temp='t';
                    }
                cleaned.append(leetspeak_temp);
            } else if (Character.isLetter(c)){
                cleaned.append(c);  // Default case (append unchanged)
            }
        }

        return cleaned.toString();
    }

    public static void main(String[] args) {
        System.out.println(clean("leetspeak_is_fun"));
    }
}
