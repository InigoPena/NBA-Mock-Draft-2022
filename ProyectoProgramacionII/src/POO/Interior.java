package POO;

import java.util.ArrayList;

enum estiloInt{CLASICO, ATLETICO, MODERNO, DEFENSOR, ORGANIZADOR};

public class Interior extends Jugador {
	
	public ArrayList<estiloInt> estiloInt;
	
	
	
	public ArrayList<estiloInt> getEstiloInt() {
		return estiloInt;
	}


	public void setEstiloInt(ArrayList<estiloInt> estiloInt) {
		this.estiloInt = estiloInt;
	}


	public Interior(String nombre, procedencia procedencia, impactoEnLiga impacto, double altura, double peso,
			int edad, double ppp, double app, double rpp, double minutosPP, boolean propensoLesion,
			ArrayList<estiloInt> estiloInt) {
		super(nombre, procedencia, impacto, altura, peso, edad, ppp, app, rpp, minutosPP, propensoLesion);
		this.estiloInt = estiloInt;
	}
	
	
	//Metodo que indica que indica el valor de su eleccion en el draft(Interior)
	@Override
	public double valorDraft() {
		double valor = 0.0;
		
		//Valor de la anotacion
		if(this.getPpp()>=23) {
			valor = valor+1.7;
		}else if(this.getPpp()>=20) {
			valor = valor+1.3;
		}else if(this.getPpp()<20 && this.getPpp()>=15){
			valor = valor + 1;
		}else if(this.getPpp()<15 && this.getPpp()>=7.5) {
			valor = valor + 0.6;
		}else {valor = valor + 0.25;}
		
		//Valor de asistencias
		if(this.getApp()>=8) {
			valor = valor+1.5;
		}else if(this.getApp()<8 && this.getApp()>2) {
			valor = valor + 1.25;
		}else {valor = valor+1;}
		
		//Valor de rebotes
		if(this.getRpp()>=8) {
			valor = valor+1.25;
		}else if(this.getRpp()<8 && this.getRpp()>=4) {
			valor = valor+0.75;
		}else {valor = valor+0.25;}
		
		//Valor de procedencia
		if(this.getProcedencia() == procedencia.NCAA) {
			valor = valor*3;
		}else if(this.getProcedencia() == procedencia.GLEAGUE){
			valor = valor*2.95;
		}else if(this.getProcedencia() == procedencia.EUROLIGA){
			valor = valor*2.9;
		}else {valor = valor*2.8;}
		
		//Minutos jugador
		if(this.getMinutosPP()>28) {
			valor = valor*1.16;
		}else if(this.getMinutosPP()<28 && this.getMinutosPP()>17) {
			valor = valor*1.13;
		}else {
			valor = valor*1.1;
		}
		
		//Valor de impacto
		if(this.getImpacto() == impactoEnLiga.DIRECTO) {
			valor = valor+1;
		}else {valor=valor+0.75;}
		
		//Se lesiona
		if(this.isPropensoLesion())
			valor = valor-1.5;
		
		//Resultado
		return valor;
	}
	
	
}
