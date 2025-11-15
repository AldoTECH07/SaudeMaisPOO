package com.projetoPablo;

public class Main {
    public static void main(String[] args) {
        Paciente p1 = new Paciente("Aldo", "10600501450", "12/06/1995", "saude+@gmail.com", "saude+123", "verde", "20:34");

        p1.login("saude+@gmail.com", "saude+123");

    }
}