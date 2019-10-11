package org.escalade.consumer.impl.dao;

import org.escalade.consumer.contract.dao.UserDao;
import org.escalade.model.beans.User;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UserDaoImpl extends AbstractDaoImpl implements UserDao {
	@Override
	public void createUser(User pUser) {
		Session session = null;
		Transaction tx = null;
		
		try {
			session = getSessionFactory().openSession();
			tx = session.beginTransaction();
			session.save(pUser);
			tx.commit();
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}		
		} finally {
			if (session != null) {
				session.close();
			}			
		}	
	}

}
