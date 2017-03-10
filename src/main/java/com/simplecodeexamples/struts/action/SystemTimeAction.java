package com.simplecodeexamples.struts.action;

import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class SystemTimeAction extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		try {
			Date date=new Date();
			PrintWriter printWriter=response.getWriter();
			printWriter.println(date);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
