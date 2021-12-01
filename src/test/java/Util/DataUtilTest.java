package Util;

import model.TipoDia;
import org.junit.Test;

import static org.junit.Assert.*;

public class DataUtilTest {

    @Test
    public void testConvertDate(){
        DataUtil util = new DataUtil();
        String data = "26Mar2020(Thu)";

        TipoDia dia = util.converterTipoDia(data);

        assertEquals(dia, TipoDia.DIA_DE_SEMANA);
    }
}