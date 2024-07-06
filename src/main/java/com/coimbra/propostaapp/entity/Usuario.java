package com.coimbra.propostaapp.entity;

import jakarta.persistence.*;
@Entity
@Table(name = "tb_usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String sobrenome;
    private String cpf;
    private String telefone;
    private String renda;
    @OneToOne(mappedBy = "usuario")
    private Proposta proposta;
}
