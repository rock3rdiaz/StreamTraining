import java.util.List;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		List<Integer> numbers = DataLists.getNumberList();
		List<Estudiante> students = DataLists.getEmployeeList();
		
		StringBuilder sb = new StringBuilder("listado inicial ");
		System.out.println(sb.append(numbers).toString());
		
		ordenar(numbers);
		pares(numbers);
		impares(numbers);
		sumaCuadrados(numbers);
		diferentes(numbers);
		operarSobreElementos(numbers);
		primerElemento(numbers);
		crearDiccionario(numbers);
		
		promedioCalificacionEstudiantes(students);
		masJoven(students);
		masViejo(students);
		edadYPromedioOrdenado(students);
		soloPromedios(students);
	}
	
	public static void ordenar(List<Integer> numbers) {
		StringBuilder sb = new StringBuilder("listado ordenado ");
		List<Integer> ordered = ConJava8.ordenar(numbers);
		System.out.println(sb.append(ordered).toString());
	}
	
	public static void pares(List<Integer> numbers) {
		StringBuilder sb = new StringBuilder("listado pares ");
		List<Integer> ordered = ConJava8.soloPares(numbers);
		System.out.println(sb.append(ordered).toString());
	}
	
	public static void diferentes(List<Integer> numbers) {
		StringBuilder sb = new StringBuilder("listado sin repeticion ");
		List<Integer> list = ConJava8.diferentes(numbers);
		System.out.println(sb.append(list).toString());
	}
	
	public static void impares(List<Integer> numbers) {
		StringBuilder sb = new StringBuilder("listado impares ");
		List<Integer> ordered = ConJava8.soloImpares(numbers);
		System.out.println(sb.append(ordered).toString());
	}
	
	public static void sumaCuadrados(List<Integer> numbers) {
		StringBuilder sb = new StringBuilder("La suma es ");
		int sum = ConJava8.lambda(numbers);
		System.out.println(sb.append(sum).toString());
	}
	
	public static void operarSobreElementos(List<Integer> numbers) {
		StringBuilder sb = new StringBuilder("La nueva lista es ");
		List<Integer> list = ConJava8.map(numbers);
		System.out.println(sb.append(list).toString());
	}
	
	public static void primerElemento(List<Integer> numbers) {
		StringBuilder sb = new StringBuilder("El primer elemento es ");
		Integer first = ConJava8.findFirst(numbers);
		System.out.println(sb.append(first).toString());
	}
	
	public static void crearDiccionario(List<Integer> numbers) {
		StringBuilder sb = new StringBuilder("El diccionario es ");
		Map<Integer, Integer> diccionario = ConJava8.toMap(numbers);
		System.out.println(sb.append(diccionario).toString());
	}
	
	public static void promedioCalificacionEstudiantes(List<Estudiante> students) {
		StringBuilder sb = new StringBuilder("El promedio de calificacion de los estudiantes es ");
		float promedio = ConJava8.promedioCalificacion(students);
		System.out.println(sb.append(promedio).toString());
	}
	
	public static void masJoven(List<Estudiante> students) {
		StringBuilder sb = new StringBuilder("El estudiante mas joven es ");
		Estudiante joven = ConJava8.min(students);
		System.out.println(sb.append(joven).toString());
	}
	
	public static void masViejo(List<Estudiante> students) {
		StringBuilder sb = new StringBuilder("El estudiante mas viejo es ");
		Estudiante viejo = ConJava8.max(students);
		System.out.println(sb.append(viejo).toString());
	}
	
	public static void edadYPromedioOrdenado(List<Estudiante> students) {
		StringBuilder sb = new StringBuilder("Los estudiantes encontrados son ");
		List<Estudiante> list = ConJava8.findByAgeAndPromedioOrdered(students);
		System.out.println(sb.append(list).toString());
	}
	
	public static void soloPromedios(List<Estudiante> students) {
		StringBuilder sb = new StringBuilder("Los promedios de los estudiantes son ");
		List<Float> list = ConJava8.soloPromedios(students);
		System.out.println(sb.append(list).toString());
	}
}
