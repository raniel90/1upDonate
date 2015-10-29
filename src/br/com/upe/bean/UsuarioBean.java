package br.com.upe.bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import org.primefaces.context.RequestContext;

/**
 * Created by ximenes on 27/10/15.
 */
@ManagedBean
public class UsuarioBean {

	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void login(ActionEvent event) {
		RequestContext context = RequestContext.getCurrentInstance();
		FacesMessage message = null;
		boolean loggedIn = false;

		try {
			FacesContext facesContext = FacesContext.getCurrentInstance();
			ExternalContext externalContext = facesContext.getExternalContext();

			if (username != null && username.equals("admin") && password != null && password.equals("admin")) {
				loggedIn = true;
				message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Bem-vindo", username);
				externalContext.redirect("../index.xhtml");
			} else {
				loggedIn = false;
				message = new FacesMessage(FacesMessage.SEVERITY_WARN, "Erro de login", "Credenciais Inválidas");
			}

			FacesContext.getCurrentInstance().addMessage(null, message);
			context.addCallbackParam("loggedIn", loggedIn);

		} catch (Exception e) {
			e.printStackTrace();

		}
	}
}
