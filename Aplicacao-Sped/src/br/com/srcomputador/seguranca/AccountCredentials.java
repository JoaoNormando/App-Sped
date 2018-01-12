package br.com.srcomputador.seguranca;

public class AccountCredentials {
	
	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		System.out.println(username);
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		System.out.println(password);
		this.password = password;
	}
}
