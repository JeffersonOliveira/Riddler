package br.com.ideais.estagio.dao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
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

	public boolean dataAlarme() {
		
		//List<Alarme> alarmes = new ArrayList<Alarme>();
		Set<Beneficio> beneficios = new TreeSet<Beneficio>();
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();

		Date dataAtual = new Date();
		String formatoAtual = "dd/MM/yyyy";
		SimpleDateFormat dataAtualFormatada = new SimpleDateFormat(formatoAtual);
		int dataAtualmillis = Integer.parseInt(dataAtualFormatada
				.format(dataAtual));

		for (Funcionario funcionario : funcionarios) {

			for (Feitos feito : funcionario.getFeitos()) {
				beneficios.add(feito.getEtapa().getBeneficio());
			}

			for (Beneficio beneficio : beneficios) {
				{
					Date admissao = funcionario.getDataDeAdmissao();
					Calendar prazo = GregorianCalendar.getInstance();
					prazo.setTime( admissao );
					prazo.add(Calendar.DAY_OF_MONTH, beneficio.getPrazo() - 5);
				}

				// ...
				Date dtPrazo = funcionario.getDataDeAdmissao();
				// dtPrazo.add(Calendar, (beneficios.getPrazo() - 5));

				dtPrazo.setDate(dtPrazo.getDate() + beneficio.getPrazo() - 5);
				String formatoPrazo = "dd/MM/yyyy";
				SimpleDateFormat dataPrazoFormatada = new SimpleDateFormat(
						formatoPrazo);
				int dtPrazomillis = Integer.parseInt(dataPrazoFormatada
						.format(dtPrazo));

				if (dtPrazomillis <= dataAtualmillis) {
					System.out.println(">>>>>>>>>>>>>>>>>>>> verdade dtPrazo "+dtPrazo);
					return true;
	
					
					
					
//					Alarme alarme = new Alarme();
//					alarme.setFuncionario(funcionario);
//					alarme.setBeneficio(beneficio);Alarme alarme = new Alarme();
//					alarme.setFuncionario(funcionario);
//					alarme.setBeneficio(beneficio);
//					alarmes.add(alarme);
//					alarmes.add(alarme);
				}
			}
		}
		return false;
	}
}