package com.simplecodeexamples.struts.form;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
 
public class UserForm extends ActionForm {
  
 private static final long serialVersionUID = 1L;
  
 private String userName;
 private String firstName;
 private String lastName;
 
 public String getUserName() {
  return userName;
 }
 
 public void setUserName(String userName) {
  this.userName = userName;
 }
 
 public String getFirstName() {
  return firstName;
 }
 
 public void setFirstName(String firstName) {
  this.firstName = firstName;
 }
 
 public String getLastName() {
  return lastName;
 }
 
 public void setLastName(String lastName) {
  this.lastName = lastName;
 }

  
 @Override
 public void reset(ActionMapping mapping, HttpServletRequest request) {
  firstName=null;
  lastName=null;
  userName=null;
 }
 
}