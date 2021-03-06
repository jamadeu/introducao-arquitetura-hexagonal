package br.com.zup.edu.pharmacia.domain.remedios;

import br.com.zup.edu.pharmacia.domain.categorias.Categoria;
import br.com.zup.edu.pharmacia.domain.farmaceuticas.Farmaceutica;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
public class Remedio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String nome;

    @ManyToOne
    private Farmaceutica farmaceutica;

    @ManyToOne
    private Categoria categoria;

    @NotNull
    @Column(name = "data_fabricacao")
    private LocalDate dataFabricacao;

    @NotNull
    @Column(name = "data_validade")
    private LocalDate dataValidade;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Farmaceutica getFarmaceutica() {
        return farmaceutica;
    }

    public void setFarmaceutica(Farmaceutica farmaceutica) {
        this.farmaceutica = farmaceutica;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    public Remedio(String nome, Farmaceutica farmaceutica, Categoria categoria, LocalDate dataFabricacao, LocalDate dataValidade) {
        this.nome = nome;
        this.farmaceutica = farmaceutica;
        this.categoria = categoria;
        this.dataFabricacao = dataFabricacao;
        this.dataValidade = dataValidade;
    }

    @Deprecated
    public Remedio() {
    }
}
/**
 * Implemente o cadastro de baseado nas informa????es a seguir.
 * Todo rem??dio tem um nome obrigat??rio
 * Todo rem??dio ?? fabricado por uma farmac??utica;
 * Todo rem??dio pertence a uma categoria (antibi??tico, antipir??tico, analg??sicos, entre outros)
 * Todo rem??dio deve conter uma data de fabrica????o
 * Todo rem??dio precisa ter uma data de validade
 */