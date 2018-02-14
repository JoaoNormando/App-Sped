package br.com.srcomputador.relatorio;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.streaming.SXSSFSheet;

import br.com.srcomputador.mfd.entidade.RegistroE14;
import br.com.srcomputador.mfd.entidade.RegistroE15;
import br.com.srcomputador.servico.ConversorDataService;

public class RelatorioMFD02 extends Relatorio{
	
	private FolhaRelatorioMFDRegistroE14 relatorioMFDE14;
	private FolhaRelatorioMFDRegistroE15 relatorioMFDE15;
	
	public File geraRelatorio(List<RegistroE14> registrosE14, List<RegistroE15> registrosE15) throws IOException {
		this.criaFolhaE14(registrosE14);
		this.criaFolhaE15(registrosE15);
		File relatorio = this.geraRelatorio("RelatorioMFD");
		return relatorio; 
	}
	
	private void criaFolhaE14(List<RegistroE14> registros) throws IOException {
		this.relatorioMFDE14 = new FolhaRelatorioMFDRegistroE14(new ConversorDataService());
		SXSSFSheet folha = this.criaFolha(this.relatorioMFDE14.NOME_FOLHA);
		this.criarCabecalhoFolhaE14(folha);
		this.relatorioMFDE14.escreve(folha, registros);
		
		this.limparIndices();
	}
	
	private void criarCabecalhoFolhaE14(SXSSFSheet folha) {
		this.geraCabecalho(folha, this.relatorioMFDE14.getCabecalhoE01());
		this.geraCabecalho(folha, this.relatorioMFDE14.getCabecalhoE02());
		this.geraCabecalho(folha, this.relatorioMFDE14.getCabecalhoE14());
	}
	
	private void criaFolhaE15(List<RegistroE15> registros) throws IOException {
		this.relatorioMFDE15 = new FolhaRelatorioMFDRegistroE15(new ConversorDataService());
		SXSSFSheet folha = this.criaFolha(this.relatorioMFDE15.NOME_FOLHA);
		this.criaCabecalhoFolhaE15(folha);
		this.relatorioMFDE15.escreve(folha, registros);
		
		this.limparIndices();
	}
	
	private void criaCabecalhoFolhaE15(SXSSFSheet folha) {
		this.geraCabecalho(folha, this.relatorioMFDE15.getCabecalhoE01());
		this.geraCabecalho(folha, this.relatorioMFDE15.getCabecalhoE02());
		this.geraCabecalho(folha, this.relatorioMFDE15.getCabecalhoE15());
	}
	
}
