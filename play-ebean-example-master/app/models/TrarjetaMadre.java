package models;

import com.avaje.ebean.Model;

public class TrarjetaMadre extends Model{
	
	long id; 
	public int precio;
	public String modelo;
	public int cantidad;
	
public TrarjetaMadre(long id, int precio, String modelo, int cantidad) {
		super();
		this.id = id;
		this.precio = precio;
		this.modelo = modelo;
		this.cantidad = cantidad;
	}
	
	
	
	
}
