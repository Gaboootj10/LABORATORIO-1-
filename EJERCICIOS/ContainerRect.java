
public class ContainerRect {

	private Rectangulo[] rectangulos;
	private double[] distancias;
	private double[] areas;
	private int n;
	private int numRec = 0;
	
	public ContainerRect(int n) {
		this.rectangulos = new Rectangulo[n];
		this.distancias = new double[n];
		this.areas = new double[n];
		this.n = n;
	}
	
	public void addRectangulo(Rectangulo rect) {
		if (numRec >= n) {
			System.out.println("Ya no se puede guardar mas rectangulos");
		}
		rectangulos[numRec] = rect;
		distancias[numRec] = rect.getEsquina1().distancia(rect.getEsquina2());
		areas[numRec] = rect.calcularArea();
	    numRec++;
	}
	
	public String toString() {
		String resultados = "Rectangulo\tCoordenadas\t\tDistancia\tAreas\n";
		for(int i = 0; i < numRec; i++) {
			resultados += (i + 1) + "\t" + rectangulos[i] + "\t" + String.format("%.3f", distancias[i]) + "\t" + String.format("%.2f", areas[i]) + "\n";
		}
		return resultados;
	}
}
