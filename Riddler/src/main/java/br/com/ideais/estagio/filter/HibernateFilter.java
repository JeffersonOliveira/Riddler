package br.com.ideais.estagio.filter;

import org.hibernate.FlushMode;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Servlet Filter implementation class HibernateFilter
 */
//public class HibernateFilter extends OpenSessionInViewFilter{
//       
//	@Override
//	protected Session getSession(SessionFactory sessionFactory) throws DataAccessResourceFailureException {
//		Session session = SessionFactoryUtils.getSession(sessionFactory, true);
//		
//		session.setFlushMode(FlushMode.AUTO);
//		this.setFlushMode(FlushMode.AUTO);
//		
//		return super.getSession(sessionFactory);
//	}
//	
//	@Override
//	protected void closeSession(Session session, SessionFactory sessionFactory) {
//		try {
//			
//			if(session != null && session.isOpen() && session.isConnected()){
//				try {
//					session.flush();
//				} catch (HibernateException e) {
//					throw new CleanupFailureDataAccessException("Failed to flush session before close: " + e.getMessage(), e);
//				}catch (Exception e) {
//					
//				}
//			}
//			
//		}finally{
//			super.closeSession(session, sessionFactory);
//		}
//	}
//}