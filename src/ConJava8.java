import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public abstract class ConJava8 {

	public static int lambda(List<Integer> input) {
		int sum = 0;

		Matematicas m = new Matematicas() {

			@Override
			public int alCuadrado(int valor) {
				return valor * valor;
			}
		};

		for (Integer integer : input) {
			sum += m.alCuadrado(integer);
		}
		
		return sum;
	}

	public static List<Integer> ordenar(List<Integer> input) {
		return input.stream().sorted((e1, e2) -> e1.compareTo(e2)).collect(Collectors.toList());
	}

	public static List<Integer> soloPares(List<Integer> input) {
		return input.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
	}
	
	public static List<Integer> diferentes(List<Integer> input) {
		return input.stream().distinct().collect(Collectors.toList());
	}

	public static List<Integer> soloImpares(List<Integer> input) {
		return input.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
	}
	
	public static List<Integer> map(List<Integer> input) {
		return input.stream().map(e -> e * e).collect(Collectors.toList());
	}
	
	public static Integer findFirst(List<Integer> input) {
		return input.stream().findFirst().get();
	}
	
	public static Map<Integer, Integer> toMap(List<Integer> input) {
		return input.stream().collect(Collectors.toMap(i -> new Random().nextInt(), i -> i));
	}
	
	public static float promedioCalificacion(List<Estudiante> input) {
		return (float) input.stream().mapToDouble(Estudiante::getPromedio).average().orElse(Float.NaN);
	} 
	
	public static Estudiante min(List<Estudiante> input) {
		return input.stream().min(Comparator.comparing(Estudiante::getEdad)).get();
	}
	
	public static Estudiante max(List<Estudiante> input) {
		return input.stream().max(Comparator.comparing(Estudiante::getEdad)).get();
	}
	
	public static List<Estudiante> findByAgeAndPromedioOrdered(List<Estudiante> input) {
		return input.stream().filter(i -> i.getEdad() > 18).
				filter(i -> i.getPromedio() > 3.0).
				sorted((e1, e2) -> e1.getApellido().
						compareTo(e2.getApellido())).collect(Collectors.toList());
	}
	
	public static List<Float> soloPromedios(List<Estudiante> input) {
		return input.stream().map(Estudiante::getPromedio).collect(Collectors.toList());
	}
	
	public static void crearStream() {
		Stream.of(1, 2, 3, 4, 5, 6, 7, 11)
	      .filter(i -> i % 2 == 0)
	      .forEach(System.out::println);
		
	}
	
	public interface Matematicas {
		int alCuadrado(int valor);
	}
}
