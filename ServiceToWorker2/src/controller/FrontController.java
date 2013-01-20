package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author gerdvnik
 */
public abstract class FrontController extends HttpServlet{
	private static final long serialVersionUID = 1L;
	private ControllerHelper helper;

	protected abstract ControllerHelper getHelper();
		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		helper = getHelper();
	}
}
