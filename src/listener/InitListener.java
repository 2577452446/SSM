package listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import util.Val;

//是一个ServletContext监听器
//能监听ServletContext对象的创建和销毁
//ServletContext对象就是全局对象，在JSP里面叫做application
//因为tomcat启动的时候，就加载这个监听器，所以可以用它来做初始化操作
@WebListener
public class InitListener implements ServletContextListener{

	@Override
	public void contextInitialized(ServletContextEvent evt) {
		ServletContext ctx = evt.getServletContext();
		ctx.setAttribute("rt", ctx.getContextPath());
		ctx.setAttribute(Val.URL, ctx.getContextPath());
		System.out.println(ctx.getContextPath());
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent evt) {
	}	
}