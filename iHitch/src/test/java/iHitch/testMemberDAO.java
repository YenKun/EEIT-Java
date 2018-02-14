package iHitch;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.MemberDAO;
import model.bean.Member;

public class testMemberDAO {

	public static void main(String[] args) {
		 ApplicationContext ctx = new
				 ClassPathXmlApplicationContext("SpringRoot.config.xml");
//				 SessionFactory sessionFactory = (SessionFactory)
//				 ctx.getBean("sessionFactory");
				 try {
//				 sessionFactory.getCurrentSession().beginTransaction();
				
				 MemberDAO memberDAO = (MemberDAO)ctx.getBean("memberDAOHibernate");
				 List<Member> beans = memberDAO.select();
				 System.out.println("beans=" + beans);
				
//				 sessionFactory.getCurrentSession().getTransaction().commit();
//				 sessionFactory.getCurrentSession().close();
				 } finally {
				 ((ConfigurableApplicationContext) ctx).close();
				 }
	}

}
