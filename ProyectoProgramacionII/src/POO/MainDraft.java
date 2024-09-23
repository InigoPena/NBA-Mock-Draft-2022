package POO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;

public class MainDraft {
	
	public static void main(String[] args){
	
	ArrayList<estiloInt> ewemb = new ArrayList<estiloInt>();
	ewemb.add(estiloInt.MODERNO);
	ewemb.add(estiloInt.ATLETICO);
	ewemb.add(estiloInt.DEFENSOR);
	ewemb.add(estiloInt.ORGANIZADOR);
	ArrayList<estiloInt> ebrandon = new ArrayList<estiloInt>();
	ebrandon.add(estiloInt.ATLETICO);
	ebrandon.add(estiloInt.MODERNO);
	ArrayList<estiloExt> escot = new ArrayList<estiloExt>();
	escot.add(estiloExt.ATLETICO);
	escot.add(estiloExt.ANOTADOR);
	ArrayList<estiloExt> eamen = new ArrayList<estiloExt>();
	eamen.add(estiloExt.ORGANIZADOR);
	eamen.add(estiloExt.DEFENSOR);
	ArrayList<estiloInt> ejarace = new ArrayList<estiloInt>();
	ejarace.add(estiloInt.DEFENSOR);
	ejarace.add(estiloInt.ATLETICO);
	ArrayList<estiloInt> ehendricks = new ArrayList<estiloInt>();
	ehendricks.add(estiloInt.ATLETICO);
	ArrayList<estiloExt> ewhitmore = new ArrayList<estiloExt>();
	ewhitmore.add(estiloExt.TRIPLISTA);
	ewhitmore.add(estiloExt.ATLETICO);
	ArrayList<estiloExt> eausar = new ArrayList<estiloExt>();
	eausar.add(estiloExt.ORGANIZADOR);
	eausar.add(estiloExt.DEFENSOR);
	ArrayList<estiloExt> eblack = new ArrayList<estiloExt>();
	eblack.add(estiloExt.TRIPLISTA);
	eblack.add(estiloExt.ATLETICO);
	ArrayList<estiloExt> ehawkins = new ArrayList<estiloExt>();
	ehawkins.add(estiloExt.ATLETICO);
	ehawkins.add(estiloExt.ANOTADOR);
	ArrayList<estiloExt> egradey = new ArrayList<estiloExt>();
	egradey.add(estiloExt.TRIPLISTA);
	egradey.add(estiloExt.ANOTADOR);
	ArrayList<estiloInt> eclowney = new ArrayList<estiloInt>();
	eclowney.add(estiloInt.DEFENSOR);
	eclowney.add(estiloInt.CLASICO);
	ArrayList<estiloExt> ewallace = new ArrayList<estiloExt>();
	ewallace.add(estiloExt.DEFENSOR);
	ewallace.add(estiloExt.ORGANIZADOR);
	ArrayList<estiloExt> egeorge = new ArrayList<estiloExt>();
	egeorge.add(estiloExt.TRIPLISTA);
	egeorge.add(estiloExt.ANOTADOR);
	ArrayList<estiloExt> ejalen = new ArrayList<estiloExt>();
	ejalen.add(estiloExt.ORGANIZADOR);
	ejalen.add(estiloExt.ANOTADOR);
	
	Interior wembanyama = new Interior("Victor Wembanyama", procedencia.EUROLIGA, impactoEnLiga.DIRECTO, 2.21, 109.03, 19, 24.0, 2.4, 11.1, 31.4, false, ewemb);
	Interior brandon = new Interior("Brandon Miller", procedencia.NCAA, impactoEnLiga.DIRECTO, 2.03, 90.5, 20, 20.7, 2.3, 9.1, 30.6, false, ebrandon);
	Exterior scot = new Exterior("Scoot Henderson", procedencia.GLEAGUE, impactoEnLiga.DIRECTO, 1.88, 88.6, 19, 21.1, 7.6, 6.1, 31.8, false, escot);
	Exterior amen = new Exterior("Amen Thompson", procedencia.OTRO, impactoEnLiga.DIRECTO, 2.01, 89.8, 20, 20.8, 7.9, 8.2, 32.4, false, eamen);
	Interior jarace = new Interior("Jarace Walker", procedencia.NCAA, impactoEnLiga.DIRECTO, 2.01, 105.03, 19, 14.7, 2.4, 8.9, 29.8, false, ejarace);
	Interior hendricks = new Interior("Taylor Hendricks", procedencia.NCAA, impactoEnLiga.LARGO_PLAZO, 2.06, 95.07, 19, 15.7, 1.4, 7.2, 31.4, false, ehendricks);
	Exterior whitmore = new Exterior("Cam Withmore", procedencia.NCAA, impactoEnLiga.DIRECTO, 2.01, 106.2, 18, 16.6, 1.0, 7.0, 30.4, false, ewhitmore);
	Exterior ausar = new Exterior("Ausar Thompson", procedencia.OTRO, impactoEnLiga.DIRECTO, 2.01, 92.23, 20, 21.3, 7.9, 9.1, 33.1, false, eausar);
	Exterior black = new Exterior("Anthony Black", procedencia.NCAA, impactoEnLiga.LARGO_PLAZO, 2.01, 82.72, 19, 13.2, 4.0, 5.2, 31.2, false, eblack);
	Exterior hawkins = new Exterior("Jordan Hawkins", procedencia.NCAA, impactoEnLiga.DIRECTO, 1.96, 88.8, 21, 19.8, 1.6, 4.6, 26.7, false, ehawkins);
	Exterior gradey = new Exterior("Gradey Dick", procedencia.NCAA, impactoEnLiga.LARGO_PLAZO, 2.01, 90.3, 19, 15.5, 1.8, 5.7, 29.9, false, egradey);
	Interior clowney = new Interior("Noah Clowney", procedencia.NCAA, impactoEnLiga.LARGO_PLAZO, 2.08, 92.7, 19, 1.1, 11.2, 2.4, 27.4, true, eclowney);
	Exterior wallace = new Exterior("Cason Wallace", procedencia.NCAA, impactoEnLiga.LARGO_PLAZO, 1.91, 83.42, 19, 13.1, 4.8, 4.2, 31.4, false, ewallace);
	Exterior george = new Exterior("Keyonte George", procedencia.NCAA, impactoEnLiga.DIRECTO, 1.93, 99.2, 19, 19.3, 3.5, 5.2, 31.6, false, egeorge);
	Exterior jalen = new Exterior("Jalen Hood-Schifino", procedencia.NCAA, impactoEnLiga.DIRECTO, 1.96, 90.08, 19, 14.7, 4.0, 4.5, 27.3, true, ejalen);
	
	ArrayList<Jugador> mock = new ArrayList<Jugador>();
	mock.add(amen);
	mock.add(jarace);
	mock.add(hendricks);
	mock.add(wembanyama);
	mock.add(whitmore);
	mock.add(ausar);
	mock.add(black);
	mock.add(hawkins);
	mock.add(brandon);
	mock.add(gradey);
	mock.add(clowney);
	mock.add(wallace);
	mock.add(scot);
	mock.add(george);
	mock.add(jalen);
	
	System.out.println(mock);
	
	HashMap<String, ArrayList<Jugador>> recom = new HashMap<String, ArrayList<Jugador>>();
	
	Equipo miEquipo = new Equipo(null, 30.34, 70.66, 25, 8, 39.6, 5, 27, wembanyama, scot, false, false);
	miEquipo.Necesidades();
	
	Draft draft = new Draft(mock, recom);
	draft.mockDraftOrdenado();
	draft.drafteables();
	draft.recomendados(miEquipo);
	
	
	try{
		FileWriter fichero = new FileWriter("JugadoresRecomendados.txt");
		
		for(Jugador j:draft.getRecomendados().get("Ronda 1")) {
			fichero.write(j.getNombre() + " seria una buena elección.\n");
		}
		
		fichero.close();
	}catch(Exception ex) { ex.printStackTrace(); }
	
	
	System.out.println(draft.getMockDraft());
	System.out.println(miEquipo.getNecesidadExt().getEstiloExt());
	System.out.println(miEquipo.getNecesidadInt().getEstiloInt());
	
	try {
		FileReader lector = new FileReader("JugadoresRecomendados.txt");
		BufferedReader BR = new BufferedReader(lector);
		String linea;
		while((linea = BR.readLine()) != null) {
			System.out.println(linea);
		}
		BR.close();
		
	}catch(Exception ex) { ex.printStackTrace();}
	
	System.out.println(draft.getRecomendados());
	
	
	new VentanaNBA(draft);
	
	}
}
