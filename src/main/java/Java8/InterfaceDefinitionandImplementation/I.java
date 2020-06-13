package Java8.InterfaceDefinitionandImplementation;

public interface I {
	default void show(){
		System.out.println("From interface I");
	}

	 static void tell(){
		 System.out.println("This is from the static method tell from the interface I");
		
	}
}
