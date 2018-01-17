package br.com.srcomputador.nfe.servico.relatorio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.srcomputador.nfe.entidade.detalheProduto.Detalhamento;
import br.com.srcomputador.nfe.entidade.detalheProduto.Ipi;

@Service
public class DadosIpi {

	private final String mensagemCampoNulo = "O campo nao possui nenhum valor.";
	
	@SuppressWarnings("serial")
	public CabecalhoRelatorioExcel getCabecalhoIpi() {
		CabecalhoRelatorioExcel cabecalhoRelatorioExcel = new CabecalhoRelatorioExcel();
		cabecalhoRelatorioExcel.setTitulo("Impostos sobre Produtos Industrializados");
		cabecalhoRelatorioExcel.setCampos(new ArrayList<String>() {
			{
				add("Classe de Enquadramento");
				add("Codigo Enquadramento");
				add("Codigo do Selo");
				add("Quantidade Selo");
				add("CST");
				add("Qtd Total Unidade Padrao");
				add("Valor por Unidade");
				add("Base de Calculo IPI");
				add("Aliquota IPI");
				add("Valor IPI");


			}
		});
		return cabecalhoRelatorioExcel;
	}
	
	public List<String> relatorioIpi(Detalhamento detalhamento) {
		List<String> lista = new ArrayList<>();
		Ipi ipi = detalhamento.getImposto().getIpi();
		
		if(ipi == null) {
			for(int i = 0; i < this.getCabecalhoIpi().getCampos().size(); i++)
				lista.add(this.mensagemCampoNulo);
			return lista;
		}
		
		if(ipi.getClEnq() != null)
			lista.add(ipi.getClEnq());
		else
			lista.add(this.mensagemCampoNulo);
		
		if(ipi.getcEnq() != null)
			lista.add(ipi.getcEnq());
		else 
			lista.add(this.mensagemCampoNulo);
		
		if(ipi.getcEnq() != null)
			lista.add(ipi.getcSelo());
		else 
			lista.add(this.mensagemCampoNulo);
		
		lista.add(String.valueOf(ipi.getqSelo()));
		lista.add(String.valueOf(ipi.getCst()));
		lista.add(String.valueOf(ipi.getqUnid()));
		lista.add(String.valueOf(ipi.getvUnid()));
		lista.add(String.valueOf(ipi.getvBc()));
		lista.add(String.valueOf(ipi.getpIpi()));
		lista.add(String.valueOf(ipi.getvIpi()));
		return lista;
	}
	
}
