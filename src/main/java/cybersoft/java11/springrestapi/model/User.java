package cybersoft.java11.springrestapi.model;

public class User {
	private String username;
	private String password;
	private String email;
	private String address;
	private String fullname;
	private String remarks;
	
	public User() {
		this.username = "";
		this.password = "";
		this.email = "";
		this.fullname = "";
		this.address = "";
		this.address = "";
		this.remarks = "";
	}
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	
}
