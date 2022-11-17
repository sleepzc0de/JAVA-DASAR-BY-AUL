public class BreakContinue {
    public static void main(String[] args) {
//        Contoh break pada while looping

        var counter = 1;

        while(true){
            System.out.println("Looping ke - " + counter);
            counter++;

            if(counter > 100){
                break;

            }

        }
        System.out.println("Stop brother");

//        Contoh Continue pada For Looping

        for(var angka = 1; angka <= 50 ; angka++){
            if(angka % 2 != 0){
                continue;
            }

            System.out.println("Perulangan Loop Genap :" + angka);


        }

    }
}
