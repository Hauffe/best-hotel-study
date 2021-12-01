package Util;

import model.Preco;
import model.TipoCliente;
import model.TipoDia;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class DBTest {

    @Test
    public void filterPrecosPorDiaECliente(){
        DB db = new DB();

        List<Preco> precos = db.filterPrecosPorDiaECliente(TipoCliente.FIDELIDADE, TipoDia.DIA_DE_SEMANA);

        assertEquals(precos.size(), 3);
        assertEquals(precos.get(0).getHotel().getNome(), "Parque das flores");
    }

}