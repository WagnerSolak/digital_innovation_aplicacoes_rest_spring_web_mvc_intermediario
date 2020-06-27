package digitalinnovation.example.restfull.service;

import digitalinnovation.example.restfull.controller.request.SoldadoEditRequest;
import digitalinnovation.example.restfull.dto.Soldado;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class SoldadoService {

    public Soldado buscarSoldado(String cpf){
        Soldado soldado = new Soldado();
        soldado.setCpf(cpf);
        soldado.setNome("Legolas");
        soldado.setRaca("Elfo");
        soldado.setArma("Arco e flexa");
        return soldado;
    }

    public void criarSoldado(Soldado soldado){

    }

    public void alterarSoldado(String cpf, SoldadoEditRequest soldadoEditRequest) {

    }

    public void deletarSoldado(String cpf) {
    }

    public List<Soldado> buscarTodosSoldados() {
        Soldado soldado1 = new Soldado();
        soldado1.setNome("Legolas");
        soldado1.setRaca("Elfo");
        soldado1.setArma("Arco e Flexa");
        soldado1.setCpf("666666666");

        Soldado soldado2 = new Soldado();
        soldado2.setNome("Virusioso");
        soldado2.setRaca("Vírus");
        soldado2.setArma("Corona");
        soldado2.setCpf("166666661");

        return Arrays.asList(soldado1, soldado2);
    }
}
