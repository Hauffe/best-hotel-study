package model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Preco {
    private Hotel hotel;
    private TipoCliente cliente;
    private TipoDia dia;
    private Double preco;
}
