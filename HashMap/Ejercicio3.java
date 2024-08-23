import java.util.HashMap;
public class Ejercicio3 {

	public static void main(String[] args) {
		 
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);

        
        Integer value = map.get("A");
        System.out.println("El valor para la clave 'A' es: " + value);
	}

}
