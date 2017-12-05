package br.com.srcomputador.nfe.servico;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.springframework.stereotype.Service;

import br.com.srcomputador.entidade.ModulosImportacao;

@Service
public class DetectarArquivoService {

	public ModulosImportacao detectar(File file) throws FileNotFoundException {
		Scanner leitor = new Scanner(file);
		if (leitor.hasNextLine()) {
			String line = leitor.nextLine();

			if (line.contains("<nfeProc")) {
				leitor.close();
				return ModulosImportacao.PROC_NFE;
			} else {
				leitor.close();
				return ModulosImportacao.NFE;
			}
		}
		leitor.close();
		return null;
	}

}
