package Action;


import java.io.UnsupportedEncodingException;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.Query;
import org.hibernate.Session;
import session.HibernateSessionFactory;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import model.User;

public class UserRegister extends ActionSupport implements SessionAware {
    private String uname;
    private String upsw;
    private Map<String,Object> session;
	

	@Override
	public void setSession(Map<String, Object> arg0) {
		session = arg0;
	}
    public String userRegister() throws UnsupportedEncodingException{
    	if(uname==null){
			return "suc";
		}
    	User user = new User();
		user.setUsername(uname);
		user.setPassword(upsw);
		ActionContext actioncontext=ActionContext.getContext();
    	Session dbs = HibernateSessionFactory.getSession();
    	Query query;
    	String hql="from User where username='"+user.getUsername()+"'";
    	query = dbs.createQuery(hql);
		if(uname.equals("")){
			actioncontext.put("tipsmsg", "username is empty");
		}
		else if(query.list().size()>0){
			//session.put("registermsg", "该用户名已被注册！");	
			actioncontext.put("tipsmsg", "the username has been used,please choose another");
		}else{
			dbs.beginTransaction();
			dbs.save(user);
			dbs.beginTransaction().commit();	
			//session.put("registermsg", "注册成功，请登录");
			actioncontext.put("tipsmsg", "regiser ok , please login");
		}
		return "suc"; 
    }
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpsw() {
		return upsw;
	}
	public void setUpsw(String upsw) {
		this.upsw = upsw;
	}
}