package com.projetoPablo;

public class Atendente extends Funcionario {
    // CONSTRUTOR
    public Atendente(String nome, String cpf, String dataNascimento, String matricula, String senha, UPA upaAlocado) {
        super(nome, cpf, dataNascimento, matricula, senha, upaAlocado);
    }

    // MÉTODOS
    public void cadastrarPaciente(Paciente paciente) {
        // SEM LOGICA
    }

    public void adicionarFila(Paciente paciente, UPA upa) {
        // SEM LOGICA
    }
}
