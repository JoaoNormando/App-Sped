package br.com.srcomputador.mfd.persistencia;

import org.springframework.stereotype.Repository;

import br.com.srcomputador.mfd.entidade.MFD;
import br.com.srcomputador.persistencia.GenericDao;

@Repository
public class MfdDao extends GenericDao<MFD, Long>{

	public MfdDao() {
		super(MFD.class);
	}

}
