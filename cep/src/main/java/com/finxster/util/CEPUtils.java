package com.finxster.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CEPUtils {

    public static boolean isCepValido(String cep) {
        Pattern p = Pattern.compile("\\d{5}-\\d{3}");
        Matcher m = p.matcher(cep);
        return m.matches();
    }
}
