/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.upf.ads.imc.dominio;

/**
 *
 * @author rosba
 */
public class calculadoraIMC {
    /* atributos */
    private String cpf;
    private String nome;
    private Float peso;
    private Float altura;
    public String getCpf;
    public String getNome;

    /* métodos */
    public Float calcularIMC() {
        Float indice = getPeso() / (getAltura() * getAltura());
        return indice;
    }

    public String classificarIMC() {
        if (calcularIMC() < 18.5)
            return "Abaixo do peso";
        else if (calcularIMC() >= 18.5 || calcularIMC() <= 24.9)
            return "Peso normal";
        else if (calcularIMC() >= 25.0 || calcularIMC() <= 29.9)
            return "Sobrepeso";
        else if (calcularIMC() >= 30.0 || calcularIMC() <= 39.9)
            return "Obesidade";
        else if (calcularIMC() >= 40.0)
            return "Obesidade grave";
        return "";
        
    } 
    
    public String getCpf() {
    return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) throws Exception {
        if (peso < 0)
            throw new Exception("Somente peso acima de 0");
        this.peso = peso;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) throws Exception {
        if (altura < 0)
            throw new Exception("Somente altura acima de 0");
        this.altura = altura;
    }

}
