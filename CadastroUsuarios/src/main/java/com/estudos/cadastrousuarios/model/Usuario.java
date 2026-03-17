package com.estudos.cadastrousuarios.model;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tb_usuarios")
@Data
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(unique = true, nullable = false)
    private String gmail;
}
