package models;



public class Productos {

	
	private Integer id_Productos;
	private String nombre;
	private Double precio;
	private Categoria id_Categoria;
	
	
	
	public Integer getId_Productos() {
		return id_Productos;
	}
	public void setId_Productos(Integer id_Productos) {
		this.id_Productos = id_Productos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public Categoria getId_Categoria() {
		return id_Categoria;
	}
	public void setId_Categoria(Categoria id_Categoria) {
		this.id_Categoria = id_Categoria;
	}
	
	
	

}