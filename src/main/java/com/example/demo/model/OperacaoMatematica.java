package com.example.demo.model;

public class OperacaoMatematica {
    private double num1;
    private double num2;

    public OperacaoMatematica(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double calcularSoma() {
        return num1 + num2;
    }

    public double calcularSubtracao() {
        return num1 - num2;
    }

    public double calcularDvisao() {
        return num1 / num2;
    }

    public double calcularMultiplicacao() {
        return num1 * num2;
    }

    public double calcularExponeciacao() {
        return Math.pow(num1, num2);
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
}
