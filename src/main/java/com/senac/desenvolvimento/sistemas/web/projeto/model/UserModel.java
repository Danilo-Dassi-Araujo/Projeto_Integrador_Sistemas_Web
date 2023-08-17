package com.senac.desenvolvimento.sistemas.web.projeto.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.naming.Name;
import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(schema = "SISTEMA_WEB", name = "TB_USUARIO")
public class UserModel {

    @Id
    @Column(name = "ID_USUARIO", nullable = false, updatable = false, precision = 10)
    @SequenceGenerator(name = "sqUsuario", sequenceName = "SQ_USUARIO", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "sqUsuario", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "NOME_USUARIO", nullable = false)
    private String name;

    @Column(name = "CPF", nullable = false)
    private String cpf;

    @Column(name = "EMAIL", nullable = false)
    private String email;

    @Column(name = "SENHA", nullable = false)
    private String password;

    @Column(name = "GRUPO", nullable = false)
    private String group;
}
