package com.finxster.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Classe utilitária para operações em cima de um CEP.
 *
 * @author finx
 * @created 01/08/2015
 */
public final class CEPUtils {

    /**
     * Construtor privado. Classes utilitárias não devem ser instanciadas.
     */
    private CEPUtils() {
    }

    /**
     * Verifica se o CEP é valido. Para um CEP ser válido, ele tem que respeitar a máscara <b>#####-###</b>
     *
     * @param cep o cep a ser verificado.
     * @return <code>true</code> caso o cep seja válido, <code>false</code> caso contrário.
     */
    public static boolean isCepValido(String cep) {
        // regex que verifica a máscara #####-###
        Pattern p = Pattern.compile("\\d{5}-\\d{3}");
        Matcher m = p.matcher(cep);
        return m.matches();
    }
}
