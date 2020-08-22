package Action;



import java.io.UnsupportedEncodingException;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.Query;
import org.hibernate.Session;
import session.HibernateSessionFactory;
import com.opensymphony.xwork2.ActionSupport;

public class ShowStu extends ActionSupport implements SessionAware {
    private String classname;
    private String sex;
    private Map<String,Object> session;
	
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	@Override
	public void setSession(Map<String, Object> arg0) {
		session = arg0;
	}
    public String showMessage() throws UnsupportedEncodingException{
    	HttpServletRequest request=ServletActionContext.getRequest();
    	Session dbs = HibernateSessionFactory.getSession();
    	Query query;
    	System.out.println(classname);

    	
    	if((classname == null|| classname.equals("0"))&&((sex == null|| sex.equals("0")))){
    		//all,all    		
    		query = dbs.createQuery("from Students");    		
    		session.put("all", query.list());    		
    		request.setAttribute("list", query.list());
    		
    	}else if(sex == null|| sex.equals("0")){//class,all
    		query = dbs.createQuery("from Students where banji='"+classname+"'");    		
    		session.put("all",query.list());
    		request.setAttribute("list", query.list());
    	}
    	else if(classname == null|| classname.equals("0")){//all,sex
    		query = dbs.createQuery("from Students where sex='"+sex+"'");    		
    		session.put("all",query.list());
    		request.setAttribute("list", query.list());
    	}
    	else {//class,sex
    		String hql = "from Students  where banji = '" + classname + "' and sex = '" + sex + "'" ;
    		query = dbs.createQuery(hql);    		
    		session.put("all",query.list());
    		request.setAttribute("list", query.list());
    	}
    	return "success";
    }
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
}
