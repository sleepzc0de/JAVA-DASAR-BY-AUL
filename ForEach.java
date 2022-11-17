public class ForEach {
    public static void main(String[] args) {
//        TANPA FOREACH UNTUK AKSES ARRAY

        String[] array=
            {"Aul","Putra","Azhari"
                    ,"Fitri", "Lestari"};

        for (int i = 0 ; i < array.length ;i++){
            System.out.println(array[i]);
        }

//        MENGGUNAKAN FOREACH UNTUK AKSES ARRAY

        String[] array2 = {"\nAul","Putra","Azhari"
                ,"Fitri", "Lestari"};

        for (var values : array2){
            System.out.println(values);
        }

        int[] nilairaport = {90,90,90};

        int total = 0;
        for (var nilai : nilairaport){
            total = total + nilai;
        }
        System.out.println(nilairaport.length);
        System.out.println(total);
    }
}
