package test.kn;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Named;

@Named("helloBean")
//@ManagedBean
//@RequestScoped
public class HelloBean implements Serializable
{
    private String anyText = "overwrite me";
	
	public String getAnyText() {
		return anyText;
	}

	public void setAnyText(String anyText) {
		this.anyText = anyText;
	}
	

	public String getGreeting() 
    {
        return "Hello World!";
    }
    
	
    
}
