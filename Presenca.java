package models;

import java.util.List;

public class Presenca {

    private String dia;
    private List<Aluno> alunos;

    public Presenca(String s, List<Aluno> alunos) {
        this.dia = dia;
        this.alunos = alunos;
    }

    public void addAlunos (Aluno aluno) {
        alunos.add(aluno);
    }

    public String getDia() {
        return dia;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }
}
