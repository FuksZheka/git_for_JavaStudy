package org.example.Exercism_java.ex_17_Logs_Logs_Logs;

public enum LogLevel {
    UNKNOWN(0),
    TRACE(1),
    DEBUG(2),
    INFO(4),
    WARNING(5),
    ERROR(6),
    FATAL(42);

    private final int numericCode;

    LogLevel(int numericCode) {
        this.numericCode = numericCode;
    }

    public int getNumericCode() {
        return numericCode;
    }
}