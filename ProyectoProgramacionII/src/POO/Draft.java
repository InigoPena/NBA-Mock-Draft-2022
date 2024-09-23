package POO;

import java.util.ArrayList;
import java.util.HashMap;

public class Draft {
	
	private ArrayList<Jugador> mockDraft;
	private HashMap<String, ArrayList<Jugador>> recomendados;

	public ArrayList<Jugador> getMockDraft() {
		return mockDraft;
	}

	public void setMockDraft(ArrayList<Jugador> mockDraft) {
		this.mockDraft = mockDraft;
	}
	
	public HashMap<String, ArrayList<Jugador>> getRecomendados() {
		return recomendados;
	}

	public void setRecomendados(HashMap<String, ArrayList<Jugador>> recomendados) {
		this.recomendados = recomendados;
	}
	
	public Draft(ArrayList<Jugador> mockDraft, HashMap<String, ArrayList<Jugador>> recomendados) {
		this.mockDraft = mockDraft;
		this.recomendados = recomendados;
	}

	// Metodo que organiza el array en el orden que determina el valor de los jugadores(De mejor jugador a peor)
	public void mockDraftOrdenado() {
		for (int i = 0; i < this.mockDraft.size()-1; i++){
		   for(int j = i+1; j < this.mockDraft.size(); j++){
		            if(this.mockDraft.get(i).valorDraft() < this.mockDraft.get(j).valorDraft()){
		                   Jugador cambiar = this.mockDraft.get(j);
		                   this.mockDraft.set(j, this.mockDraft.get(i));
		                   this.mockDraft.set(i, cambiar);
		                   }
		            }
		   }
		}
	// Metodo que elimina del array los jugadores que no se pueden presentar al draft (superan la edad maxima)
	public void drafteables() {
		for(Jugador j: this.mockDraft) {
			if(j.getEdad()>21) {
				this.mockDraft.remove(j);
			}
		}
	}
	
	//Metodo que hace el mapa de recomendados por ronda de draft si hay 60 jugadores
	public void recomendados(Equipo equipo) {
		int j = 0;
		for(int i = 1; i<2; i++) {
			ArrayList<Jugador> ronda = new ArrayList<Jugador>();
			for(int n = j; n<j+15; n++) {
				int relaciones = 0;
				Jugador jugador = this.mockDraft.get(n);
				if(jugador instanceof Exterior){
					Exterior ext = (Exterior) jugador;
					for(estiloExt estilo: equipo.getNecesidadExt().getEstiloExt()) {
						if(ext.getEstiloExt().contains(estilo)) {
							relaciones = relaciones + 1;
						}
					}
					if(relaciones >=2 && ronda.size() < 5) {
						ronda.add(ext);
					}	
				}else if(jugador instanceof Interior) {
					Interior inte = (Interior) jugador;
					for(estiloInt estilo: equipo.getNecesidadInt().getEstiloInt()) {
						if(inte.getEstiloInt().contains(estilo)) {
							relaciones = relaciones + 1;
						}
					}
					if(relaciones >=2 && ronda.size() < 5) {
						ronda.add(inte);
					}
				}
				this.recomendados.put("Ronda "+i, ronda);	
			}
			j = j+15;
		}
	}
	
	// Alternativa si no hay 60 jugadores (No se utiliza, hay 15 jugadores en el programa y el metodo principar se ejecuta una vez en lugar de 5)
	public void recomendadosCorta(Equipo equipo) {
		for(Jugador j: this.mockDraft) {
			ArrayList<Jugador> lista = new ArrayList<Jugador>();
			int relaciones = 0;
			if(j instanceof Exterior){
				Exterior ext = (Exterior) j;
				for(estiloExt estilo: equipo.getNecesidadExt().getEstiloExt()) {
					if(ext.getEstiloExt().contains(estilo)) {
						relaciones = relaciones + 1;
					}
				}
				if(relaciones > 3) {
					lista.add(ext);
				}	
			}else if(j instanceof Interior) {
				Interior inte = (Interior) j;
				for(estiloInt estilo: equipo.getNecesidadInt().getEstiloInt()) {
					if(inte.getEstiloInt().contains(estilo)) {
						relaciones = relaciones + 1;
					}
				}
				if(relaciones > 3) {
					lista.add(inte);
				}
			}
			this.recomendados.put("Recomendados", lista);
		}
	}
	
	
}
