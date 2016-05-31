import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;
import javax.faces.event.ComponentSystemEvent;
import javax.faces.event.ValueChangeEvent;


@ManagedBean(name="userBean", eager=true)
@SessionScoped
public class UserModel implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String name;
	
	private  Map<String,String> countryMap;
	private String selectedCountry = "United Kingdom"; //default value 
	private String oldselectCountry= "";
	
	@PostConstruct
	public void init(){
		
		this.name ="Unknow";
		this.countryMap = new LinkedHashMap<String,String>();
		countryMap.put("en", "English");
		countryMap.put("it", "Italia");
		countryMap.put("es", "Spagna");
		
	}
	
	public void onchangeCountries(ValueChangeEvent e){
		this.selectedCountry = e.getNewValue().toString();
		this.oldselectCountry = e.getOldValue().toString();
		}
	
	public String goPageNext(){
		return "next";
	}
	
	public void handleEvent(ComponentSystemEvent event){
		   name="Evento";
		}
	
	public void updateData(ActionEvent e){
		   this.name="Hello World";
		}
	
	public String getWelcomeMessage(){
		return "Salve " + name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public  Map<String, String> getCountryMap() {
		return countryMap;
	}


	public  void setCountryMap(Map<String, String> countryMap) {
		this.countryMap = countryMap;
	}


	public String getSelectedCountry() {
		return selectedCountry;
	}


	public void setSelectedCountry(String selectedCountry) {
		this.selectedCountry = selectedCountry;
	}

	public String getOldselectCountry() {
		return oldselectCountry;
	}

	public void setOldselectCountry(String oldselectCountry) {
		this.oldselectCountry = oldselectCountry;
	}
	
	

}
