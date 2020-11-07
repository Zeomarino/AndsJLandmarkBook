/* Bu bölümde öğrenceğimiz şeyler çok değerli neden : Çünkü listView Nedir bunu öğreneceğiz bir diziyi nasıl bir listede gösteririz bunu öğreneceğiz.
Bunu bir çok appde kullanacağız öğrendikten sonra çünkü sadece bir dizinin içerindeki metinleri göstermek değil resimleri göstermek
Bir çok başka şeyi göstermek internetten çektiğim şeyleri sıralı olarak göstermek gibi farklı farklı bir çok işlem yapabiliyorum arkadaşlar.
Bunu öğrendikten sonra o yüzden şuan şu derste anlatılan şeyler çok önemli
Herneyse Birtane listemiz olucak kent simgelerinin gösterildiği bir liste bu kent simgelerine tıklayınca başka bir ekrana gidicek
Başka bir aktiviteye gidicek o aktivite içerisindede bizim aslında seçtiğimiz kent simgesinin resmini göstericek ve açıklamasını ismini göstericek
Tabiki bu app daha geliştirilebilir tarihi gösterebilir başka bilgiler gösterilebilir vs çok farklı listeler yapılabilir fakat biz bu örnek üzerinden gidiceğiz.

Evvela gelelim onCreate altında bazı işlemler yapmaya. Neden onCreate altında yapıyorum daha app'im çalıştığı gibi
İlk açıldığı gibi olmasını istediğim şeyleri burda yazıyorumki daha app'im ilk açıldığında ben bir liste görmek istiyorum
Bu listenin içeriğini kendimiz birazdan oluşturucağız Bir arrayList kullanıcağız bir liste kullanacağız ve bu dizimizin içerisine göstermek istediğimiz kent simgeleri neyse Eifel kulesi piza kulesi.
Bunları koyucağız Listeyi bulmak için öncelikle bir layoutumuzu açalım.
Anasayfasını temiz hale getirelim.
    // Tasarım zamanı 1.
    1)Temiz bir hale getirdimki bizim burda pek ihtiyacımız olan birşey yok bizim için önemli olan birşey var oda ListView buna ulaşmak için Palette sekmesinde listView diye aratalım
    2) ListView'i uygulamaya atarsak gözükceği üzere sağa sola kendini genişletti genelde zaten listeyi kullandığımız aktivitelerde sadece listeyi kullanırız bunun içinde bazı dizeler göstermek isteriz.
ve buraya yayılması constraint verdiğimiz manasına gelmiyor sadece o yüzden bunu koyduktan sonra infer constraint yaparsak daha sağlıklı olur otomatik oluştursun kendisi yani 8 8 8 8 otomatik vermiş istersek bunu 0 da yapabiliriz farketmez.
ve attributesden buna id vermemiz gerekiyorki "listView" olarak verdim ben bu arada herneyse çünkü birazdan bunu gidip kodumuzda tanımlıyacağız.Tek yapmamız gereken listView koymak için gereken bu.
Layoutta işimiz bitti bile diyebilirim.
Şimdi mainActivty.javamıza bir geri dönelim ve bunu hemen bir tanımlayalım.

        // Kod zamanı 1
    1) onCreate altında "ListView listView = findViewById(R.id.listView);" Diyiceğim (Dikkat ederseniz adınada ListView listView" olarak "listView" dedim.
sonra bunun içerisine  nasıl ben listedeki görünümleri koyabilirim tabi bunu koymadan önce bir listemiz olması lazım ve bu liste içerisinde hangi şeyleri gösterceksek onları yazmamız lazım pizamı eifelmi vs.
bunun için ne yapabiliriz daha önce Array bölümünde ne görmüştük ArrayList'i kullanabiliriz ne yapıyorduk peki bu ArrayList'i oluşturduktan sonra sabit bir array gibi değilde normal Bir array'de değilde.
Bir ArrayList'de bunu yaptığımızda içine istediğimiz kadar şey ekliyebiliyorduk sonradan o yüzden ben bunu ArrayList olarak kullnacağım sonra siz isterseniz başka örneklerde ekliyebilirsiniz.
    2) ArrayList <String> landmarkNames = new ArrayList<>();
ArrayListimin adına landmarkNames diyiceğim bu listemde sadece isimler olucak Ve ilk başta bu ArrayListimin içerisinde ne olucağunu belirticeğim <> söyle yazıp.
String yazarsak  bu şu demek oluyor ben bir landmarkNames diye bir arrayList oluşturuyorum içerisindede sadece "<String>" objeleri olucak.
ve = den sonra new ArrayList<>(); dersek şu şekilde biz bu landmarkNames'i oluşturuyoruz bu yeni bir arrayList olucak "New ArrayList" fakat içerisine daha herhangi birşey koymadım anlamına geliyor.
Şimdi gelip tek tek şöyle birşey yapabilirim altına.
Eğerki          Test1) LandmarkNames .add
.add dediğimizde hemen bize bir string soruyor neden string soruyor çünkü bunu en baştan <String> diye belirttik. Peki başka ne yapabilirdik
ArrayList'imizin içerisine <Integer> koyabilirdik örneğin yani eğer bir numara koymam gerekseydi eğer isimden ziyada "landmarkNames.add dediğimizde" bu sefer bize integer sorucaktı.
Ama ben bunu istemiyorum çünkü bir numara değil gerçekten bir isim koyucağım mesela.
    3) landmarkNames.add(""); diyip tırnak işareti içerisinde "Pisa" yazıcağım "landmarkNames.add("Pisa");" gibi mesela eiffel kulesini koyalım.
hemen altına yine "landmarkNames.add("Eiffel");" başka ne koyalım örneğin "landmarkNames.add("Colleseo");" 1 tane daha koyalım oda misal "landmarkNames.add("London Bridge");" olsun.
Ben ne yapmak istiyorum sonuç olarak Burdaki Arraylist<String> ve altındaki landmarkNames.add bölümündeki  dizimi "dizim bunlar" alıp bu "ListView listView" listesi içerisinde
Göstermek istiyorum bunu nasıl yapıcağız bunu yapmamız için ArrayAdepter diye birşeye ihtiyaç duyoruz.
    4)ArrayAdepter arrayAdapter = new ArrayAdepter(MainActivty.this,)
ArrayAdepterleri listViewler içerisinde bazı contentleri yani içerikleri göstermek için kullanabiliyoruz ArrayAdepter dedikten sonra hemen boşluk bırakıp adını söylememiz gerekiyor arrayAdepter şeklinde.
Sonra eşittir koyup new ArrayAdepter diyorum new ArrayAdepter dediğimde () içerisinde bizden bazı şeyler bekliyor bazı değişkenler bazı parametreler bekliyor.
Bir : Context bekliyor contexti daha önce konusmuştuk burdaki contextimiz mainActivty olucak o yüzden (içerisine ) (this) veya (MainActivity.this,) yazabiliriz.
İkinci : Bize Layout Resource soruyor bu nedemek Bir liste içerisinde mesela sadece metin gösterirsek keza aslında listede sadece metin göstermek zorunda değiliz görselde koyabiliriz
buttonda koyabiliriz bunların örneklerini daha sonra görüceğiz fakat biz şimdilik sadece ve sadece metin göstermek istiyorsak ve böyle oluncada biz kendimiz ayrı bir xml felan yapmamıza gerek yok.
bukadar basit işlemler için oluşturulmuş hazır şablonlar var onu kullanıcağım burda Onuda kullanmak için.
    4)ArrayAdepter arrayAdapter = new ArrayAdepter(MainActivty.this,R.Layout.android.R.layout.simple_list_item_1)
Simple list item 1 şu demek simple list item 1 ben sadece ve sadece metin göstericeğim kardeşim demek liste içerisinde sadece metin göstericeksek tek satır halinde bunu kullanabiliriz he yok biz görselde göstericeğiz.
Buttonda kullanıcağız diyorsak kendimiz dizayn ediceğiz sonra sonucusuda layout context vs koyduk birde bize.
Üçüncü : List objects list objelerini soruyor bunuda.
    4)ArrayAdepter arrayAdapter = new ArrayAdepter(MainActivty.this,R.Layout.android.R.layout.simple_list_item_1,landmarkNames);
 landmarkNames'ten al diyerek bu dizimle şurdaki "ArrayList<String>" ve altındakilerle birlikte arrayAdepter'i birbirine bağlamış oluyorum geriye ne kalıyor listView ile bu ArrayAdepter'i birbirine bağlamak.
    5) listView.setAdepter(arrayAdepter); diyip () içerisine arrayAdepter bağlarsam herşey birbirine bağlanmış olucaktır.
Şu aşamada şu emuyu çalıştırırsak bakalım bu koyduğumuz arrayList'i Listemizde arrayListte Pisa,eifel,colleseo,london bridge listede yazdığımız sırada tam olarak karşımıza cıktı.
Peki ben bir diziyi neden bir listede göstermek isteyiyimki neden bukadar önemli bu listeler neden devamlı dizilerle listelerle vs calışacağız Burda duralım bir sonraki notta hem bu soruyu cevaplıyalım
Hemde buraya tıklayınca bişey olmuyro nasıl gidiceğiz öbür aktiviteye vs onu konusalım
"İkinciAktiviteNot" olarak devam ediceğim
 */