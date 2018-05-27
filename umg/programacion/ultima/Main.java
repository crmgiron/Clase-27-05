package gt.umg.programacion.ultima;

import java.util.Scanner;
public class Main {

	static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main iniciar = new Main();
		iniciar.gasolinera();
	}
	public void gasolinera() {
		int opc;
		Cola c = new Cola();
		Venta v = new Venta();
		do {
			System.out.println("Sistema de control de Gasolineras");
			System.out.println("0. Salir");
			System.out.println("1. Venta de gasolina");
			System.out.println("2. Listar registros");
			System.out.println("3. Eliminar registro");
			opc = sc.nextInt();
			sc.nextLine();
			switch(opc) {
			case 1:
				String placa;
				float gasolina;
				int tipo;
				System.out.println("No. de placa: ");
				placa = sc.nextLine();
				v.setPlaca(placa);
				System.out.println("Galones de gasolina: ");
				gasolina = sc.nextFloat();
				v.setCantidad(gasolina);
				System.out.println("Tipo de gasolina: \n");
				System.out.println("1. Super");
				System.out.println("2. Regular");
				System.out.println("3. Diesel");
				tipo = sc.nextInt();
				v.setTipoGas(tipo);
				c.insertar(v);
				break;
			case 2:
				c.listar();
			}
		}while(opc!= 0);
	}
}
