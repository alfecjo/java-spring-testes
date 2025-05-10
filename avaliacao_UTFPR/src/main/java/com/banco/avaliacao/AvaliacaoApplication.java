package com.banco.avaliacao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.banco.avaliacao.entity.Cargo;
import com.banco.avaliacao.entity.Funcionario;
import com.banco.avaliacao.service.CargoService;
import com.banco.avaliacao.service.FuncionarioService;

import jakarta.transaction.Transactional;

@SpringBootApplication
public class AvaliacaoApplication {

	private static final Logger log = LoggerFactory.getLogger(AvaliacaoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(AvaliacaoApplication.class, args);
	}

	@Bean
	@Transactional
	public CommandLineRunner exsequor(FuncionarioService funcionarioService, CargoService cargoService) {

		return args -> {
			log.info("\nIniciando CommandLineRunner...\n");

			Cargo cargo = new Cargo();
			cargo.setCargoAtual("Gerente");
			cargoService.saveCargo(cargo);
			Funcionario funcionario = new Funcionario();
			funcionario.setNome("ACFA");
			funcionario.setSexo("M");
			funcionario.setTelefone("1234567899");
			funcionario.setCargo(cargo); // Associando o funcionário ao cargo
			funcionarioService.saveFuncionario(funcionario);

			cargo = new Cargo();
			cargo.setCargoAtual("Diretor");
			cargoService.saveCargo(cargo);
			funcionario = new Funcionario();
			funcionario.setNome("Joao");
			funcionario.setSexo("M");
			funcionario.setTelefone("2234567899");
			funcionario.setCargo(cargo); // Associando o funcionário ao cargo
			funcionarioService.saveFuncionario(funcionario);

			cargo = new Cargo();
			cargo.setCargoAtual("Chefe");
			cargoService.saveCargo(cargo);
			funcionario = new Funcionario();
			funcionario.setNome("Luis");
			funcionario.setSexo("M");
			funcionario.setTelefone("3234567899");
			funcionario.setCargo(cargo); // Associando o funcionário ao cargo
			funcionarioService.saveFuncionario(funcionario);

			String traco = "\n---------------------------\n";
			Integer cargoExcluido = 1;
			log.info(traco);
			cargoService.deleteCargoById(cargoExcluido);
			log.info("\nCargo " + cargoExcluido + " removido...\n");

			Integer funcionarioExcluido = 2;
			log.info(traco);
			funcionarioService.deleteFuncionarioById(funcionarioExcluido);
			log.info("\nFuncionario " + funcionarioExcluido + " removido...\n");

			log.info("\nLista todos Funcionarios...\n");
			log.info(traco);
			for (Funcionario func : funcionarioService.listaTodosFuncionarios())
				log.info(func.toString());

			log.info(traco);
			log.info("\nLista todos Cargos...\n");
			for (Cargo carg : cargoService.listaTodosCargos())
				log.info(carg.toString());

			log.info(traco);
			log.info("\nLista todos os funcionarios em ordem crescente pelo nome...\n");
			for (Funcionario func : funcionarioService.findAllFuncionariosOrderByNomeAsc())
				log.info(func.toString());

			log.info(traco);
			log.info("\nLista quantidade de funcionarios " + funcionarioService.quantidadeDeFuncionarios() + "...\n");

		};
	}
}
