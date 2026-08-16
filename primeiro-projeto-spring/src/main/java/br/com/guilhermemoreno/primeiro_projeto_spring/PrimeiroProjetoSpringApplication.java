package br.com.guilhermemoreno.primeiro_projeto_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
// Anotação que indica o pacote base para o componente scan
@ComponentScan(basePackages = "br.com.guilhermemoreno")
public class PrimeiroProjetoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeiroProjetoSpringApplication.class, args);
	}

}
