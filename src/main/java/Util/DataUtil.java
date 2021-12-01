package Util;

import model.TipoDia;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DataUtil {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMMyyyy(EEE)", Locale.ENGLISH);

    public TipoDia converterTipoDia(String data) {
        LocalDate date = LocalDate.parse(data, formatter);
        if(date.getDayOfWeek().getValue()<6){
            return TipoDia.DIA_DE_SEMANA;
        }else return TipoDia.FIM_DE_SEMANA;
    }
}
