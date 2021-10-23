public class Main {
    public static void main(String[] args){
        int initialAccount = 500;
        int replenishment = 100;
        int endAccount = initialAccount+ replenishment;
        if (endAccount >= 1100) {
            int bonusRubles = 1100+11;
            System.out.println(bonusRubles);
        }
        System.out.println(endAccount);
    }
}