public class Main {
    public static void main(String[] args) {

        int priceTicket = 30_000;
        int step = 20;
        int bonusMiles = priceTicket / step;

        System.out.println("Начислено бонусных миль:" + bonusMiles);
            }
}
