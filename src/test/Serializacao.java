package test;

import model.Cliente;

import java.io.*;

public class Serializacao {

	public static void test() throws IOException, ClassNotFoundException {
		
		Cliente clienteA = new Cliente();

		clienteA.setNome("nome");
		clienteA.setProfissao("profissão");
		clienteA.setCpf("111.111.111-11");
		
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("assets/cliente.bin"));

		objectOutputStream.writeObject(clienteA);
		objectOutputStream.close();
	
		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("assets/cliente.bin"));

		Cliente clienteB = (Cliente) objectInputStream.readObject();

		objectInputStream.close();

		System.out.println(clienteB.getCpf());
	}
}
