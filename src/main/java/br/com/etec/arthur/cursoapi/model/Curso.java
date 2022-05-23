package br.com.etec.arthur.cursoapi.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "curso")

public class Curso {
    // criação das variáveis do banco de dados

    // big int do banco de dados vira 'Long' no java
    private Long id;

    // deixando tudo minúsculo por enquanto (@column) por conta do banco de dados que altera quando está em camel case
    private String nomecurso;

    // getters and setters (alt + insert)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomecurso() {
        return nomecurso;
    }

    public void setNomecurso(String nomecurso) {
        this.nomecurso = nomecurso;
    }
}
