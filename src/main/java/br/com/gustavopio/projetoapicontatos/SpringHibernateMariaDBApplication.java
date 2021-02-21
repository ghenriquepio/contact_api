/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gustavopio.projetoapicontatos;

import br.com.gustavopio.projetoapicontatos.model.Contact;
import br.com.gustavopio.projetoapicontatos.repository.ContactRepository;
import java.util.stream.LongStream;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author Gustavo Pio
 */
@SpringBootApplication
public class SpringHibernateMariaDBApplication {
    
        public static void main(String[] args) {
        SpringApplication.run(SpringHibernateMariaDBApplication.class, args);
    }

    @Bean
    CommandLineRunner init(ContactRepository repository) {
        return args -> {
            repository.deleteAll();
            LongStream.range(1, 11)
                    .mapToObj(i -> {
                        Contact c = new Contact();
                        c.setName("Contact " + i);
                        c.setEmail("contact" + i + "@email.com");
                        c.setPhone("(111) 111-1111");
                        return c;
                    })
                    .map(v -> repository.save(v))
                    .forEach(System.out::println);
        };
    }
}
