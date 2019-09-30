/**
 * 
 */
package com.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.models.Medico;

/**
 * @author wellington
 *
 */
public interface IMedicoRepository extends JpaRepository<Medico, Long>{

}
