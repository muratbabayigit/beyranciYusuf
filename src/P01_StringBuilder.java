public class P01_StringBuilder {


    public static void main(String[] args) {
        // String isim="Murat"; //isim variable'ı bir immutable variable olur
        StringBuilder isim=new StringBuilder("Murat");
        System.out.println(isim);


        //StringBuilder methodları

        //append: sonuna ekleme yapar

        isim.append(" Babayiğit");
        isim.append(" - Instructor");
        System.out.println(isim);

        //toString : notmal stringe çevirir
        System.out.println(isim.toString());

        isim.insert(15,".");
        System.out.println(isim);

        isim.replace(19,29,"Fizikçi");
        System.out.println(isim);

        isim.delete(15,16);
        System.out.println(isim);

        isim.reverse();
        System.out.println(isim);
        isim.reverse();
        System.out.println(isim);

        StringBuilder soyisim=new StringBuilder(7);
        soyisim.append("Eda");
        System.out.println(soyisim.capacity());
        soyisim.append(" Salman");
        System.out.println(soyisim.capacity());//16
        System.out.println(soyisim.length()); //10

        soyisim.setCharAt(4,'Y');
        System.out.println(soyisim);


    }
/*
        📌 Özet tablo
            Metot	            Görevi
         -------------        -------------------------------
            append()	        Sona ekleme
            insert()	        Belirli konuma ekleme
            replace()	        Belirli aralığı değiştirme
            delete()	        Aralık silme
            deleteCharAt()	    Tek karakter silme
            reverse()	        Ters çevirme
            toString()	        String’e dönüştürme
            capacity()	        Kapasiteyi öğrenme
            length()	        Uzunluğu öğrenme
            setCharAt()	        Tek bir karakteri değiştirme


 */

}
