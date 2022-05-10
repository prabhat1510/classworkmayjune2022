package hrmsappwithannotation.utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class HibernateUtility {
	// SessionFactory -- is a factory of session and client of ConnectionProvider
	// org.hibernate.SessionFactory interface provides factory method to get the
	// object of Session
	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		return new Configuration().configure().buildSessionFactory();
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static void shutdown() {
		getSessionFactory().close();
	}
}