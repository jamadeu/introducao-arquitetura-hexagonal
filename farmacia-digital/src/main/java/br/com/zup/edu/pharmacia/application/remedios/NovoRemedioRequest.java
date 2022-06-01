package br.com.zup.edu.pharmacia.application.remedios;

import br.com.zup.edu.pharmacia.domain.categorias.Categoria;
import br.com.zup.edu.pharmacia.domain.farmaceuticas.Farmaceutica;
import br.com.zup.edu.pharmacia.domain.remedios.NovoRemedio;
import br.com.zup.edu.pharmacia.domain.remedios.Remedio;

import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class NovoRemedioRequest implements NovoRemedio {

    @NotBlank
    private String nome;

    @ManyToOne
    private Farmaceutica farmaceutica;

    @ManyToOne
    private Categoria categoria;

    @NotNull
    private LocalDate dataFabricacao;

    @NotNull
    private LocalDate dataValidade;

    @Override
    public Remedio toModel() {
        return new Remedio(
                nome, farmaceutica, categoria, dataFabricacao, dataValidade
        );
    }

    public String getNome() {
        return nome;
    }

    public Farmaceutica getFarmaceutica() {
        return farmaceutica;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public NovoRemedioRequest(String nome, Farmaceutica farmaceutica, Categoria categoria, LocalDate dataFabricacao, LocalDate dataValidade) {
        this.nome = nome;
        this.farmaceutica = farmaceutica;
        this.categoria = categoria;
        this.dataFabricacao = dataFabricacao;
        this.dataValidade = dataValidade;
    }

    @Deprecated
    public NovoRemedioRequest() {
    }
}
