public class MethodVariabelArgument {
    public static void main(String[] args) {
        //METHOD/FUNGSI TANPA VARIABEL ARGUMENT
        int[] values = {90,90,90,90,90,100};
        sayCongrats("Aul", values);

        //METHOD/FUNGSI MENGGUNAKAN VARIABEL ARGUMENT
        sayCongrats2("Putra", 77,44,22);

    }
    //METHOD/FUNGSI TANPA VARIABEL ARGUMENT
    static void sayCongrats(String nama, int[] values){

        int total = 0;
        for (var value : values){
            total += value;
        }

        int finalvalue = total / values.length;

        if (finalvalue >=75){
            System.out.println("Selamat " + nama + " Anda Lulus!");
        }else {
            System.out.println("Maaf" + nama + " Anda Belum Lulus");
        }

    }

//    METHOD/FUNGSI MENGGUNAKAN VARIABEL ARGUMENT

    static void sayCongrats2(String nama, int... values){
    int total = 0;
    for (var value: values){
        total += value;
    }

    int finalvalue = total / values.length;
    if(finalvalue >= 75){
        System.out.println("Selamat " + nama + " Anda Lulus!");
    }else{
        System.out.println("Maaf " + nama + " Anda belum Lulus!");
    }

    }
}
