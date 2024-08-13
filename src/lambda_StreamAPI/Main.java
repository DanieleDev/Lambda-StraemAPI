package lambda_StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String args[]) {

		List<Cliente> clientes = new ArrayList<>();
		clientes.add(new Cliente("Paulo", 22));
		clientes.add(new Cliente("Mauricio", 40));
		clientes.add(new Cliente("Joana", 32));
		clientes.add(new Cliente("Silvia", 38));
		clientes.add(new Cliente("Laura", 27));
		clientes.add(new Cliente("Vinicius", 18));
		clientes.add(new Cliente("Mirian", 50));
		
		List<Cliente> clienteFilters = clientes.stream()
				.filter(c -> c.getIdade() < 30)
				.collect(Collectors.toList());
		
		System.out.println("Filtrando os nomes daqueles que tem menos de 30 anos: ");
		clienteFilters.forEach(c -> System.out.println(c.getNome()));
		
		
		System.out.println("Utilizando o map para transfomar cliente para uma lista de inteiros, filtrando aqueles que tem mais de 30 anos:");
	 
		List<Integer> collect = clientes.stream()
		.map(c1 -> c1.getIdade()).filter(v -> v > 30)
		.collect(Collectors.toList());
		
		collect.forEach(c1 -> System.out.println(c1));

	}

}
