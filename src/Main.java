public class Main {

    public static void main(String[] args) {
        Perpustakaan perpus = new Perpustakaan();
        perpus.tambahBuku(new Buku("Java untuk Pemula", "Air Rahun"));
        perpus.tambahBuku(new Buku("Java untuk Pemula", "Air Rahun"));
        perpus.tambahBuku(new Buku("Java untuk Ahli", "Altenhoff"));
        perpus.tambahBuku(new Buku("Target Belajar JAVA", "Ford"));
        perpus.tambahBuku(new Buku("Java Platform Enterprise", "Bakrie Salian"));
        perpus.tambahBuku(new Buku("Belajar JAVA Baru", "Nasir Karim Salaf"));

        String cari = "Pemula";
        System.out.println("Cari buku dengan kata kunci : " + cari);
        Buku buku = perpus.cariBuku(cari);

        if (buku == null) {
            System.out.println("Buku tidak ditemukan");
        } else {
            System.out.println("Buku ditemukan dengan judul: " 
                + buku.getJudul() + ", pengarang: " + buku.getPengarang());
        }

       
        perpus.hapusBuku(0);
        System.out.println("jumlah buku : " + perpus.jumlahBuku());
    }
}
