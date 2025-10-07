public class Kadai1 {
    public static void main(String[] args) {
        try{
            for (int i = 1; i <= 1000; i++) {
                int num = Integer.parseInt(args[0]);
                if (i % num == 0){
                    System.out.println(i);
                } else {
                    System.out.print(i);
                   System.out.print(" ");
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            ;System.out.println("エラーが発生しました、値を入力してください");
        } catch (NumberFormatException e) {
            ;System.out.println("エラーが発生しました、整数を入力してください");
        }
    }
}
