package controller;

import Util.DB;
import Util.DataUtil;
import model.Hotel;
import model.TipoCliente;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PrecoController {

    DB db = new DB();
    DataUtil dataUtil = new DataUtil();

    public String getHotelMaisBarato(TipoCliente cliente, List<String> datas){
        Map<Hotel, Double> totais = new HashMap<>();
        db.hoteis.forEach(hotel -> {
            totais.put(hotel, 0.0);
        });

        datas.forEach(data ->{
            db.filterPrecosPorDiaECliente(cliente, dataUtil.converterTipoDia(data))
                    .forEach(preco -> totais.computeIfPresent(preco.getHotel(), (k, v) -> v+preco.getPreco()));
        });

        Map<Hotel, Double> sortedByCount = totais
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));

        System.out.println(sortedByCount);


        return sortedByCount.entrySet().stream().findFirst().get().getKey().getNome();
    }

}
