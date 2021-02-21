/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gustavopio.projetoapicontatos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.gustavopio.projetoapicontatos.model.Contact;
/**
 *
 * @author Gustavo Pio
 */
@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {

}
      