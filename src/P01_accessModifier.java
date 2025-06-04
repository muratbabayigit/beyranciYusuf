public class P01_accessModifier {
  /*
        Java’da 4 temel erişim belirleyici vardır:

    Modifier	 Aynı sınıf	 Aynı paket	   Alt sınıflar (subclass)	     Diğer paketler
 -----------    -----------   ----------    ------------------------    -------------------
    public	        ✅	        ✅	              ✅	                        ✅
    protected	    ✅	        ✅	              ✅	                        ❌
    default (yoksa)	✅	        ✅	              ❌	                        ❌
    private	        ✅	        ❌	              ❌	                        ❌
   */

   private int privSayi=20;
   protected int protectedSayi=15;
   public int sayi=25;


    public static void main(String[] args) {
        P01_accessModifier obj=new P01_accessModifier();
        System.out.println(obj.privSayi);
        System.out.println(obj.sayi);
        System.out.println(obj.protectedSayi);
    }


}
