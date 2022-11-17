public class TernaryOperator {
    public static void main(String[] args) {

//      TANPA TERNARY OPERATOR

        var nilai = 72;
        String ucapan;

        if(nilai>=75){
            ucapan = "Selamat Anda LULUS";
        }else{
            ucapan = "Mohon maaf Anda BELUM LULUS";
        }

        System.out.println(ucapan);

//        MENGGUNAKAN TERNARY OPERATOR

        var nilai2 = 80;
        String ucapan2 = nilai2 >= 75 ? "Selamat Anda LULUS" : "Mohon Maaf Anda Belum Lulus";

        System.out.println(ucapan2);


    }
}
