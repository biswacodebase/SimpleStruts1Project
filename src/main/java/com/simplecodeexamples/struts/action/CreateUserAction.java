package com.simplecodeexamples.struts.action;

import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.simplecodeexamples.struts.dto.UserObject;
import com.simplecodeexamples.struts.form.UserForm;
import com.simplecodeexamples.struts.service.UserServiceImpl;

public class CreateUserAction extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		UserForm userForm = (UserForm) form;
		String forward="";
		try {
			UserObject userObject=new UserObject();
			userObject.setFirstName(userForm.getFirstName());
			userObject.setLastName(userForm.getLastName());
			userObject.setUserName(userForm.getUserName());
			SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-mm-dd");
			userObject.setDob(simpleDateFormat.parse(userForm.getDob()));
			UserServiceImpl userServiceImpl=new UserServiceImpl();
			UserObject userObject2=userServiceImpl.getUser(userObject);
			if (userObject2!=null) {
				forward="failure";
			}
			else
			{
				forward="success";
				userServiceImpl.createUser(userObject);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mapping.findForward(forward);
	}
}
