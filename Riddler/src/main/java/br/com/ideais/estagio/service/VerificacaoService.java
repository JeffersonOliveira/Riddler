package br.com.ideais.estagio.service;

import java.util.Calendar;

public class VerificacaoService {
 
    public static void main(String[] args) {
        // Data inicial
        Calendar dataPrevisao = Calendar.getInstance();
        // Atribui a data pegando da pagina(view)
        dataPrevisao.set(2013, Calendar.MARCH, 23);
 
        
        Calendar dataAtual = Calendar.getInstance();
 
        // Calcula a diferença entre hoje e da data de inicio
        long diferenca = dataPrevisao.getTimeInMillis() - dataAtual.getTimeInMillis();                    ;
 
        // Quantidade de milissegundos em um dia
        int tempoDia = 1000 * 60 * 60 * 24;
 
        long diasDiferenca = diferenca / tempoDia;
 
        System.out.println(">>>>>>>>>>>>>>>>>>..      .>>>>>>Entre a data inicial e final são " +
                            diasDiferenca + " dias de diferença.");
 
    }
 
}
	

