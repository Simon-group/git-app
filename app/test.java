public class test{
  public static void main(String[] args){
    // 変数nameに、好きな名前を代入してください
    int number = 12;
    
    // switch文を用いて、numberを3で割った余りで条件分岐をしてください
    switch (number % 5) {
      case 0:
        System.out.println("大吉です");
        break;
      case 1:
        System.out.println("中吉です");
        break;
      case 4:
        System.out.println("凶です");
        break;
      default:
        System.out.println("吉です");
    }
  }
}