package technicalQ;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {

	public static void main(String[] args) {

		// filter(predicate)
		// predicate-----boolean value function
		// e->e>10

		// map(function)

		List<String> names = List.of("Aman", "Aniket", "Durgesh", "koushik", "Anis");
		List<String> newNames = names.stream().filter(e -> e.startsWith("A")).collect(Collectors.toList());
		System.out.println(newNames);

	}

}
