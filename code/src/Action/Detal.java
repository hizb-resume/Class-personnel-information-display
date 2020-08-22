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

public class Detal extends ActionSupport implements SessionAware {
    private Integer id;
    private Map<String,Object> session;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Override
	public void setSession(Map<String, Object> arg0) {
		session = arg0;
	}
    public String show() throws UnsupportedEncodingException{
    	HttpServletRequest request=ServletActionContext.getRequest();
    	Session dbs = HibernateSessionFactory.getSession();
    	Query query;
    	if(id == null|| id==0){
    		return "disp_index";
    		
    	}else{
    		query = dbs.createQuery("from Students where id="+id+"");   
    		session.put("all",query.list());
    		request.setAttribute("stu", query.list());
    		return "success";
    	}
    	
    }

}

