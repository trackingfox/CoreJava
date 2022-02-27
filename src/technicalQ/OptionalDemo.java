package technicalQ;

import java.util.Arrays;
import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		
		Customer customer = new Customer (id:101, name:"john", email:null, Arrays.asList("3553153813","53787385"));
		
		//empty
		//of
		//ofNullable
		
		Optional<Object> emptyOptional = Optional.empty();
		System.out.println(emptyOptional);
		
		Optional<String> emailOptional = Optional.of(customer.getEmail());
		System.out.println(emailOptional);
		
		Optional<String> emailOptional2 =  Optional.ofNullable(customer.getEmail());
		System.out.println(emailOptional2);
		
	}

}
