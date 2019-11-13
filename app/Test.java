import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
  public static void main(String[] args) {
    //Listの宣言
    List<Integer> list = new ArrayList<>();
    
    list.add(1);
    list.add(2);
    list.add(3);
    
    //Mapの宣言
    Map<Integer, String> map = new HashMap<>();
    
    for(Integer num : list) {
        // MapにListのキーと値を追加
        map.put(num, "apple");
    }
    
    System.out.println(map); 
  }
}