package br.com.jamadeu.hexagonal.application;

import br.com.jamadeu.hexagonal.domain.Endereco;
import br.com.jamadeu.hexagonal.domain.NovaProposta;
import br.com.jamadeu.hexagonal.domain.Proposta;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class NovaPropostaRequest implements NovaProposta {

    @NotBlank
    private String nome;

    @CPF
    @NotBlank
    private String cpf;

    @Email
    @NotBlank
    private String email;

    @NotBlank
    private Endereco endereco;

    @Override
    public Proposta toModel() {
        return new Proposta(
                nome,
                cpf,
                email,
                endereco
        );
    }
}
