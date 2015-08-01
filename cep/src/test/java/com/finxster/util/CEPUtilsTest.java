package com.finxster.util;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.finxster.util.CEPUtils;

public class CEPUtilsTest {

    @Test
    public void cepValido() {
        assertTrue(CEPUtils.isCepValido("04142-081"));
    }

    @Test
    public void cepInvalidoValido() {
        assertFalse(CEPUtils.isCepValido("04142-08"));
        assertFalse(CEPUtils.isCepValido("04142-0"));
        assertFalse(CEPUtils.isCepValido("04142-"));
        assertFalse(CEPUtils.isCepValido("04142"));
        assertFalse(CEPUtils.isCepValido("04142081"));
        assertFalse(CEPUtils.isCepValido("0414-081"));
        assertFalse(CEPUtils.isCepValido("041-081"));
        assertFalse(CEPUtils.isCepValido("04-081"));
        assertFalse(CEPUtils.isCepValido("0-081"));
        assertFalse(CEPUtils.isCepValido("-081"));
        assertFalse(CEPUtils.isCepValido("-"));
    }

}
