package edu.umg.progra2.catalogos;

public class FabricaVehiculoElectricidad implements FabricaVehiculo {

	@Override
	public Automovil creaAutomovil(String modelo, String color, int potencia, double espacio) {
		
		return new AutomovilElectrico(modelo, color, potencia, espacio);
	}

	@Override
	public Scooter creaScooter(String modelo, String color, int potencia) {
		
		return new ScooterElectrico(modelo, color, potencia);
	}

}