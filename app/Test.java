import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {
  public static void main(String[] args) {
    //ListからMapへ変換
    //Listの宣言
    List<String> list = new ArrayList<>(Arrays.asList("chocolate", "makaron", "cheesecake", "pudding", "cookie", "pancake"));
    
    System.out.println(list.toString());
    
    //Mapの宣言
    Map<String, Integer> map = list.stream().collect(Collectors.toMap(s -> s, s -> s.length()));

    System.out.println(map.toString());
  }
}