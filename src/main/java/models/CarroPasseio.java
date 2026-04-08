
package models;

import javax.swing.JOptionPane;

public class CarroPasseio extends Veiculo{
    private String Cor;
    private String Modelo;

    
    public CarroPasseio(
            int quilos, int VelocMax, float Preco, 
            String Cor, String Modelo
    ) {
        super(quilos, VelocMax, Preco);
        this.Cor = Cor;
        this.Modelo = Modelo;
    }
    
    public CarroPasseio(){
        this(0, 0, (float)0.0, "", "");
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String Cor) {
        this.Cor = Cor;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }
    
    @Override
    public void SolicitarDados(){
        super.SolicitarDados();
        setCor(JOptionPane.showInputDialog("Qual a cor do carro: "));
        setModelo(JOptionPane.showInputDialog("Qual o modelo do carro: "));
    }
    
    @Override
    public void MostrarDados(){
        super.MostrarDados();
        System.out.println("A cor do carro é: " + getCor());
        System.out.println("O modelo do carro é: " + getModelo());
    }
    
}
