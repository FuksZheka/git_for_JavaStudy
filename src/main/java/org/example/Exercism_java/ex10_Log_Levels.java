package org.example.Exercism_java;

/*
Introduction
Strings

A String in Java is an object that represents immutable text as a sequence of Unicode characters (letters, digits, punctuation, etc.). Double quotes are used to define a String instance:

String fruit = "Apple";

Strings are manipulated by calling the string's methods. Once a string has been constructed, its value can never change. Any methods that appear to modify a string will actually return a new string. The String class provides some static methods to transform the strings.
Instructions

In this exercise you'll be processing log-lines.

Each log line is a string formatted as follows: "[<LEVEL>]: <MESSAGE>".

There are three different log levels:

    INFO
    WARNING
    ERROR

You have three tasks, each of which will take a log line and ask you to do something with it.
1. Get message from a log line

Implement the (static) LogLevels.message() method to return a log line's message:

LogLevels.message("[ERROR]: Invalid operation")
// => "Invalid operation"

Any leading or trailing white space should be removed:

LogLevels.message("[WARNING]:  Disk almost full\r\n")
// => "Disk almost full"

2. Get log level from a log line

Implement the (static) LogLevels.logLevel() method to return a log line's log level, which should be returned in lowercase:

LogLevels.logLevel("[ERROR]: Invalid operation")
// => "error"

3. Reformat a log line

Implement the (static) LogLevels.reformat() method that reformats the log line, putting the message first and the log level after it in parentheses:

LogLevels.reformat("[INFO]: Operation completed")
// => "Operation completed (info)"

*/
public class ex10_Log_Levels {
    public static String message(String logLine) {
        if (logLine.contains(":")) {
            int temp = logLine.indexOf(":");
            String substring = logLine.substring(temp + 1);
            return substring.trim();
        }
        return logLine;
    }
    public static String logLevel(String logLine) {
        // Find the log level between [ and ]
        int start = logLine.indexOf("[") + 1;
        int end = logLine.indexOf("]");
        // Extract level and convert to lowercase
        return logLine.substring(start, end).toLowerCase();
    }
    /*
    public static String reformat(String logLine) {
        String message = message(logLine);
        String level = logLevel(logLine);
        StringBuilder result = new StringBuilder();
        result.append(message);
        result.append("(");
        result.append(level);
        result.append(")");
        return String.valueOf(result);
    } */

    public static String reformat(String logLine) {
        String message = message(logLine);
        String level = logLevel(logLine);
        return message + " (" + level + ")";
    }

    public static void main(String[] args) {
        ex10_Log_Levels.message("[ERROR]: Invalid operation");
        ex10_Log_Levels.logLevel("[ERROR]: Invalid operation");
        ex10_Log_Levels.logLevel("das");
    }
}
