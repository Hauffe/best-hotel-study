package controller;

import model.TipoCliente;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PrecoControllerTest {

    @Test
    public void getHotelMaisBarato() {
        //Arrange
        PrecoController controller = new PrecoController();
        List<String> datas = new ArrayList<>();
        datas.add("16Mar2020(Mon)");
        datas.add("17Mar2020(Tue)");
        datas.add("18Mar2020(Wed)");

        //Act
        String hotelBarato = controller.getHotelMaisBarato(TipoCliente.REGULAR, datas);

        //Assert
        assertEquals(hotelBarato, "Parque das flores");
    }

    @Test
    public void getHotelMaisBaratoCenario2() {
        //Arrange
        PrecoController controller = new PrecoController();
        List<String> datas = new ArrayList<>();
        datas.add("20Mar2020(Fri)");
        datas.add("21Mar2020(Sat)");
        datas.add("22Mar2020(Sun)");

        //Act
        String hotelBarato = controller.getHotelMaisBarato(TipoCliente.REGULAR, datas);

        //Assert
        assertEquals(hotelBarato, "Jardim Botânico");
    }

    @Test
    public void getHotelMaisBaratoCenario3() {
        //Arrange
        PrecoController controller = new PrecoController();
        List<String> datas = new ArrayList<>();
        datas.add("26Mar2020(Thu)");
        datas.add("27Mar2020(Fri)");
        datas.add("28Mar2020(Sat)");

        //Act
        String hotelBarato = controller.getHotelMaisBarato(TipoCliente.FIDELIDADE, datas);

        //Assert
        assertEquals(hotelBarato, "Mar Atlântico");
    }
}