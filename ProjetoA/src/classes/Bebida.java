package classes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rodrigo
 */
public class Bebida {
    private String sabor;
    private String tipo;
    private float tamanho;
    private int qt;
    private float valor;
    // Metodos especiais

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }

    public int getQt() {
        return qt;
    }

    public void setQt(int qt) {
        this.qt = qt;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    //Metodo construtor
    public void Bebida(){
        this.sabor = "s";
        this.tipo = "LATA";
        this.tamanho = 350;
        this.valor = 5;
    }
    public void mostrar(){
        System.out.println("Sabor: " + getSabor());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Estoque: " + getQt());
        System.out.println("Preço: " + getValor());
    }
}
