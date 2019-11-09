import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Test {
    public static void main(String[] args) {
        System.out.println("数当てゲーム");
        int ans = new java.util.Random().nextInt(10);
        System.out.println("ヒント: "+ ans);
        for(int i = 0;i < 5;i++){
          System.out.println("0〜9の数字を入力してください");
          int num = new java.util.Scanner(System.in).nextInt();
          if(num == ans && num <= 9){
            System.out.println("アタリ!");
          }else if(num != ans && num <= 9){
            System.out.println("違います。");
          }
          else {
            System.out.println("指定の数値(0~9)を入力して下さい");
          }
        }
        System.out.println("ゲームを終了します");
      }
    }