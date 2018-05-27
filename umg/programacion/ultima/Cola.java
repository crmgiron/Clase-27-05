package gt.umg.programacion.ultima;

public class Cola {

	private Nodo raiz,cima;
	public Cola() {
		raiz = null;
		cima = null;
	}
	public boolean colaVacia() {
		if (raiz == null) {
			return true;
		}else {
			return false;
		}
	}
	public void insertar(Venta dato) {
		Nodo nuevo = new Nodo(dato);
		nuevo.siguiente = null;
		if (colaVacia()) {
			raiz = nuevo;
			cima = nuevo;
		}else {
			cima.siguiente = nuevo;
			cima = nuevo;
		}
	}
	public Venta quitar() {
		if (colaVacia()) {
			System.out.println("Cola Vacia");
			return null;
		}
		Venta aux = raiz.dato;
		if (raiz == cima) {
			raiz = null;
			cima = null;
		}else {
			raiz = raiz.siguiente;
		}
		System.out.println("Eliminado: "+aux);
		return aux;
	}

	public void listar() {
		Nodo t = raiz;
		while(t != null) {
			System.out.println("Placa: "+t.dato.getPlaca());
			System.out.println("Galones: "+ t.dato.getCantidad());
			if (t.dato.getTipoGas() == 1) {
				System.out.println("Combustible: Super");
			}else if(t.dato.getTipoGas()== 2) {
				System.out.println("Combustible: Regular");
			}else if(t.dato.getTipoGas() == 3) {
				System.out.println("Combustible: Diesel");
			}else {
				System.out.println("Combustible: N/A");
				}

			System.out.println("\n");
			System.out.println("\n");
			t = t.siguiente;
		}
	}
}

