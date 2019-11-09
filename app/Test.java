import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Test {
    public static void main(String[] args) {
        try {
            // FileWriterクラスのオブジェクトを生成する
            FileWriter file = new FileWriter("java.txt");
            // PrintWriterクラスのオブジェクトを生成する
            PrintWriter pw = new PrintWriter(new BufferedWriter(file));
            
            //ファイルに書き込む
            pw.println("apple");
            pw.println("orange");
            pw.println("melon");
            
            //ファイルを閉じる
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}