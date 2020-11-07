/*
Bu aşamda gelip diğer verilerimizi bir hazırlayalım ilk aşamada böylece artık herşey hazır olsun diğer verilerden kastım nedir : landmarkNames , var ama birde countrName koyduk ülke adlarını.
Görselleri olucak dedik O yüzden MainActivity.java içerisine girip şöyle yapalım.
//Data , //ListView ekliyeceğim buralarda şu amaçla ekliyeceğim //Data : Datalarla çalıştığımı belirtmek için , //ListView list view ile ilgili işlemleri yapıyoruz bunu hatırlamak ve pratik olması açısından ayırayim.
Şimdi bu data notumun altında. landmarkNames.add("London Bridge"); altında hemen bir tane daha ArrayList oluşturacağım.
        //Data Kod zamanı
        1) ArrayList<String> countryNames = new ArrayList<>();                    //İçerisindeki şey string. Diyorum burda gelip country namesin içinede eklemeler yapıcağım. Ama şuna dikkat etmemiz gerekiyor. Birebir aynı hizada birebir aynı indexte ekleme yapmamız gerekiyor dolayısıyla.
        2) countryNames.add("Italy");      //Ne demek istiyorum şöyle diyim 1'e pisayı eklediğimizden 0.index bize Pisayı verdiğinden burdada 0.index Pisanın ülkesi neyse onu vermeli dolasıyla içerisine Italy yazıcağım mesela.
    Bu şekilde aynı sırada gidersek karışıklık yaşamayıcağız eğerki karıştırırsak o zaman işte tamamen farklı datalarla muhattap olmak zorunda kalırız demek oluyor countryNames'e  o yüzden aynı şekilde devam ediyorum.
        3)countryNames.add("France");
        4)countryNames.add("Italy");
        5)countryNames.add("United Kingdom"); şeklinde yazayim ve böylece görülceği üzere yukardaki landmarkNames'le aynı şekilde sıralama oluşturdum soru cevap mantığı yani. Daha sonra aynı şeyi görseller içinde yapıcağım ama
    Görselleri nasıl koyucağız daha tam bilmiyoruz ve herşeyden önce görselimiz bile yok o yüzden landmarkbook'umuz için googleden görsel bulalım.
Dikkat etmemiz gereken şey android'in büyük görsellere karşı bir alerjisi olduğunu hatırlıyalım ve büyük görseller bulursak uygulamalarız cökebilir bile kimi zaman o yüzden bunu hatırlamakta fayda var o yüzden resimlerimiz büyük olmamasına dikkat etmekte fayda var.
Gerçekten uygulama yapıyorsak eğer telif hakkı olmuyan fotoğrafları kullanmamız tavsiye ediyorum yüklüceğimiz resimler'in başı büyük harfle başlıyamaz içerisinde rakam vs dikkat etmemiz lazım.
keza özel karakter olamaz bunları kopyalayıp drawble'imize yapıştıralım v24'E değil normal drawbleye.drawble altında resimlerimizi açıp bir göz geçirmemizde fayda var.Sıkıntısı varmı yokmu diye benimkinde gözüken yok.
Şimdi bunlarıda bir listeye koyucağız fakat bunları nasıl bir listeye koyucağımız henüz daha bilmiyoruz çünkü ArrayList<String> integer koyabiliriz vs demiştik.
Birdaki notumda <> burda ne koyucağız onu göstericeğim.
Bunun içinde "GörselDizileriNot" şeklinde devam ediceğim.

 */