package br.com.ideais.estagio.service;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ideais.estagio.dao.BeneficioDao;
import br.com.ideais.estagio.dao.EtapaDao;
import br.com.ideais.estagio.dao.FeitosDao;
import br.com.ideais.estagio.dao.FuncionarioDao;
import br.com.ideais.estagio.model.Beneficio;
import br.com.ideais.estagio.model.Etapa;
import br.com.ideais.estagio.model.Feitos;
import br.com.ideais.estagio.model.Funcionario;

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

@Service
public class RelatorioService {

	Document doc = null;
	OutputStream os = null;

	@Autowired
	private FuncionarioDao fDao;
	@Autowired
	private BeneficioDao bDao;
	@Autowired
	private EtapaDao eDao;
	@Autowired
	private FeitosDao feitosDao;

	public List<Funcionario> funcionarioList() {
		return fDao.list();
	}
	
	public List<Beneficio> beneficioList() {
		return bDao.list();
	}
	
	public List<Etapa> etapaList() {
		return eDao.list();
	}
	
	public List<Feitos> feitosList() {
		return feitosDao.list();
	}
	
	
	public void createPdf() throws Exception {

		try {
			// cria o documento tamanho A4, margens de 2,54cm
			doc = new Document(PageSize.A4, 72, 72, 72, 72);

			// cria a stream de saída
			os = new FileOutputStream("Tarefas.pdf");

			// associa a stream de saída ao
			PdfWriter.getInstance(doc, os);

			// abre o documento
			doc.open();

			// adiciona o texto ao PDF
			Paragraph p = new Paragraph("Relatório Geral de Tarefas");
			p.setAlignment(Element.ALIGN_CENTER);
			doc.add(p);

			PdfPTable table = new PdfPTable(3);
			PdfPCell header = new PdfPCell(new Paragraph(
					"Algumas Palavaras Reservadas do Java"));
			header.setColspan(3);
			table.addCell(header);
			table.addCell("abstract");
			table.addCell("extends");
			table.addCell("import");
			table.addCell("while");
			table.addCell("if");
			table.addCell("switch");
			doc.add(table);

		} finally {
			if (doc != null) {
				// fechamento do documento
				doc.close();
			}
			if (os != null) {
				// fechamento da stream de saída
				os.close();
			}
		}
			
	}

	public void setfDao(FuncionarioDao fDao) {
		this.fDao = fDao;
	}

	public void setbDao(BeneficioDao bDao) {
		this.bDao = bDao;
	}

	public void seteDao(EtapaDao eDao) {
		this.eDao = eDao;
	}

	public void setFeitosDao(FeitosDao feitosDao) {
		this.feitosDao = feitosDao;
	}

}
