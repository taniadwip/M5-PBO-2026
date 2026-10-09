public class AnimalDriver {
    public static void main(String[] args) {
        // Membuat objek dari masing-masing subclass
        Animal dog = new Dog("Chiko", "Eropa", 4);
        Animal chicken = new Chicken("Rembong", "Asia Tenggara", 2);
        Animal lion = new Lion("Simba", "Afrika", 4);

        Animal[] zoo = { dog, chicken, lion };

        System.out.println("=== PENGUJIAN HIERARKI ANIMAL ===");
        for (Animal animal : zoo) {
            System.out.println("Nama        : " + animal.getNama());
            System.out.println("Asal        : " + animal.getAsal());
            System.out.println("Jumlah Kaki : " + animal.getJumlahKaki());
            System.out.print("Kebiasaan   : ");
            animal.toEat();
            System.out.print("Suara Khas  : ");
            animal.toShout();
            System.out.println("---------------------------------");
        }
    }
}