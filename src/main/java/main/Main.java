
package main;

import models.Veiculo;
import models.CarroPasseio;
import models.Caminhao;

public class Main {
    public static void main(String[] args){
        CarroPasseio carro1 = new CarroPasseio();
        
        carro1.SolicitarDados();
        carro1.MostrarDados();
    }
    
}
