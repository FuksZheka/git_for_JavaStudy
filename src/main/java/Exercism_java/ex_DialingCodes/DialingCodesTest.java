package Exercism_java.ex_DialingCodes;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.entry;


public class DialingCodesTest {


    @Test
    @Tag("task:2")
    @DisplayName("setDialingCode adds new entry")
    public void testSetDialingCodeAddsEntry() {
        DialingCodes codes = new DialingCodes();
        codes.setDialingCode(679, "Fiji");
        assertThat(codes.getCodes()).containsOnly(entry(679, "Fiji"));
    }
    @Test
    void getCodesInitiallyEmpty() {
        DialingCodes codes = new DialingCodes();
        assertThat(codes.getCodes()).isEmpty();
    }

    @Test
    void setDialingCodeAddsNewEntry() {
        DialingCodes codes = new DialingCodes();
        codes.setDialingCode(679, "Fiji");
        assertThat(codes.getCodes()).containsOnly(entry(679, "Fiji"));
    }

    @Test
    void setDialingCodeUpdatesExisting() {
        DialingCodes codes = new DialingCodes();
        codes.setDialingCode(679, "Unknown");
        codes.setDialingCode(679, "Fiji");
        assertThat(codes.getCodes()).containsOnly(entry(679, "Fiji"));
    }
}
