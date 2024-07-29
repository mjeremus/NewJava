class variables {
    public static void main(String[] args) {
        String firstName = "Jan";
        String lastName = "Kowalski";
        final String pesel = "12312312312";
        int age = 25;
        double height = 179.5;

        System.out.print("Cześć ");
        System.out.println(firstName + " " + lastName);

        System.out.println("Poniżej jest kilka informacji o Tobie:");
        System.out.println("Twój PESEL to: " + pesel);
        System.out.println("Masz " + age + " lat");
        System.out.print("Twój wzrost to: " + height + "cm");
    }
}