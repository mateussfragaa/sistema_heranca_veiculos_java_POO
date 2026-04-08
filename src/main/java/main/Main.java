
package main;

import models.Veiculo;
import models.CarroPasseio;
import models.Caminhao;

public class Main {
    public static void main(String[] args){
        Caminhao caminhao1 = new Caminhao();
        
        caminhao1.SolicitarDados();
        caminhao1.MostrarDados();
    }
    
}
