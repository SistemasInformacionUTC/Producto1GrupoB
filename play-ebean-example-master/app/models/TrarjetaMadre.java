package models;

import javax.persistence.Entity;
import java.util.*;
import javax.persistence.*;

import com.avaje.ebean.Model;
import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;
import com.avaje.ebean.Model;
@Entity 
public class TrarjetaMadre extends Model{
	
	public Long id; 
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
