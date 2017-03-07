package com.simplecodeexamples.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
 
import com.simplecodeexamples.struts.dto.UserObject;
import com.simplecodeexamples.struts.form.UserForm;
 
public class UserAction extends Action {
 @Override
 public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
   HttpServletResponse response) throws Exception {
  UserForm userForm = (UserForm) form;
  try {
   UserObject userObject=new UserObject();
   userObject.setFirstName(userForm.getFirstName());
   userObject.setLastName(userForm.getLastName());
   userObject.setUserName(userForm.getUserName());
   request.setAttribute("userObject",userObject);
  } catch (Exception e) {
   e.printStackTrace();
  }
  return mapping.findForward("success");
 }
}