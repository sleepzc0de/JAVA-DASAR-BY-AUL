public class IFstatement {
    public static void main(String[] args) {
// IF ELSE STATEMENT
        var nilai3 = 50;
        var absen3 = 90;

        if(nilai3 >= 80 && absen3 >= 80){
            System.out.println("Selamat Anda Lulus Mendapatkan nilai A");
        }else if(nilai3 >= 70 && absen3 >= 70){
            System.out.println("Selamat Anda Lulus Mendapatkan nilai B");
        }else if(nilai3 >= 60 && absen3 >= 60){
            System.out.println("Selamat Anda Lulus Mendapatkan nilai C");
        }else if(nilai3 >= 50 && absen3 >= 50){
            System.out.println("Selamat Anda Lulus Mendapatkan nilai D");
        }else{
            System.out.println("Coba Lagi Tahun Depan");
        }


//Switch Lamda Statement java versi 14 keatas
        var nilai2 = "E";

        switch (nilai2){
            case "A" -> System.out.println("DAPAT A");
            case "B" -> System.out.println("DAPAT B");
            case "C" -> System.out.println("DAPAT C");
            case "D" -> System.out.println("DAPAT D");
            default -> {
                System.out.print("Mohon Maaf Anda ");
                System.out.println("DAPAT E");
            }
        }

//Yield switch statement java versi 14 keatas
        var nilai = "B";

       String ucapan = switch (nilai){
           case "A":
               yield "DAPAT A";
           case "B":
               yield "DAPAT B";
           case "C":
               yield "DAPAT C";
           case "D":
               yield "DAPAT D";
           default:
               yield "DAPAT E";
       };
        System.out.println(ucapan);
    }
}
