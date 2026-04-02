package com.xexuu.andaluh;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public enum AndaluhMode {
    ESTANDAR("estandar", 'ç'),
    CECEO("ceceo", 'z'),
    SESEO("seseo", 's'),
    HEHEO("heheo", 'h');

    private final String label;
    private final char vaf;

    private static final Map<String, AndaluhMode> BY_LABEL = new HashMap<>();

    static {
        for (AndaluhMode mode : values()) {
            BY_LABEL.put(mode.label, mode);
        }
        BY_LABEL.put("zezeo", CECEO);
    }

    AndaluhMode(String label, char vaf) {
        this.label = label;
        this.vaf = vaf;
    }

    public String getLabel() {
        return label;
    }

    public char getVaf() {
        return vaf;
    }

    public static AndaluhMode fromInput(String input) {
        if (input == null || input.isBlank()) {
            return null;
        }
        return BY_LABEL.get(input.toLowerCase(Locale.ROOT));
    }
}
