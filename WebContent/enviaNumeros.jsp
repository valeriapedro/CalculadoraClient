<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="operacoes.*" %>
<%@ page import="javax.xml.rpc.ServiceException" %>
<%@ page import="java.rmi.*" %>
<%
	//Recebe valores do form
	int a = Integer.parseInt (request.getParameter("num1"));
	int b = Integer.parseInt (request.getParameter("num2"));
	
	//Envia dados para webservice
	BasicOperationsService service = new BasicOperationsServiceLocator();
	try {
		BasicOperations obj = (BasicOperations) service.getBasicOperations();
		//System.out.println("Resultado= "+obj.toUpperCase("teste"));
		%>
			<table>
				<tr>
					<td>
						Soma = 
					</td>
					<td>
						<%= obj.soma(a, b) %> 
					</td>
				</tr>
				<tr>
					<td>
						Subtração = 
					</td>
					<td>
						<%= obj.subtrai(a, b) %> 
					</td>
				</tr>
				<tr>
					<td>
						Multiplicação = 
					</td>
					<td>
						<%= obj.mult(a, b) %> 
					</td>
				</tr>
				<tr>
					<td>
						Divisão = 
					</td>
					<td>
						<%= obj.div(a, b) %> 
					</td>					
				</tr>				
			</table>
		<%
	} catch (ServiceException e){
		e.printStackTrace();
	} catch (RemoteException e1){
		e1.printStackTrace();
	}

%>
