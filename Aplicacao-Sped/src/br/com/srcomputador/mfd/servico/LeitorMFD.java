package br.com.srcomputador.mfd.servico;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.srcomputador.mfd.entidade.MFD;
import br.com.srcomputador.mfd.entidade.Registro;
import br.com.srcomputador.mfd.entidade.RegistroE01;
import br.com.srcomputador.mfd.entidade.RegistroE02;
import br.com.srcomputador.mfd.entidade.RegistroE14;
import br.com.srcomputador.mfd.entidade.RegistroE15;
import br.com.srcomputador.mfd.entidade.RegistroE16;
import br.com.srcomputador.mfd.entidade.RegistroE17;
import br.com.srcomputador.mfd.entidade.RegistroE18;
import br.com.srcomputador.mfd.entidade.RegistroE19;
import br.com.srcomputador.mfd.entidade.RegistroE20;
import br.com.srcomputador.mfd.entidade.RegistroE21;

@Service
public class LeitorMFD {

	@Autowired
	private LeitorRegistro leitorRegistro;

	@Autowired
	private MFD mfd;

	/**
	 * @param arquivo
	 * @throws FileNotFoundException
	 */
	public MFD lerMfd(File arquivo) throws FileNotFoundException {
		Scanner leitor = new Scanner(arquivo);

		while (leitor.hasNextLine()) {

			String linha = leitor.nextLine();

			try {

				Registro registro = leitorRegistro.gerarRegistro(linha);

				String temp = registro.getTipoRegistro();

				switch (temp) {
				case "E01":
					mfd.setE01((RegistroE01) registro);
					break;
				case "E02":
					mfd.setE02((RegistroE02) registro);
					break;
				case "E14":
					RegistroE14 registro14 = (RegistroE14) registro;
					registro14.setMfd(mfd);
					mfd.getE14().add(registro14);
					break;
				case "E15":
					RegistroE15 registro15 = (RegistroE15) registro;
					registro15.setMfd(mfd);
					mfd.getE15().add(registro15);
					break;
				case "E16":
					RegistroE16 registro16 = (RegistroE16) registro;
					registro16.setMfd(mfd);
					mfd.getE16().add(registro16);
					break;
				case "E17":
					RegistroE17 registro17 = (RegistroE17) registro;
					registro17.setMfd(mfd);
					mfd.getE17().add(registro17);
					break;
				case "E18":
					RegistroE18 registro18 = (RegistroE18) registro;
					registro18.setMfd(mfd);
					mfd.getE18().add(registro18);
					break;
				case "E19":
					RegistroE19 registro19 = (RegistroE19) registro;
					registro19.setMfd(mfd);
					mfd.getE19().add(registro19);
					break;
				case "E20":
					RegistroE20 registro20 = (RegistroE20) registro;
					registro20.setMfd(mfd);
					mfd.getE20().add(registro20);
					break;
				case "E21":
					RegistroE21 registro21 = (RegistroE21) registro;
					registro21.setMfd(mfd);
					mfd.getE21().add(registro21);
					break;
				}

			} catch (NullPointerException e) {
//				e.printStackTrace();
			} catch (StringIndexOutOfBoundsException e) {
				e.printStackTrace();
			}

		}

		leitor.close();
		return mfd;
	}

}
