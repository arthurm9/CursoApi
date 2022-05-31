package br.com.etec.arthur.cursoapi.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "curso")

public class Curso {
    // criação das variáveis do banco de dados

    // big int do banco de dados vira 'Long' no java
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Métodos equals() e hashCode() -> devem ser criados em todas as classes dentro do modelo
    // Eles são identificadores do registro (id)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return id.equals(curso.id);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

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
