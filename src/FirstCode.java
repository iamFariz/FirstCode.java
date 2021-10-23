public class FirstCode {
    public static void main(String[] args) {
        // Contoh Deklarasi Variabel dan Tipe Data
        int angkaInt1 = 10;
        int angkaInt2 = 30;
        float angkaFlt1 = 20f;
        float angkaFlt2 = 40f;
        double angkaDbl1 = 60;
        double angkaDbl2 = 80;

        System.out.println("Angka Integer : \n " + angkaInt1 + "\n " + angkaInt2);
        System.out.println("Angka Float : \n " + angkaFlt1 + "\n " + angkaFlt2);
        System.out.println("angka Double : \n " + angkaDbl1 + "\n " + angkaDbl2);

        String Kalimat1 = "Learning how to code Java";
        char Karakter1 = 'C';
        char[] Karakter2 = {'H','A','R','B','E','R'};
        String Kalimat2 = new String(Karakter2);

        //Cetak Karakter2
        System.out.println("Mencetak isi dari Karakter2 : ");
        for (int index=0; index < Karakter2.length; index++){
            System.out.println("Karakter ke " + index + "Adalah : " + Karakter2[index] );
       }
    }
}
