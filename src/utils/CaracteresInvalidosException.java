package utils;

public class CaracteresInvalidosException extends Exception{
	
	public CaracteresInvalidosException() {
		super("El campo contiene caractéres inválidos, favor de revisar.");
	}
	
	public CaracteresInvalidosException(char caracter) {
		super("El campo no puede contener el caractér: " + caracter);
	}
	
	public CaracteresInvalidosException(String mensaje) {
		super(mensaje);
	}
	
	
}
