package Util;

import model.Hotel;
import model.Preco;
import model.TipoCliente;
import model.TipoDia;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DB {
    public List<Hotel> hoteis;
    public List<Preco> precos;

    public DB() {
        this.hoteis = new ArrayList<>();
        this.precos = new ArrayList<>();

        hoteis.add(new Hotel("Parque das flores", 3));
        hoteis.add(new Hotel("Jardim Botânico", 4));
        hoteis.add(new Hotel("Mar Atlântico", 5));

        precos.add(new Preco(hoteis.get(0), TipoCliente.REGULAR, TipoDia.DIA_DE_SEMANA, 110.0));
        precos.add(new Preco(hoteis.get(0), TipoCliente.FIDELIDADE, TipoDia.DIA_DE_SEMANA, 80.0));
        precos.add(new Preco(hoteis.get(0), TipoCliente.REGULAR, TipoDia.FIM_DE_SEMANA, 90.0));
        precos.add(new Preco(hoteis.get(0), TipoCliente.FIDELIDADE, TipoDia.FIM_DE_SEMANA, 80.0));

        precos.add(new Preco(hoteis.get(1), TipoCliente.REGULAR, TipoDia.DIA_DE_SEMANA, 160.0));
        precos.add(new Preco(hoteis.get(1), TipoCliente.FIDELIDADE, TipoDia.DIA_DE_SEMANA, 110.0));
        precos.add(new Preco(hoteis.get(1), TipoCliente.REGULAR, TipoDia.FIM_DE_SEMANA, 60.0));
        precos.add(new Preco(hoteis.get(1), TipoCliente.FIDELIDADE, TipoDia.FIM_DE_SEMANA, 50.0));

        precos.add(new Preco(hoteis.get(2), TipoCliente.REGULAR, TipoDia.DIA_DE_SEMANA, 220.0));
        precos.add(new Preco(hoteis.get(2), TipoCliente.FIDELIDADE, TipoDia.DIA_DE_SEMANA, 100.0));
        precos.add(new Preco(hoteis.get(2), TipoCliente.REGULAR, TipoDia.FIM_DE_SEMANA, 150.0));
        precos.add(new Preco(hoteis.get(2), TipoCliente.FIDELIDADE, TipoDia.FIM_DE_SEMANA, 40.0));
    }

    public List<Preco> filterPrecosPorDiaECliente(TipoCliente cliente, TipoDia dia){
        return precos.stream()
                .filter(preco -> preco.getCliente().equals(cliente))
                .filter(preco -> preco.getDia().equals(dia))
                .collect(Collectors.toList());
    }
}
