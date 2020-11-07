/*
Şimdi bu indirdiğimiz ve drawble içerisine koyduğumuz görselleri bir değişkene atamamız gerekiyor ve bir obje olarak buraya tanımlamamız gerekiyorki listelerimiz içerisine koyalım şimdi bunu nasıl yapıcağız ?
Bir bu tarz görselleri bir obje gibi tanımlamak için bitmap dediğimiz bir sınıf kullanıyoruz  "Bitmap" yazınca birsürü şey cıkıyor
Bizim şuan ilgilendiğimiz şey şu sade bitmap Görülceği üzere (android.graphics) içerisinde görüldüğü gibi ve buradan ürettiğimiz objelerle biz görsellerimizi tanımlıyabiliyoruz sadece drawble olanları değil.
İnternetten bir data vs indirdiğimizde Bitmap'e tanımlama yapabiliyoruz ki ilerliyen zamanlarda yapıcağım.
Ne demek istiyorum peki. Mesela "Bitmap yazdım pisayı oluşturalım" o halde.
    // Bitmap Kod zamanı.
    1) Bitmap pisa =
Bitmapi oluşturmanın bir çok yolu var biz şu aşamada drawble içerisindekileri almak istediğimiz için BimapFactory dediğimiz birşeyden faydalanacağız
Bu görülceği üzere bazı farklı kaynaklarda dosyalardan özellikle bir bitmap oluşturmak için gerekli olan sınıf tam olarak bizim ihtiyacımız olan şey bu
Ve şu şekilde yaptığımda.
    1)Bitmap pisa = BitmapFactory.
Dersem decode diye birşey var sanki bir encode yapılmış hani bir kodlama kripthane getirmiş bizde bizde bu dosyayı jpg'yi png' dosyasını
Alıp decode ediceğiz ve kendimiz bitmap'e çevirip yine kendimiz bir değişkene atıyacağız burda. decodeResourceyi arıyoruz biz çünkü.
Resourcemizin içerisinde yani res/drawble kütüphanesinde
    1)Bitmap pisa = BitmapFactory.decodeResource() tıklarsak eğer bizden birkaçtane parametre isticek yine.
peki nedir bu parametreler bir resourcemizi nasıl alıcağız diyor burası biraz ezber olucak ama şöyle alınıyor.
(getApplicationContext()) yani kontextimizi alıcağız ve devamında ().getResources()) dersek bize resourcesi vericektir.
Dokümatasyonlarıdaki açıklamada : Resources diye birşeyi bize verir diyor kendi uygulamamızdaki resources'e ulaşabiliri diyor .
Peki resources neymiş yani kaynaklar :  Bu bir sınıftır diyor ve kendi uygulamamızdaki r içerisinde drawblemizden tutun diğer layout vs şeylere ulaşmak için oluşturudugumuz bir sınıfmıs aslında bu
Bu bizim
decodeResource içerisindede bana resourcesi ver diyordu bizde zaten o yüzden(getApplicationContext().getResources()) diyorum
ve ardından , koyarsm hangi resourceyi decode etmemi istiyorsun diye soruyor ands oda . Kütüphanemizde zaten.
R.drawble.pisa olarak yazıyorum
Şu şekili alıyor.
    1)Bitmap pisa = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.pissatower);
Tabiki biz burda görselin adına pissatower değil başka birşey verdiyseniz R.drawble.'da onu seçmemiz gerekiyor.
Bu işlemleri mainActivty.java içerisinde yaptım countryNames'in hemen altında.
Şimdi tam olarak biz bunu yaparak Bir bitmap objesi oluşturdum (pisa) Ve bu bitmap objesini ArrayList içerisindede saklıyabilirim istediğim her yerde aslında artık kullanabilirim aynısını diğerleri içinde tek tek yapıcağım.
yine aynı sırayla yapıyorum.Daha doğrusu burda hangi sırayla yaptığım önemli değilde bunu birazdan diziye ekliyeceğim diziye aynı sırayla eklemem önemli
    2) Bitmap eiffel = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.eiffeltower);
    3) Bitmap colesseo = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.colleseo);
    4) Bitmap londonbridge = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.londonbridge);
Diyorum ve hemen bundan sonra gelip ArrayListimizi oluşturalım.
    //ARRAYList kod zamanı
    1) ArrayList<Bitmap> landmarkImages = new ArrayList<>();
Bu sefer ArrayListimizin içerisine Bitmap koyucağım sonra hemen gelip altına
    2) landmarkImages.add diyorum bu sefer bizden bitmap istiyor çünkü bitmap olucağını belirttim bu sefer çok önemli sıralama yani şu şekilde yapıcağım.
    2)landmarkImages.add(pisa);
    3)landmarkImages.add(eiffel);
    4)landmarkImages.add(colesseo);
    5)landmarkImages.add(londonBridge);
Şeklinde yapıyorum ve bitiriyorum şimdi şu aşamda verilerim okey listem tamam ne kalıyor geriye tıklama tıklayınca diğer tarafa gitme işlemini daha yapamadık nasıl tıklanıyor onu daha bilmiyoruz.
Listelere o yüzden burda duralım bir sonraki notumdan devam ediceğim "ListViewTıklamaNot" şeklinde devam ediceğim.
 */