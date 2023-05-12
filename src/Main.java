public class Main {
    public static void main(String[] args) {
        boolean flag;
        for(int i = 1; i <= 100; i++) {
            flag = false;

            if (i == 1 || i == 2) {
                flag = true;
            } else {
                for (int j = 2; j < i; j++){
                    flag = true;
                    if(i % j == 0){
                        flag = false;
                        break;
                    }
                }
            }

            if(flag){
                System.out.printf("%d, ", i);
            }
        }
    }
}