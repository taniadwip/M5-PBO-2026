public class GoodsDriver {
    public static void main(String[] args) {
        Food roti = new Food("Roti Gandum", 15000.0, 250.0);
        Toy lego = new Toy("Lego Robot", 250000.0, 7);
        Book novel = new Book("Pemrograman Java", 120000.0, "Deitel");

        System.out.println("=== DATA BARANG INVENTARIS ===");
        
        System.out.println("\n[Barang Konsumsi]");
        roti.display();

        System.out.println("\n[Mainan]");
        lego.display();

        System.out.println("\n[Buku Bacaan]");
        novel.display();

        System.out.println("\n=== PENGUJIAN POLIMORFISME INTERFACE ===");
        Taxable[] barangKenaPajak = { lego, novel };
        double totalPajak = 0;

        for (Taxable item : barangKenaPajak) {
            totalPajak += item.calculateTax();
        }
        System.out.println("Total Pajak yang Harus Disetor: Rp" + totalPajak);
    }
}
