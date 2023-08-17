package com.senac.desenvolvimento.sistemas.web.projeto.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(UserModel.class)
public class UserModel_ {

    public static volatile SingularAttribute<UserModel, Long> id;
    public static volatile SingularAttribute<UserModel, String> name;
    public static volatile SingularAttribute<UserModel, String> cpf;
    public static volatile SingularAttribute<UserModel, String> email;
    public static volatile SingularAttribute<UserModel, String> password;
    public static volatile SingularAttribute<UserModel, String> group;
}
