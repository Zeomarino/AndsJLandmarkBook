/*
Merhaba şimdi bu görseli aktarmak için daha güzel daha bir yapısal yöntem görücek demiştik staticten sonra onu görüceğiz.
Singleton dediğimiz bir sınıf oluşturucağız aslında bunun için
Singleton nedir : Tek bir objeye , tek bir instanceye sahip sınıf demektir bunu daha önce görmedik evvela bunun ne olduğunu konuşalım.
Öncelikle 1 adet JavaClass oluşturalım önce normal bir sınıf yazıcağız daha sonra bunu singleton'a çeviriceğiz  JC ismimize Singleton Diyorum. Class olarak seciceğim.
Singeleton.javaya girdiğimizde public class Singleton { şeklinde otomatik bir oluşturulma olduğunu görebiliriz.Gelelim bu class'ımızın içerisine.
Normalde biz ne yapıyorduk Bu sınıfımızda ne gibi değişkenler ne gibi property'ler olucak ne gibi özellikler olucak bunu yazıyorduk sonra bir constractır hatta getter ve setter oluşturuyorduk
Bunları bir yapalım herşeyden önce "Singleton.java" içerisinde yapıcağım bu işlemi.
Normalde nasıl yaparız . Classımızın altına "public Singleton() { deriz }" ve bu nedir Constractırımızdır bir obje oluşturulduğunda bu sınıftan cağırılcak ilk methoddur
Diyelimki bu singletonumuzda 1 tane bitmap var.
  Kod Zamanı 1 )
  1) public class altına "Bitmap chosenImage;" dedim. Normalde ne yaparız "Public Singleton(){ } " "()" içerisinde bir tane görsel isteriz ve bu sınıfı oluşturdumda bir objeyi oluşturduğumda bu istediğimiz görseli buraya eşitleriz
Ve ondan sonra getter ve setter ile bu görseli alabilir ve değiştirebilriz ne demek istiyorum : Bunu Generate ilede yapabiliriz misal Ands üzerinde Code sekmesinde üstte içerisinde
Code/generate tıklarsak eğer Constructor Getter Setter Getter and Setter hepsi çıkar Biz burda getter and setteri yapmak istiyorum diyelim.
  2) Daha önce bahsettiğim public Singleton() { } ChosenImagenin altına yazalım.
  Daha sonra Code/Generate aracılıgıyla
  3)Getter Ands Setter'i ekliyelim eklediğimizde "chosenImage:Bitmap" seçeneği cıkıyor zaten.
Kodlarımız şu aşamada şu şekli almaktadır (Singleton.java) içerisindeyim.
 "
            public class Singleton {
            Bitmap chosenImage;
              public Singleton () {


      }

       public Bitmap getChosenImage() {
        return chosenImage;
    }

    public void setChosenImage(Bitmap chosenImage) {
        this.chosenImage = chosenImage;
    }
}"
Herneyse konumuza dönelim Nedir burdaki "public Bitmap getChosenImage() {" misal public Bitmap diyor getChoseImage ChosenImageyi getir diyor return cohsen ımage ilede chosenImagemizi bize veriyor.
setChosenImagemizdede bir tane görsel istiyor ve bu seçilen görseli bu yukardakine eşitliyor yani biz şuanda gelip "MainActivity.java" içerisinde intent'i başlatmadan önce.
"startActivity(intent) öncesinde" yazıcağım. Şimdi dikkat edilmesi gereken bir husus var.
"selectedImage = landmarkImages.get(position);"'i yorum haline getirdim. çakışma vs olmasın diye Dediğim sebeplerden ötürü zaten static ve Singleton aynı işlevi yapan şeyler ama singleton daha güvenilir olduğunu dile getirmiştim dolasıyla bunu kullanmak istediğimden bunları de aktif etmem gerek.
"static Bitmap selectedImage;" yorum haline getirdim. Hatta bunu yapınca DetailActivity.java hata vericek çünkü "imageView.setImageBitmap(selectedImage);" bulamıcak dolayısıyla bunuda yorum haline getireceğim.
Daha sonra "import static com.example.landmarkbook.MainActivity.selectedImage;" import ettiğimiz staticte hata vericek bunu silebilirim veya yorum haline getirebilirim.
Sonra gelelim mainActivity'me şimdi gelip ben startActivity(intent); üstüne yorum haline getirdigimiz selectedImagenin altına.
    4)Singleton singleton = new Singleton();
dersem şu şekilde bir obje oluşturup
    5) singleton.setChosenImage(landmarkImages.get(position)); diyerek gerçektende burdaki Singleton.objeme landmarkImages görselini atıyabilirim isimler farklı olabilir...
Fakat gelip DetailActivity'me yorum haline getirdiğimiz imageView üstüne yazıcağım.
    6) Singleton singleton = new Singleton(); dersek eğer bana aynı objeyi değil tamamen farklı yeni bir obje oluşturucaktır Yani şuan singleton class'ından oluşturulmuş 2 tane obje var
1.MainActiviyde yazdığım 2.DetailActivityde yazdığımız  1.sinde görselim gerçektende landmarkImages
MainActivity'de gelip misal "chosenImagemizin altında" "singleton.getChosenImage();" dersem bana bir bitmap verir ve bu seçilen bir görsel olur
Fakat DetailActivity içerisine dönüp
NewSingletonumuzun altına.
singleton.getChosenImage() dersem eğer bize null vericektir çünkü şuanda daha öyle birşey yapmadım.Daha öyle bir görsel ataması yapmadım bu tamamen ayrı bir obje 2 farklı sınıf yani.
Hatta denemek istersek eğer " imageView.setImageBitmap(singleton.getChosenImage());" dediğimizde DetailActivity.javada
Şu şekilde olucak denemek isterseniz. CountryNameText.setText altına yazdım.DetailActivity.javada
"Singleton singleton = new Singleton();
        imageView.setImageBitmap(singleton.getChosenImage());"
Şu aşamada emuyu çalıştırsak eğer herşey düzgünmüş gibi tabi yukardaki gibi yaptığınız taktirde.
Pisaya tıklarsam eğer emumda app'imde yani. Ve görseli göremeyiz boş bir beyaz ekran olur
Hatta uygulamamız bile çöker "System.out.printIn(singleton.getChosenImage().getHeight()); " da seçersek logcatlerden çöktüğünü objenin null olduğunu logcat aracılıgıyla görebiliriz.
Neden . GetHeight'ı null bir objeye eşitlemeye çalıştın der o sırada logcat. keza ands uyarıyor 32.satırda hata yaptın diyor nedir yani sonuç olarak :
Çünkü : Şuanki DetailActivity'mdeki singleton objemde aslında öyle bir işlem yok öyle bir attribute yok getChosenImage() diyince bana boş birşey veriyor çünkü dediğimiz gibi.
MainActivity.javadaki singleton ile DetailActivitydeki singleton aynı obje değil singletonun amacı şu : Singleton'da ben sadece tek bir obje oluşturayim istiyorum Ve böylece hangi aktivitede bunu oluşturursam oluşturuyim.
Bana sadece tek bir obje üstünde işlem yapma yetkisi verilsin istiyorum bunu yapmak için Singleton.java üzerinde "public Singleton () {" constructor'ı public değil private yapıcağım Normalde bir sınıfın constructor'ını private yapmanın bir manası yoktur
Çünkü "public Singleton () {" private yaptıktan sonra gelip biz MainActivity.javada bu "Singleton singleton = new Singleton();" bu singletonu oluşturamam keza tıklarsam Singleton'a
Sen bunu burda cağıramazsın diyor ands bu işlemi yapamayız burda yani O yüzden.
"Singleton singleton = new Singleton();" 'i siliyorum Detail 'dede aynı şeyi vericek
O yüzden "Singleton singleton = new Singleton();
        imageView.setImageBitmap(singleton.getChosenImage());" Bunlarıda siliyorum
Ve şöyle birşey yapmak istiyorum
Ben bunun objesini gelip "Singleton.java " içerisinde oluşturayım "private singleton(){" sınıfında yani ve sadece ve sadece ben buna ulaşabiliyim o yüzden ben.
    Kod Zamanı Singleton.java üzerinden.
    1) "Bitmap chosenImage;"  e gelip birkere ben "private Bitmap chosenImage;" diyeyim. Zaten sadece burdaki oluşacağım. Birtane daha obje oluşturucağım bunada.
    2) "private Singleton singleton;" diyiceğim
    "  private Bitmap chosenImage;
    private  Singleton singleton;"
Şeklinde devam ediceğim Şimdi bu singleton objesini burda oluşturduktan sonra heryerde bunu kullanabilirim nasıl kullanabilirim.
Bu Singleton.javada birtane daha method oluşturabilirim.
"public void setChosenImage(Bitmap chosenImage) {
        this.chosenImage = chosenImage;
    }" altında.
    3) public static Singleton getInstance(){ } diyebilirim.
Bu methodumu static yapabilirim "public static Singleton get" dedikten sonra getInstanceyi zaten ands kendi öneriyor getInstance ne demek o sınıfın objesini al o Instance'sini al
demek tabi bunun adına istediğimi diyebilirim ama genelde getInstance kullanılır o yüzden bizde bunu kullanalım şunu demeye calısıyorum bu objede Biz public static bir Singleton oluşturucağım
singleton objesi döndüreceğim ve bu methodun adıda "getInstance" olucak getInstanceyi cağırdığımda artık bana bir singleton objesi singleton istancesi döndürücek ve burda şunu yapıcağım.
"public static Singleton getInstance() {

    }" içerisinde.
    4) if (singleton) diyiceğim ve şu aşamda görmücek çünkü : "private  Singleton singleton;" bunuda static yapmamız gerekicek "private static Singleton singleton;" seçtiğimizde görücektir.
    4)if (singleton == null){ diyiceğim if singleton null'sa boşşa ilk defa cağrılıyorsa method ozaman.Hemen altına {'dan sonra.
    5) singleton = new Singleton(); yeni singleton objesine eşit olsun  Şimdi bu new Singletonu burda diyebilirim privatede olsa aynı sınıf içerisindeyim bunu burda yapabilirim.
Ame eğer boş değilse.
    6) singleton = new singleton altına } else { } süslüsünün içerisine elsenin.
    7) return singleton; diyorum hali hazırda oluşturulmuş singletonumuzu bize döndür diyoruz
 Tabi bunu dediğim için "public static Singleton getInstance() { }" kapanıştaki süslü bize diğer tarafta return demediğim için bize bir hata veriyor süslü çünkü. Bu .
 "public static Singleton getInstance() {" bizden bir singleton objesi istiyor Şöyle yapayim o halde  "Else [" yi" silim   sadece
 if'in süslüsü dışında hemen altında "return singleton;" diyeyim.
 Static Singleton methodumuzun içinde yazanlar ne demek.
 Eğer "if" (singleton == null) singleton boşşa yeni bir singleton oluştur "singleton = new Singleton();" Değilse zaten zaten oluşturulmuş singletonu döndür "return singleton;"
 Fakat ben her halükarda bir singleton objesi döndürebiliyorum bunu böyle yapınca
 Diğer konulara gelirsem eğer.
 "setChosenImage ve getChosenImage " bir Singleton objesi ile " private Singleton() {" public static Singleton getInstanceki()" şeklilde kullanabilirim bunu yapmak için.
 getChosenImage setChosenImage şuan kullanılmamış gözüküyor bu methodlar ama zaten birazdan kullanınca kullanılmış gözükücek ne demek istiyorum.
 Gelicem MainActivity.javaya Bir singleton objesi oluşturucağım.
    MainActivity.java Kod zamanı 1
    1) fakat bu sefer "Singleton singleton = new Singleton();" diyemiceğim dolasyıla Singleton singleton = Singleton.getInstance(); diyiceğim çünkü getInstance hem public hemStatic "startActivity(intent);" üstünde yazdım bunu.
Bunu dedim ilk defa okuşturduğum için bana bir obje oluşturulcak
    2)singleton.setChosenImage()diyip (landmarkImages.get(position)); diyebilirim yani singleton.setChosenImage(landmarkImages.get(position));
Bunu diyince artık Singleton.java içerisindeki setChosenImage kullanıldı görülceği üzerine.
Ve DetailyActivity.javaya gelip
    DetailActivity.java kod zamanı 1
    1) CountryNametext altına. "Singleton singleton = Singleton.getInstance();" diyebilirim bunu dediğimde.
Neresi çağırılcak. Singleton.javada if(singleton == null) nullmı ona bakıcak öyle birşey olmadığını görücek o yüzden
"if (singleton == null) {
            singleton = new Singleton();
        }" burası hiç cağrılmıcak.
Sadece hali hazırda oluşturulmuş singleton intancesi döndürülcek "return singleton;"
Detail Activity içerisinde artık Singletonumuzun altına yazıcağım = Singleton.getInstance(); altına yani.
   2) imageView.setImageBitmap(singleton.getChosenImage()); artık diyebilirim.
Şimdi şu aşamda emuyu çalıştırırsak bakalım çalışıyormu Pisaya tıkladığımda görülceği üzere pisa geliyor isimleri vs ile sıkıntısız bir şekilde.
Diğerleri içinde deniyelim hepsi çalışıyor
Şimdi dediğim gibi bu singleton biraz daha ileri seviye static yapmama göre ama çok daha güvenli ve aklımızda olmalı bunu heryerde kullanabiliriz sadece görsel aktarmak için değil
tek bir obje oluşturmak istediğimiz sınıf varsa tam olarak bu yapıyı ozaman yazabiliriz burdaki mantıklık.
"private singleton(){" Singleton objesini private yapmak sadece ve sadece bu sınıf içerisinden erişebilir hale getirmek bunu yaptıktan sonrası kolay Şimdi burda app'imizi tamamladık.
Aslında şuan üstüne tıkladığımızda bize tüm detayları gösteren bir app yaptık landmarkbook olarak düsünmeyin bir çok farklı şey içinde kullanılabilir farklı farklı listeler vs yazabiliriz.
Bu sadece bir örnek bunu yapmanın en güzel yoluda bu değil ama listView ve singleton mantıgını çok görüceğimiz icin bunu baştan öğrenmemiz gerekti.


 */