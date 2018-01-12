package br.com.srcomputador.nfe.servico.relatorio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.srcomputador.nfe.entidade.detalheProduto.Detalhamento;
import br.com.srcomputador.nfe.entidade.detalheProduto.Ipi;

@Service
public class DadosIpi {

	@SuppressWarnings("serial")
	public CabecalhoRelatorioExcel getCabecalhoIpi() {
		CabecalhoRelatorioExcel cabecalhoRelatorioExcel = new CabecalhoRelatorioExcel();
		cabecalhoRelatorioExcel.setTitulo("Impostos sobre Produtos Industrializados");
		cabecalhoRelatorioExcel.setCampos(new ArrayList<String>() {
			{
				add("Classe de Enquadramento");
				add("C�digo Enquadramento");
				add("C�digo do Selo");
				add("Quantidade Selo");
				add("CST");
				add("Qtd Total Unidade Padr�o");
				add("Valor por Unidade");
				add("Base de C�lculo IPI");
				add("Al�quota IPI");
				add("Valor IPI");


			}
		});
		return cabecalhoRelatorioExcel;
	}
	
	public List<String> relatorioIpi(Detalhamento detalhamento) {
		List<String> lista = new ArrayList<>();
		Ipi ipi = detalhamento.getImposto().getIpi();
		lista.add(ipi.getClEnq());
		lista.add(ipi.getcEnq());
		lista.add(ipi.getcSelo());
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
