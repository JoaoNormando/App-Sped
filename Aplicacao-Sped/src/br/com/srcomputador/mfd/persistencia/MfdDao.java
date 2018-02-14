package br.com.srcomputador.mfd.persistencia;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.srcomputador.mfd.entidade.MFD;
import br.com.srcomputador.persistencia.GenericDao;

@Repository
public class MfdDao extends GenericDao<MFD, Long>{

	public MfdDao() {
		super(MFD.class);
	}

	public List<MFD> recuperarParaRelatorio() {
		return this.em.createQuery("from MFD", MFD.class).getResultList();
	}

	public List<MFD> recuperarRelatorioE14(){
		return this.em.createQuery("from MFD as mfd join fetch mfd.e14", MFD.class)	
			.setMaxResults(10)
			.getResultList();
		
	}
	
	public List<MFD> recuperarRelatorioE15(){
		return this.em.createQuery("from MFD as mfd join fetch mfd.e15", MFD.class)	
			.getResultList();
		
	}
	
}
