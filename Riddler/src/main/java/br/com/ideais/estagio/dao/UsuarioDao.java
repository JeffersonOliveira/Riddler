package br.com.ideais.estagio.dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import br.com.ideais.estagio.model.Usuario;

@Transactional
public class UsuarioDao implements AbstractDao<Usuario> {
		
		private HibernateTemplate hibernateTemplate;
		
		public UsuarioDao(HibernateTemplate hibernateTemplate) {
			this.hibernateTemplate = hibernateTemplate;
		}

		public void persist(Usuario usuario) {
			hibernateTemplate.persist(usuario);
		}

		public List<Usuario> list() {
			return hibernateTemplate.loadAll(Usuario.class);
		}

		public boolean delete(Usuario usuario) {
			try{
				hibernateTemplate.delete(usuario);
				return true;
			}catch (Exception e) {
				return false;
			}
		}

		public boolean saveOrUpdate(Usuario usuario) {
			try{
				hibernateTemplate.saveOrUpdate(usuario);
				return true;
			}catch (Exception e) {
				return false;
			}
		}

		public Usuario findById(Long id) {
			return hibernateTemplate.get(Usuario.class, id);
		}

		
	}
		

