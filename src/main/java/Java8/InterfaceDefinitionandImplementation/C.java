package Java8.InterfaceDefinitionandImplementation;

/*interface I and J both have the method show and class A has the same method as well however the class has 
higer priority then the interface

The second I.tell is about using the static methods inside the interface which need not require any object creation 
just the Interface.StaticMethod is required*/
public class C extends A implements I,J {

	public static void main(String[] args) {
		C c = new C();
		c.show();
		I.tell();
	}

}
