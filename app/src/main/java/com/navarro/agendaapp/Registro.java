package com.navarro.agendaapp;

import java.util.Date;

public class Registro {
    //Declarando variaveis
    private int codigo;
    private String assunto;
    private Date dataEvento;
    private String descricao;

    //Criar um construtor - sem parametro
    public Registro(){
        this.codigo = 0;
        this.assunto = "";
        this.dataEvento = new Date();//0000/00/00
        this.descricao = "";
    }//fim do construtorPadrao

    public Registro(int codigo, String assunto, Date dataEvento, String descricao){
        this.codigo = codigo;
        this.assunto = assunto;
        this.dataEvento = dataEvento;
        this.descricao = descricao;
    }//fim do metodo

    //metodos gets e sets
    public int getCodigo() {
        return this.codigo;
    }

    public String getAssunto(){
        return this.assunto;
    }

    public Date getDataEvento() {
        return this.dataEvento;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public void setAssunto(String assunto){
        this.assunto = assunto;
    }

    public void setDataEvento(Date dataEvento){
        this.dataEvento = dataEvento;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }




}//fim da clasee
