
package models;

import javax.swing.JOptionPane;


public class Veiculo {
    private int quilos;
    private int VelocMax;
    private float Preco;

    public Veiculo(){
        this(0, 0, (float)0.0);
    }
    
    public Veiculo(int quilos, int VelocMax, float Preco) {
        this.quilos = quilos;
        this.VelocMax = VelocMax;
        this.Preco = Preco;
    }

    public int getQuilos() {
        return quilos;
    }

    public void setQuilos(int quilos) {
        this.quilos = quilos;
    }

    public int getVelocMax() {
        return VelocMax;
    }

    public void setVelocMax(int VelocMax) {
        this.VelocMax = VelocMax;
    }

    public float getPreco() {
        return Preco;
    }

    public void setPreco(float Preco) {
        this.Preco = Preco;
    }
    
    public void SolicitarDados(){
        setQuilos(Integer.parseInt(JOptionPane.showInputDialog("Qual o peso do veículo em KG: ")));
        setVelocMax(Integer.parseInt(JOptionPane.showInputDialog("Qual a velocidade máxima do veículo: ")));
        setPreco(Float.parseFloat(JOptionPane.showInputDialog("Qual o preço do veículo: ")));
    }
    
    public void MostrarDados(){
        System.out.println("O peso do veículo é: " + getQuilos());
        System.out.println("A velocidade do veículo é: " + getVelocMax());
        System.out.println("O preço do veículo é: " + getPreco());
    }
}
