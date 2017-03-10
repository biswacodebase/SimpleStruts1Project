package com.simplecodeexamples.struts.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.simplecodeexamples.struts.dto.CountryObject;

public class GetCountryAction extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String continent=request.getParameter("continent");
		List<CountryObject> countryObjects=new ArrayList<CountryObject>();
		try {
			if (continent.equals("Asia")) {
				
				CountryObject countryObject1=new CountryObject();
				countryObject1.setName("India");
				countryObject1.setNationalLanguage("Hindi");
				countryObject1.setPopulation("1,310,069,000");
				countryObjects.add(countryObject1);
				
				CountryObject countryObject2=new CountryObject();
				countryObject2.setName("Japan");
				countryObject2.setNationalLanguage("Japanese");
				countryObject2.setPopulation("126,860,000");
				countryObjects.add(countryObject2);
				
				CountryObject countryObject3=new CountryObject();
				countryObject3.setName("China");
				countryObject3.setNationalLanguage("Chinese");
				countryObject3.setPopulation("1,376,049,000");
				countryObjects.add(countryObject3);
			}
			else if(continent.equals("Europe"))
			{
				CountryObject countryObject1=new CountryObject();
				countryObject1.setName("Germany");
				countryObject1.setNationalLanguage("German");
				countryObject1.setPopulation("82,175,700");
				countryObjects.add(countryObject1);
				
				CountryObject countryObject2=new CountryObject();
				countryObject2.setName("Italy");
				countryObject2.setNationalLanguage("Italian");
				countryObject2.setPopulation("60,674,003");
				countryObjects.add(countryObject2);
				
				CountryObject countryObject3=new CountryObject();
				countryObject3.setName("France");
				countryObject3.setNationalLanguage("French");
				countryObject3.setPopulation("66,991,000");
				countryObjects.add(countryObject3);
				
			}
			request.setAttribute("countryObjects", countryObjects);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mapping.findForward("successC");
	}

}
