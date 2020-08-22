package Interceptor;

import java.util.Map;

import model.User;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class UserPowerInterceptor extends AbstractInterceptor {
    
    
	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		//Object o = arg0.getInvocationContext().getSession().get("username");
		
		Map<String, Object> session = arg0.getInvocationContext().getSession();
		User o =(User)session.get("user1");
		System.out.println(o);
			
		if(o != null){
			return arg0.invoke();
			 
		}else{
			return "login";	
		}
		
	}

	

}
