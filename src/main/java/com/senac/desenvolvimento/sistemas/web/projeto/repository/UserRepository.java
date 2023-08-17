package com.senac.desenvolvimento.sistemas.web.projeto.repository;

import com.senac.desenvolvimento.sistemas.web.projeto.model.UserModel;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserModel, Long>, JpaSpecificationExecutor<UserModel> {
}
