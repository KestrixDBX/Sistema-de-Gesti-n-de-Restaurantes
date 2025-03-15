package models;

public class Clientes {

	
	private Integer id_Clientes;
	private String nombre;
	private String telefono;
	private String Correo;
	
	public Integer getId_Clientes() {
		return id_Clientes;
	}
	public void setId_Clientes(Integer id_Clientes) {
		this.id_Clientes = id_Clientes;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return Correo;
	}
	public void setCorreo(String correo) {
		Correo = correo;
	}

    
}