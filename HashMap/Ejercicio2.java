import java.util.HashMap;
public class Ejercicio2 {

	public static void main(String[] args) {
	
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Red", 1);
        map.put("Blue", 2);

        System.out.println("Valores en el HashMap:");
        for (Integer value : map.values()) {
            System.out.println(value);
        }
	}

}
