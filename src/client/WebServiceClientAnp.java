package client;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import wsdl.stubs.Arquivo;
import wsdl.stubs.EngineService;
import wsdl.stubs.IEngineService;
import wsdl.stubs.InformacaoAutenticacao;

public class WebServiceClientAnp {

	public static void main(String[] args) {
		EngineService client = new EngineService();
		IEngineService service = client.getBasicHttpsBindingIEngineService();

		

		try {
			String fileName = "teste.zip";
			String filePath = "/home/thiago/desenv/misc/" + fileName;
			File file = new File(filePath);
			FileInputStream fis = new FileInputStream(file);
			BufferedInputStream inputStream = new BufferedInputStream(fis);
			byte[] bytes = new byte[(int) file.length()];
			
			Arquivo arquivo = new Arquivo();
			arquivo.setConteudo(bytes);
			arquivo.setNome(fileName);
			inputStream.close();
			
			InformacaoAutenticacao autenticacao = new InformacaoAutenticacao();
			autenticacao.setLogin("02566100535");
			autenticacao.setSenha("Ramon123");
			
			service.enviarArquivo(arquivo, autenticacao);
			
		} catch (IOException ex) {
			ex.printStackTrace();
		
			
		}      
	}
}
