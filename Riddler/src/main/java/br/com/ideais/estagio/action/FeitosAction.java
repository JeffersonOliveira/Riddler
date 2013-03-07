//package br.com.ideais.estagio.action;
//
//import java.util.List;
//
//
//import javax.servlet.http.HttpServletRequest;
//
//import org.apache.struts2.ServletActionContext;
//
//import com.opensymphony.xwork2.ActionContext;
//
//import br.com.ideais.estagio.model.Feitos;
//import br.com.ideais.estagio.service.FeitosService;
//
//
//public class FeitosAction implements CRUDAction{
//
//	
//	private FeitosService feitosService;
//	private Feitos feitos;
//	private List<Feitos> feitos;
//
//	
//	public String execute() throws Exception {
//		return SUCESS;
//	}
//
//	public void prepare() throws Exception {
//		if(getFeitosFromRequest()!=null){
//			feitos = feitosService.findById(getFeitosFromRequest());
//	}
//
//	public String save() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public String update() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public String delete() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public String create() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public String list() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	
//
//}
