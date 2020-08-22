package Action;


import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.Query;
import org.hibernate.Session;

import session.HibernateSessionFactory;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import model.User;

public class UserLogin extends ActionSupport implements SessionAware ,ModelDriven{
     private User user = new User();
     private Map<String,Object> session;
	@Override
	public void setSession(Map<String, Object> arg0) {
		session = arg0;
	}
	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return user;
	}
	
	public String userLogin(){
		ActionContext actioncontext=ActionContext.getContext();
		if(user.getUsername()==null){
			return "login";
		}
		if(user.getUsername().equals("")){
			actioncontext.put("tipsmsg", "username is empty");
			return "fail";
		}

		Session dbs = HibernateSessionFactory.getSession();
		
		//hql方法：
		String hql = "from User  where username='" + user.getUsername() + "' AND password='" + user.getPassword() + "'" ;
		Query query = dbs.createQuery(hql);
		
		/**sql方法：
		String sql="select * from user where username='"+user.getUsername()+"' AND password='"+user.getPassword()+"'" ;
		Query query2 = dbs.createSQLQuery(sql);		
		**/
		
		
		if(query.list().size()>0){
			session.put("user1", user);
			return "suc";
		}else{			
			actioncontext.put("tipsmsg", "the username or password is wrong,please try again!");
			return "fail";
		}

	}

}
