package org.example.Exercism_java.ex_Secret_Handshake;

import java.util.List;

public enum Signal {
    WINK,
    DOUBLE_BLINK,
    CLOSE_YOUR_EYES,
    JUMP;
    public static List <Signal> getAllValues(){
        return List.of(values());
    }
}
