public class LuasLingkaran {
    public static void main(String[] args) {
        /*
              Rumus Luas Lingkaran:
              pi x r x r

              Tahapan:
              1. deklarasikan variable
              2. Implementasikan rumus pada sebuah variabel
              3. Cetak variable
         */
        //Langkah 1
        double jari = 4.0;

        //Langkah 2
        double luas = Math.PI * Math.pow(jari, 2) ;

        //Langkah 3
        System.out.println("Hasil Luas Lingkaran adalah " +luas);
    }
}
