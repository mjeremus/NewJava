public class OperatorsV1 {
    public static void main(String[] args) {
        int x = 3;
        int y = 20;

        boolean result = x > y;
        System.out.println("Czy x jest większe od y? ");
        System.out.println("x > y = " + result);

        result = x * 2 > y;
        System.out.print("Czy x pomnożone przez 2 jest większe od y? ");
        System.out.println("x > y = " + result);

        result = (y < x+3) && (y > x-2);
        System.out.println("Czy y jest mniejsze od sumy x+3 i jednocześnie większe od x pomniejszonego o 2? ");

        result = ((x * y) % 2 == 0);
        System.out.print("Czy iloczyn liczb x i y jest parzysty? " + result);
    }
}
