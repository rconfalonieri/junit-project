import java.util.ArrayList;

public class MiCola {
	
	ArrayList<String> miCola;
	int dimension;
	
	public MiCola(int dim) {
		
		dimension = dim;
		miCola = new ArrayList<String>(dim);
		
	}
	
	
	public void insertMensaje(String mensaje) {
		
		if (miCola.size()==dimension) {
			miCola.remove(0);
		}
		miCola.add(mensaje);
		
	}
	
	public int getNumeroElementos() {
		return miCola.size();
	}
	
	public ArrayList<String> getListaElementos() {
		
		return miCola;
	}

}
