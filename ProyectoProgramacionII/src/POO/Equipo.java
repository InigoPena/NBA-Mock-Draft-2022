package POO;

import java.util.ArrayList;

public class Equipo {
	
	//Metodo que elija jugadores que vayan acorde con las necesidades
	//Metodo que genere jugdor necesario para equipo
	
	private String equipo;
	private double porcentajeAnotacionInt;
	private double porcentajeAnotacionExt;
	private int puestoEnDefensa;
	private int puestoEnAtaque;
	private double porcentaje3pts;
	private boolean buenaOrganización;
	private boolean buenJuegoFísico;
	private int pick1;
	private int pick2;
	private Interior necesidadInt;
	private Exterior necesidadExt;
	
	public String getEquipo() {
		return equipo;
	}
	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}
	public double getPorcentajeAnotacionInt() {
		return porcentajeAnotacionInt;
	}
	public void setPorcentajeAnotacionInt(double porcentajeAnotacionInt) {
		this.porcentajeAnotacionInt = porcentajeAnotacionInt;
	}
	public double getPorcentajeAnotacionExt() {
		return porcentajeAnotacionExt;
	}
	public void setPorcentajeAnotacionExt(double porcentajeAnotacionExt) {
		this.porcentajeAnotacionExt = porcentajeAnotacionExt;
	}
	public int getPuestoEnDefensa() {
		return puestoEnDefensa;
	}
	public void setPuestoEnDefensa(int puestoEnDefensa) {
		this.puestoEnDefensa = puestoEnDefensa;
	}
	public int getPuestoEnAtaque() {
		return puestoEnAtaque;
	}
	public void setPuestoEnAtaque(int puestoEnAtaque) {
		this.puestoEnAtaque = puestoEnAtaque;
	}
	public double getPorcentaje3pts() {
		return porcentaje3pts;
	}
	public void setPorcentaje3pts(double porcentaje3pts) {
		this.porcentaje3pts = porcentaje3pts;
	}
	public int getPick1() {
		return pick1;
	}
	public void setPick1(int pick1) {
		this.pick1 = pick1;
	}
	public int getPick2() {
		return pick2;
	}
	public void setPick2(int pick2) {
		this.pick2 = pick2;
	}
	public Interior getNecesidadInt() {
		return necesidadInt;
	}
	public void setNecesidadInt(Interior necesidadInt) {
		
		this.necesidadInt = necesidadInt;
	}
	
	public Exterior getNecesidadExt() {
		return necesidadExt;
	}
	public void setNecesidadExt(Exterior necesidadExt) {
		this.necesidadExt = necesidadExt;
	}
	
	public boolean isBuenJuegoFísico() {
		return buenJuegoFísico;
	}
	public void setBuenJuegoFísico(boolean buenJuegoFísico) {
		this.buenJuegoFísico = buenJuegoFísico;
	}
	public boolean isBuenaOrganización() {
		return buenaOrganización;
	}
	public void setBuenaOrganización(boolean buenaOrganización) {
		this.buenaOrganización = buenaOrganización;
	}
	
	public Equipo(String equipo, double porcentajeAnotacionInt, double porcentajeAnotacionExt, int puestoEnDefensa,
			int puestoEnAtaque, double porcentaje3pts, int pick1, int pick2, Interior necesidadInt, Exterior necesidadExt,
			boolean buenaOrganización, boolean buenJuegoFísico) {
		this.equipo = equipo;
		this.porcentajeAnotacionInt = porcentajeAnotacionInt;
		this.porcentajeAnotacionExt = porcentajeAnotacionExt;
		this.puestoEnDefensa = puestoEnDefensa;
		this.puestoEnAtaque = puestoEnAtaque;
		this.porcentaje3pts = porcentaje3pts;
		this.pick1 = pick1;
		this.pick2 = pick2;
		this.necesidadInt = necesidadInt;
		this.necesidadExt = necesidadExt;
		this.buenaOrganización = buenaOrganización;
		this.buenJuegoFísico = buenJuegoFísico;
	}
	
	public void Necesidades() {
		ArrayList<estiloExt> estExt = new ArrayList<estiloExt>();
		ArrayList<estiloInt> estInt = new ArrayList<estiloInt>();
		Exterior necesidadExt = new Exterior("", null, null, 0.0, 0.0, 0, 0.0, 0.0, 0.0, 0.0, true, estExt);
		Interior necesidadInt = new Interior("", null, null, 0.0, 0.0, 0, 0.0, 0.0, 0.0, 0.0, true, estInt);
		
		// A los peores equpios defendiendo les recomendara un defensor
		if(this.puestoEnDefensa>=22) {
			necesidadExt.estiloExt.add(estiloExt.DEFENSOR); //1
			necesidadInt.estiloInt.add(estiloInt.DEFENSOR); //1
			}
		// A los peores equipos exteriores les recomendara tiradores
		if(this.puestoEnAtaque>=18 && (this.porcentaje3pts<35 || this.porcentajeAnotacionExt<35)) {
			necesidadExt.estiloExt.add(estiloExt.TRIPLISTA); //2
			necesidadInt.estiloInt.add(estiloInt.MODERNO);
			}
		if(this.puestoEnAtaque>=20){
				necesidadExt.estiloExt.add(estiloExt.ANOTADOR); //3
			}
		//A los equipos que les haga falta interiores les recomendara segun necesidad
		if(this.porcentajeAnotacionInt<35 && this.porcentaje3pts<30) {
			necesidadInt.estiloInt.add(estiloInt.MODERNO);
		}else if(this.buenJuegoFísico == false || this.porcentajeAnotacionInt<=30) {
			necesidadInt.estiloInt.add(estiloInt.CLASICO);
		}
		// El tercer estilo lo reservamos para algo más especifico

		if(this.isBuenaOrganización() == false) {
			necesidadExt.estiloExt.add(estiloExt.ORGANIZADOR);
			necesidadInt.estiloInt.add(estiloInt.ORGANIZADOR);
		}
		if(this.buenJuegoFísico == false) {
			necesidadExt.estiloExt.add(estiloExt.ATLETICO);
			necesidadInt.estiloInt.add(estiloInt.ATLETICO);
		}
		
		// Asignarlos
		setNecesidadExt(necesidadExt);
		setNecesidadInt(necesidadInt);
		}
	}
