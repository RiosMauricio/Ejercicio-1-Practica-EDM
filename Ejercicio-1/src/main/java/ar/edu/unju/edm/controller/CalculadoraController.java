package ar.edu.unju.edm.controller;

import ar.edu.unju.edm.modelo.Calculadora;

public class CalculadoraController {
	
	public void resolverSuma() {
	
		int a=10, b=20;   
		
		Calculadora nuevaCalculadora = new Calculadora(); 
		
		nuevaCalculadora.setA(a);
		nuevaCalculadora.setB(b); 
		nuevaCalculadora.sumar();
		System.out.println("El resultado de la suma es: "+ nuevaCalculadora.sumar());
	}
	
}
