
package models;

import javax.swing.JOptionPane;

public class Caminhao extends Veiculo{
    private int CargaMax;
    private int AlturaMax;
    private int Comprimento;

    public Caminhao(){
        this(0, 0, (float)0.0, 0, 0, 0);
    }

    public Caminhao(
            int quilos, int VelocMax, float Preco,
            int CargaMax, int AlturaMax, int Comprimento
    ) {
        super(quilos, VelocMax, Preco);
        this.CargaMax = CargaMax;
        this.AlturaMax = AlturaMax;
        this.Comprimento = Comprimento;
    }

    public int getCargaMax() {
        return CargaMax;
    }

    public void setCargaMax(int CargaMax) {
        this.CargaMax = CargaMax;
    }

    public int getAlturaMax() {
        return AlturaMax;
    }

    public void setAlturaMax(int AlturaMax) {
        this.AlturaMax = AlturaMax;
    }

    public int getComprimento() {
        return Comprimento;
    }

    public void setComprimento(int Comprimento) {
        this.Comprimento = Comprimento;
    }
    
    @Override
    public void SolicitarDados(){
        super.SolicitarDados();
        setCargaMax(Integer.parseInt(JOptionPane.showInputDialog("Qual a carga máxima do caminhão: ")));
        setAlturaMax(Integer.parseInt(JOptionPane.showInputDialog("Qual a altura máxima do caminhão: ")));
        setComprimento(Integer.parseInt(JOptionPane.showInputDialog("Qual o comprimento do caminhão: ")));
    }
    
    @Override
    public void MostrarDados(){
        super.MostrarDados();
        System.out.println("A carga máxima do caminhão é: " + getCargaMax());
        System.out.println("A altura máxima do caminhão é: " + getAlturaMax());
        System.out.println("O comprimento do caminhão é: " + getComprimento());
    }
}
