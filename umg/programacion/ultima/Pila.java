package gt.umg.programacion.ultima;

public class Pila {

	private Nodo cima;
	Pila(){
		cima = null;
	}
	
	public boolean pilaVacia() {
		if (cima == null) {
			return true;
		}else {
			return false;
		}
	}
	
	public void insertar(Venta dato) {
		
		Nodo nuevo = new Nodo(dato);
		nuevo.siguiente = cima;
		cima = nuevo;
	}
	
}
