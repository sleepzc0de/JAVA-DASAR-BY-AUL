public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        String nama = null;
        Integer usia = null;
        Long nomorkendaraan = null;
        Boolean iniBoolear = null;
        Short iniShorty = null;

        int iniInt = 100;
        Integer iniInt2 = iniInt;

        short inishort = iniInt2.shortValue();

        System.out.println(nama);
        System.out.println(usia);
        System.out.println(nomorkendaraan);
        System.out.println(iniBoolear);
        System.out.println(iniShorty);
        System.out.println(iniInt2);
    }
}
