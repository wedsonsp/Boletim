/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.boletim.repository;

import com.bandtec.boletimapi.domain.Boletim;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Aluno
 */
public interface BoletimRepository extends CrudRepository<Boletim, Integer>{
    
}
