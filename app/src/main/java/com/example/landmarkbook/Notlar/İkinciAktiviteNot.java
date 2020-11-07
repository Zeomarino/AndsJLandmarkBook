/*
Şimdi şunu amaçlıyorduk hem adını hemde görselini vs görmek istiyorduk peki neden listViewler çok önemli ve biz neden listView'i kullanıyoruz bunun için aslında biz burdaki isimlerden herhangi birine tıklayınca.
Ne olucağını cağırdıgım bir method fonksiyon var birazdan onu kullanacağım zaten ve orda bana tıklanan yerin indexi veriliyor Yani. Pisa'ya tıklarsam 0 Eiffel'e tıklarsam 1 Colleseo'ya tıklarsam 2 London'a tıklarsam.
3 numarasını geri alıyorum integerini yani  : Arraylist'imde landmarkNames'in 0'ı bana pisa'yı veriyor landmarkNames'in 1'i keza bize Eiffel'i veriyor aynı index mantığı hem listView'de hem ArrayList'de
olduğu için ikisini çok senkronize bir şekilde kullanabiliyoruz ve böylece biz mesela landmarkNames adında landmarkImages adında mesela başka bir arrayList yazarsam aynı sırada bitmapleri yani görselleri eklersem.
Yani landmarkNames.get 0 dediğimde pisayı alırken landmarkImages.get 0 dediğimde pisanın görselini alabilirim ve pisaya tıklandığında app'imiz üzerinde 0 ı alıcağım için bu landmarkNamesten ismini.
Öbür taraftan görselini alıp diğer aktiviteye aktarıp kullanabilirim listViewdede ArrayListede index mantığı var yani sonuç olarak o yüzdende çok senkronize bir şekilde çalışabiliyoruz Şimdi buraya tıklayınca.
Bir aktivite olucak elinde sonunda o yüzden onu bir ekliyelim.
com.example.landmarkbook'a giriyorum sağ tıklayıp new diyorum ve  Activity diyorum Ve Gallery'i seçiyorum Empty Activty'i seçicem yine burdan ve ismine "DetailActivity diyorum" çünkü seçilen yerin detayını göstereceğiz sonuçta .
İsim çok önemli değil istediğiniz gibi seçebilirsiniz önemli değil açıkcası ama düzgün çalışması açısından bunu seçiyorum şimdi gelelim bunu yaptıktan sonra detail activty'nin tasarımına.
res/layout/activitiy_detail.xml açılmış görebilirsiniz sizdede muhtemelen açılır farklı aktivitelerin farklı layoutları tasarımları olur. Her neyse gelelim tasarımına.

    // Tasarım Kurgusu zamanı.
    1)imageView koymak istiyorum neden : çünkü görsel göstericem.
    2) Birtanede textView koyucağım zaten birtane görsel birtanede ismi göstermemiz yeterli biz tabi çok ayrı bir app yapabiliriz burdan işte açıklama koyabiliriz  tarih koyabiliriz hangi ülkede onu koyabiliriz vs
    o şekildede bir app yapabiliriz hatta ülkeyide ekliyelim bir imageView birtane isim Birtanede ülke gösterelim.
        // Tasarım Oluşturma Zamanı.
        1) 1 Adet imageView atalım içinde ilk başta ne olduğu hiç önemli değil indexlere eşitliceğimiz için herhangi bir görsel seçebiliriz dolasıyla çünkü kullanıcı zaten bu görseli hiçbirzaman görmicek
Yeterki boyutunu düzgün ayarlıyalım.Ekranın tamamını kaptırmayalım yani.
       2) Altına birtane textView koyalım ve bunu biraz büyütüceğimki biraz uzun isimli landmarklarımız olabilir yani şimdi bu textView'imizin adını " Landmark Name" yapıyorum ben bunuda görmicek kullanıcı ama en azından ben ne olduğunu bilim diye şimdilik koyuyorum.
İd'sinede "landmarkNameText" diyeceğim ne olduğunu karıştırmayalım diye. Ve burası seçiliyken bu textAlignment'ini ortalaliyim textini biraz büyütüceğim 24Sp yapıcağım mesela keza. Gravity'ni center_vertical seçiceğim.
       3) Bunun aynısını ctrl c ve ctrl v yöntemi ile kopyalayıp coğaltalım textine Landmark Name yerine "Country Name" yazıcağım idsinede countryNameText diyiceğim. 2 Tane textViewimiz oluyor sonuç olarak.
İnfer Constraint'e basıyorum burda basınca karışıyor şuan gözükülceği üzere imageView kücülüyor diğer textViewlerimiz büyüyor bunun olmasını istemiyorum o yüzden şöyle yapıcağım infer constraint'e bastıktan sonra elle tekrar imageViewimizi büyütüceğim.
Diğer 2 si otomatik olarak kendisi küçülüyor zaten elimizle birazcık kücültebiliriz belki TextViewleri.
Şimdi zaten bir bakalım eğerki beğenmmezsek gelip tekrar değiştirebiliriz Daha sonra ...
Gelelim DetailActivity.java içerisinde hemen bir bunları tanımlıyalımki unutmayalım sonradan bunu.
    // DetailActivity kod zamanı.
    1) onCreate altına " 1 imageView'imizi getirelim." "ImageView imageView = findViewById(R.id.imageView);" şeklinde bu şekilde buraya getiriyorum.
    2 ) Hemen altına TextViewlerimizi tanımlıyalım " TextView landmarkNameText = findViewById(R.id.landmarkNameText); " diyorum daha sonra diğer textViewimizde var.
    3 ) "TextView countryNameText = findViewById(R.id.countryNameText);" diyorum ve bunları böylece tanımladık
MainActivity.java içerisinde keza gerekli verilerimiz var birazdan "ArrayList" olarak birazdan görsel ve ülke için ayrı ayrı diziler oluşturucağız ama şuanda en azından birşeylerimiz mevcut
Geriye ne kalıyor ListViewden birine tıklayınca nasıl diğer aktiviteye bilgi aktarıcaz geçicez vs o işlemleri yapmak kalıyor
Onun içinde "LandmarkGörselleriNot" şeklinde devam ediceğim.
 */