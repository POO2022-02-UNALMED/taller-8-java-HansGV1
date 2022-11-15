package test;

public class Futbolista implements Comparable<Futbolista>{
	private String nombre;
	private int edad;
	private final String posicion;
	
	public Futbolista(String nombre, int edad, String posicion) {
		this.nombre = nombre;
		this.edad = edad;
		this.posicion = posicion;
	}
	
	public Futbolista(){
		Futbolista futbolista1 = new Futbolista("Maradona", 30,"delantero");
	}
	
	public boolean equals(Futbolista f) {}
	
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return this.edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getPosicion() {
		return this.posicion;
	}
	
	@Override
	public String toString(){
		return "El futbolista" + this.getNombre() + "tiene" + this.getEdad() + ", y juega de " + this.getPosicion();
	}
	
}
