import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
  public static void main(String[] args) {
    Map map = new HashMap(); 
    map.put("Samurai", "Engineer");
    map.put("Soldier", "Warrior");
    
    System.out.println(map.toString());
    
    // 1. values()でマップの全値を取得する
    List listValues = new ArrayList(map.values());
    
    // 2. keySet()でマップのキー値をすべて取得する
    List listKeys = new ArrayList(map.keySet());

    System.out.println(listValues.toString());
    System.out.println(listKeys.toString());
  }
}