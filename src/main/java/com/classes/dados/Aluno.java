package com.classes.dados;

public class Aluno {
    // atributos aluno
    private String id;
    private String nome;
    private int idade;
    private String genero;
    private int expprofissional;
    private boolean primeiraGraduacao;
    private String perfil;

    // get e set alunos
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int isExpprofissional() {
        return expprofissional;
    }

    public void setExpprofissional(int expprofissional) {
        this.expprofissional = expprofissional;
    }

    public boolean isPrimeiraGraduacao() {
        return primeiraGraduacao;
    }

    public void setPrimeiraGraduacao(boolean primeiraGraduacao) {
        this.primeiraGraduacao = primeiraGraduacao;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    // construtor aluno
    public Aluno(String id, String nome, int idade, int expprofissional, String genero, boolean primeiraGraduacao, String perfil) {
        this.id = id;  
        this.nome = nome;
        this.idade = idade;
        this.expprofissional = expprofissional;
        this.genero = genero;
        this.primeiraGraduacao = primeiraGraduacao;
        this.perfil = perfil;
    }


}