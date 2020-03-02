package com.JuegoTrivia.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.JuegoTrivia.demo.model.Usuario; 

/** Los repositorios almacenan las consultas*/
/**Declaro una interfaz que extienda el repositorio*/
/**Los metodos de consulta y las QUERY se declaran en la interfaz*/

public interface UsuarioJpaRepository extends JpaRepository<Usuario, Integer>{
	
	Usuario findByEmail(String mailIngresado);

	Usuario findByUserName(String userNameIngresado);
}
