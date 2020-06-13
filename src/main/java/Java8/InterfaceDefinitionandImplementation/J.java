package Java8.InterfaceDefinitionandImplementation;

public interface J {
	
	default void show(){
		System.out.println("From interface J");
	}

}
