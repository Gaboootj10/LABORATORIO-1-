import java.util.*;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Cuantos rectangulos maximo hara?: ");
		int maxRect = sc.nextInt();
		ContainerRect contenedor = new ContainerRect(maxRect);
		
		System.out.print("Cuantos rectangulos desea crear?: ");
		int numRect = sc.nextInt();

		for (int i = 0; i < numRect; i++) {
			System.out.print("Ingrese una esquina del rectángulo " + (i+1) + ": ");
			double x1 = sc.nextDouble();
			double y1 = sc.nextDouble();
			System.out.print("Ingrese la esquina opuesta del rectángulo "+ (i+1) + ": ");
			double x2 = sc.nextDouble();
			double y2 = sc.nextDouble();
			Rectangulo nuevoRect = new Rectangulo(new Coordenada(x1,y1), new Coordenada(x2,y2));
			contenedor.addRectangulo(nuevoRect);
		}
		System.out.println("Contenedor de Rectangulos:");
		System.out.println(contenedor);
		
	}
}
