package Exercism_java.ex_DialingCodes;

import com.sun.jdi.Value;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class DialingCodes {

    private final Map<Integer, String> countryCodes;

    public DialingCodes() {
        this.countryCodes = new HashMap<>();
    }

    /**
     * Returns a copy of the current dialing codes map
     *
     * @return Map of dialing codes to country names
     */

    public Map<Integer, String> getCodes() {
        return new HashMap<>(countryCodes); // Return a defensive copy
    }

    /**
     * Adds or updates a dialing code and corresponding country
     *
     * @param code    The international dialing code
     * @param country The country name
     */
    public void setDialingCode(int code, String country) {
        countryCodes.put(code, country);
    }

    public String getCountry(Integer code) {
        return countryCodes.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if ((!countryCodes.containsKey(code)) && (!countryCodes.containsValue(country))) setDialingCode(code, country);
    }

    public Integer findDialingCode(String country) {

        for (Map.Entry<Integer, String> entry : countryCodes.entrySet()) {
            if (country.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }




    public void updateCountryDialingCode (Integer code, String country){
        Integer oldCode = findDialingCode(country);
        if (oldCode != null){
            countryCodes.remove(oldCode);
            countryCodes.put(code,country);
        }
    }


        public static void main (String[]args){
            DialingCodes dialingCodes = new DialingCodes();
            dialingCodes.setDialingCode(679, "Fiji");
        }
    }

