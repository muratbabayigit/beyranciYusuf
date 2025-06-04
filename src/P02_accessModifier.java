

public class P02_accessModifier  extends P01_accessModifier {

    public static void main(String[] args){
       P01_accessModifier nsn=new P01_accessModifier();
        System.out.println(nsn.protectedSayi);
        System.out.println(nsn.sayi);

        P02_accessModifier obj=new P02_accessModifier();

        System.out.println(obj.protectedSayi);
        obj.protectedSayi=125;
        System.out.println(obj.protectedSayi);


        obj.privSayi
    }


}
