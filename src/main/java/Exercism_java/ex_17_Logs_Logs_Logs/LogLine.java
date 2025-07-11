package Exercism_java.ex_17_Logs_Logs_Logs;

public class LogLine {
    private final String logLine;

    public LogLine(String logLine) {
        this.logLine = logLine;
    }

    public LogLevel getLogLevel() {
        // Extract the level part between [ and ]
        int start = this.logLine.indexOf('[') + 1;
        int end = logLine.indexOf(']');
        String levelStr = logLine.substring(start, end);
        switch (levelStr) {
            case "TRC":
                return LogLevel.TRACE;
            case "DBG":
                return LogLevel.DEBUG;
            case "INF":
                return LogLevel.INFO;
            case "WRN":
                return LogLevel.WARNING;
            case "ERR":
                return LogLevel.ERROR;
            case "FTL":
                return LogLevel.FATAL;
            default:
                return LogLevel.UNKNOWN;
        }

    }

    public String getOutputForShortLog() {
        LogLevel logLevel = getLogLevel();
        int numericCode = logLevel.getNumericCode();
        int messageStart = logLine.indexOf("]:") + 2;
        String message = logLine.substring(messageStart).trim();

        return numericCode + ":" + message;
    }
}
