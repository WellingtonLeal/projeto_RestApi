/**
 * 
 */
package com.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.models.Usuario;

/**
 * @author wellington
 *
 */
public interface IUsuarioRepository extends JpaRepository<Usuario, Long>{
	

}
