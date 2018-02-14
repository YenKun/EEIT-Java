package model.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.MemberDAO;
import model.bean.Member;

public class MemberTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("SpringRoot.config.xml");
		try {
			MemberDAO dao = (MemberDAO) ctx.getBean("memberDAOHibernate");

			System.out.println(dao.select());
			System.out.println("---------------SELECT ALL---------------");
			
			System.out.println(dao.select(14));
			System.out.println("---------------SELECT BY ID---------------");
			
			System.out.println(dao.select("test@test"));
			System.out.println("---------------SELECT BY email---------------");
			
			Member insert = new Member();
			insert.setEmail("test1@test");
			insert.setPwd("test1");
			System.out.println(dao.insert(insert));
			System.out.println("---------------INSERT---------------");
			
			Member update = new Member();
			update.setMid(14);
			update.setEmail("update@update");
			update.setPwd("update");
			System.out.println(dao.update(update));
			System.out.println("---------------UPDATE---------------");
			
			System.out.println(dao.delete(18));
			System.out.println("---------------DELETE---------------");
			
		} finally {
			((ConfigurableApplicationContext)ctx).close();
		}

	}

}
