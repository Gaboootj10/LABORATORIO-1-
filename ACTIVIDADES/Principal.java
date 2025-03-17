import java.util.*;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese una esquina del 1er rectángulo: ");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		System.out.print("Ingrese la esquina opuesta del 1er rectángulo: ");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		System.out.print("Ingrese una esquina del 2do rectángulo: ");
		double x3 = sc.nextDouble();
		double y3 = sc.nextDouble();
		System.out.print("Ingrese la esquina opuesta del 2do rectángulo: ");
		double x4 = sc.nextDouble();
		double y4 = sc.nextDouble();
		Rectangulo RectanguloA = new Rectangulo(new Coordenada(x1,y1), new Coordenada(x2,y2));
		Rectangulo RectanguloB = new Rectangulo(new Coordenada(x3,y3), new Coordenada(x4,y4));
		mostrarRectangulo(RectanguloA, "A");
        mostrarRectangulo(RectanguloB, "B");
		
		if (Verificador.esSobrePos(RectanguloA, RectanguloB)) {
            System.out.println("Rectángulos A y B se sobreponen");
            Rectangulo sobreposicion = rectanguloSobre(RectanguloA, RectanguloB);
            System.out.println("Área de sobreposición = " + sobreposicion.calcularArea());
        }else if (Verificador.esJunto(RectanguloA, RectanguloB)) {
            System.out.println("Rectángulos A y B están juntos");
        }else {
            System.out.println("Rectángulos A y B son disjuntos");
        }
	}

	public static void mostrarRectangulo(Rectangulo rect, String nombre) {
        System.out.println("Rectángulo " + nombre + "= (" + rect + ")");
    }
	
	public static Rectangulo rectanguloSobre(Rectangulo a, Rectangulo b) {
		double x1 = Math.max(a.getEsquina1().getX(), b.getEsquina1().getX());
        double y1 = Math.max(a.getEsquina1().getY(), b.getEsquina1().getY());
        double x2 = Math.min(a.getEsquina2().getX(), b.getEsquina2().getX());
        double y2 = Math.min(a.getEsquina2().getY(), b.getEsquina2().getY());
        return new Rectangulo(new Coordenada(x1, y1), new Coordenada(x2, y2));
	}
}
