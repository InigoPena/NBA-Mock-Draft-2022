package POO;

enum impactoEnLiga{DIRECTO, LARGO_PLAZO};
enum procedencia{NCAA, GLEAGUE, EUROLIGA, OTRO}

public abstract class Jugador implements Valor {
	
	
	private String nombre;
	private procedencia procedencia;
	private impactoEnLiga impacto;
	private double altura;
	private double peso;
	private int edad;
	private double ppp;
	private double app;
	private double rpp;
	private double minutosPP;
	private boolean propensoLesion;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public procedencia getProcedencia() {
		return procedencia;
	}
	public void setProcedencia(procedencia procedencia) {
		this.procedencia = procedencia;
	}
	public impactoEnLiga getImpacto() {
		return impacto;
	}
	public void setImpacto(impactoEnLiga impacto) {
		this.impacto = impacto;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getPpp() {
		return ppp;
	}
	public void setPpp(double ppp) {
		this.ppp = ppp;
	}
	public double getApp() {
		return app;
	}
	public void setApp(double app) {
		this.app = app;
	}
	public double getRpp() {
		return rpp;
	}
	public void setRpp(double rpp) {
		this.rpp = rpp;
	}
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public double getMinutosPP() {
		return minutosPP;
	}
	public void setMinutosPP(double minutosPP) {
		this.minutosPP = minutosPP;
	}
	
	public boolean isPropensoLesion() {
		return propensoLesion;
	}
	public void setPropensoLesion(boolean propensoLesion) {
		this.propensoLesion = propensoLesion;
	}
	
	public Jugador(String nombre, procedencia procedencia, impactoEnLiga impacto, double altura, double peso,
			int edad, double ppp, double app, double rpp, double minutosPP, boolean propensoLesion) {
		super();
		this.nombre = nombre;
		this.procedencia = procedencia;
		this.impacto = impacto;
		this.altura = altura;
		this.peso = peso;
		this.edad = edad;
		this.ppp = ppp;
		this.app = app;
		this.rpp = rpp;
		this.minutosPP = minutosPP;
		this.propensoLesion = propensoLesion;
	}
	
	@Override
	public String toString() {
		return this.nombre;
	}
	
	
}
