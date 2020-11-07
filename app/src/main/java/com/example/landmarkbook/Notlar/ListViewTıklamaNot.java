/* Şu aşamada biz ne istiyoruz emulatorumuzdeki listelerden birine tıkladığımızda diğer aktivite açılsın o yüzden bu listelerden birine tıkladındığında cağırılcak bir method bulmamız gerekiyorki onun altına bir intent yazalım intenti görmüştük diğer aktiviteye gitme vs.
Onu yapıcağız aslında fakat sorun şuki daha öyle bir methodumuz bile yok O yüzden şimdi geliyorum .
//ListView notumun altındaki listView'imin altına.
 // Kod zamanı
 1)listView .setOnItem
 setOnItemClickListener'i seçiyorum  bir şeye tıklandığında bir iteme yani ne olucağını bu method belirtiyor mesela burdaki longClickListener bir iteme uzun tıklandığında ne olucak 3 sn fln basarsa ne olucağını biz şu aşamada zaten öyle birşeyle ilgilenmiyoruz
 Şuan ilgilendiğimiz setOnItemClickListener(); diyorum
 1)ListView.setOnItemClickListener(); şeklinde hal alıyor ve bunu dediğimde "()" içerisinde bir listener bekliyor bizden yani bir dinleyici bekliyor dinleyicileri bundan sonra sık sık görüceğiz Dinleyici şu demek : Bir aksiyon olduğunda bir işlem olduğunda kullancının bir yere tıklaması örneğin internetten bir verinin gelmesi birşey olduğunda ne cağrılcak
 hangi method cağırılcak bu dinliyor he oldu diyor hemen şunu yapim diyor dinleyici bu demek Listener yani şimdi bu listeneri yazmak için (new On) dersek bize panel acılıyor zaten Biz burdan .
 AdapterView.OnItemClickListener{...} seçeneğini seçiyoruz buna çift tıkladığımızdada bizim için bir method oluşturcaktır ands şu şekilde oluyor
 "       listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });"
Bu şu manaya geliyor long id) den sonraki süslünün içerisinde herhangi bir iteme tıklanınca ne olucağını buraya yazıyoruz ve burada şöyle güzel birşey var bir adet int position'da integer veriliyor int i yazabilir position yazabilir indexde yazabilir herneyse bu ne işe yarıyor kısmına gelirsek
Biz pisa vs ye tıklayınca emudan burdaki int position 0 oluyor yine eiffel'e tıklayınca burdaki int positon 1 oluyor ve böylece ben kullanıcım nereye tıkladıgı kaçıncı index'e tıkladı onu anlıyabiliyorum ve böylece mesela.
landmarkNames.add("Pisa"); kısmını örneğe aldım landmark.get i dersem 0'a tıklayınca 0 ı alırsam bire tıklayınca 1 i alırsam ve böylece ben bu şeye ulaşmış olurum pissaya italy'e ve Images'tende pisa bitmapine ulaşmış olurum
Deniyelim o halde bunu { den sonrasına gelip
    //Methodumuzun içeriğini oluşturalım kod zamanı.
    1) landmarkNames.get (position); // İndex soruyor () 'da mesela 0 demek yerine position diyiceğim. Tabiki bunu böyle yapmanın mantıgı yok. O yüzden
    ASıl 1) System.out.printIn(); (landmarkNames.get(position)); içerisine landmarkNames.get (position)'u yazdım sonra landmarkNames'i yazdırsın
    2) System.out.println(countryNames.get(position)); şu aşamada emuyu çalıştırırsak Aşağıdan logCati açtığımızda yazdırdıgını görebiliriz pisa Italy diye göremezseniz System.out yazdığımızda filtreleyip sadece yazdırdıklarımızı görürüz.
Diğer 4 ülke ve temsilcilerinide yazdırdıgını görebiliyoruz Eiffel misal france vs ve böylece artık biz kullanıcım neye tıkladı böyle görebiliyorum burdan peki sadece bunu görmekmi istiyoruz hayır tabiki Bu system.out'u alıp diğer aktiviteye aktarıcam
hatta diğer aktiviteye önce bir gitmem gerekiyor bir intent yapmam lazım o yüzden şimdilik bu system.out laır yorum haline getireyim şuan buna ihtiyacım yok önce bir ıntent'imizi yapalımda sonra nasıl aktarcağımızı görürüz.
    3) Intent intent = new Intent ()  //() içerisinde bize bir adet context soruyor MainActivity.thisde diyebiliriz getApplicationContext'de diyebiliriz bu örnekte
    3) Intent intent = new Intent(getApplicationContext(),DetailActivity.class); ,'dan sonra nereye gidiceğimizi soruyor DetailActivty'e gidiceğim ben
    4) startActivity(intent); diyiceğim direk bizi diğer tarafa götürsün şu aşamada emuyu calıştırırsak pisa vs 'a tıklayınca diğer aktiviteye gittiğimizi görürüz şimdi şu aşamada geriye kaldı bu bilgileri DetailtActivty'e aktarmak.
Orasınıda bir sonraki notumda devam ediceğim. (VerileriAktarmakNot) şeklinde

 */