package br.com.ideais.estagio.dao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.ideais.estagio.model.Alarme;
import br.com.ideais.estagio.model.Beneficio;
import br.com.ideais.estagio.model.Feitos;
import br.com.ideais.estagio.model.Funcionario;


@Service
@Transactional
public class AlarmeDao extends AbstractDao<Alarme> {
	
	@Autowired
	HibernateTemplate hibernateTemplate;
		
	
	public void dataAlarme(){
		
		List<Alarme> alarmes = new ArrayList<Alarme>();
		
		for (Funcionario funcionario: funcionarios) {
			 Set<Beneficio> beneficios = new TreeSet<Beneficio>();
			for (Feitos feito: funcionario.getFeitos()) {
				beneficios.add(feito.getEtapa().getBeneficio());		
			}
		}
			for (Beneficio beneficio: beneficios) {
				Date dtPrazo = usuario.getDataAdmissao();
				dtPrazo.add(Calendar.Date, (beneficios.getPrazo() - 5));

				if (dtPrazo <= hj) {
					Alarme alarme = new Alarme();
					alarme.setfuncionario(); 
					alarme.setbeneficio();

					alarmes.add(alarme);
				}
			}
		}
	
		
	
	
}

