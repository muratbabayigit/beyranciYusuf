public class P01_Varargs {

    public static void main(String[] args) {
        topla(12,21,36,45);

    }

    private static void topla(int... sayilar) {
        int toplam=0;
        for (int each:sayilar) {
            toplam+=each;
        }
        System.out.println("toplam = " + toplam);
    }

/*     Varargs'da dikkat edilecek hususlar
        1- varargs parametresi en sonda olmalıdır
            public static void topla(String isim, int age, int... sayilar) ---> Doğru
            public static void topla(String isim, int... sayilar, int age ) ---> Yanlış
            public static void topla(int... sayilar, String isim,  int age ) ---> Yanlış

        2-bir metodda sadece 1 tane varargs parametresi olur
            public static void topla(String isim, int age, int... sayilar) ---> Doğru
            public static void topla(String isim, int... sayilar, int... ages ) ---> Yanlış

 */
}
