package edu.umg.progra2.catalogos;

public interface FabricaVehiculo {

	Automovil creaAutomovil(String modelo, String color, int potencia, double espacio);
	
	public Scooter creaScooter(String modelo, String color, int potencia);
}
