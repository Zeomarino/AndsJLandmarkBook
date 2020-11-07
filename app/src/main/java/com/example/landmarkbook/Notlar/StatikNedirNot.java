/*
 Daha önce ne demiştik intent.putExtra methodu image veya bitmapleri aktarmak için doğru bir method değil onun yerine farklı farklı methodlar kullanmanız gerekiyor şimdi bunun bir adet güzel bir adette çirkin yolunu görelim.
 Çirkin yolu nedir çirkin yolu statik diye birşey kullanmak ne demek istiyorum
 MainActivity.java içerisine girdiğimizde onCreate dışında appCompatActivity altında sınıfımın içinde bir görsel veya herhangi bir değişken oluşturursam mesela :
    Kod zamanı 1 )
    1) Bitmap selectedImage;
şeklinde bir şey oluşturursam normalde ben buna şuan onCreate altındanda başka methodlarımda olsa herhangi bir yerden erişebilirim  mesela.
onItemClick methodunda
    2)selectedImage dersem bitmapimi burdan seçebilirim hatta seçim "selectedImage = landmarkImages.get(position); dersem gerçektende selectedimagem seçilen görsele eşitlenecektir çünkü bu bir dizinin içerisinde.
Fakat şöyle birşey var ben bu bitmap'e aslında DetailActivity'dende ulaşabilirim şuan ulaşabilirmiyiz. Yani DetailActivity içerisinde.
selectedImage yazarsam çıkmaz bunun çıkması için statik dediğimiz bir işlem yapabiliriz  şimdi şurası çok önemli.
    3)"Bitmap selectedImage;" in başına gelip. "static Bitmap selectedImage;" şeklinde yazarsam burdaki static heryerden ulaşabilir manasına gelir
Yazım itatik olur font olarak çünkü ands üzerinde static değişkenler ıtalic olur peki şuan detail activity'e gidersem.
    4) "selectedImage" yazarsam bakın çıkmıyor ama selectedImage diyince bize bir alt enter yapmamızı istiyor ands alt enter yaptığımızda ise.
İmportu açarsak görüceksiniz import static.com.example.landmarkbook.MainActivity.selectedImage; şeklinde bir import görüceğiz bu demekki mainActivity içerisindeki.
SelectedImages'i import etmiş statik olarak importta genelde bazı sınıfların import edildiğini görürüz.Ama bu sefer bir değişkeni import etmiş.biz aslında şuanda.
Oluşturuduğumuz selectedImages'i mainActivity.java üzerinden oluşturduğum selectedImages'i artık detailActivityden kullanabilirim yani biz gelip detaily Activity'e
    5)"imageView.setImageBitmap(selectedImage);" dersem seçilen bitmap'i artık burda gösterebilirim
Şu aşamada emuyu çalıştırırsak gelip app'imizde pisaya tıkladığımızda pisa kulesi italy vs herşey gözükür bir biçimde oluyor aslında şuan app bitti yazdık herşey istediğimiz gibi çalışıyor fakat
şöyle bir detay var bu şeyi gerçekten çalışabilir ve kullanabiliriz bu tarz küçük projelerde fakat genelde bir yere girip android dev vs olucaksak proje üstünde birsürü insan calısır yani büyük bir proje olduğunu düsünün.
15 kişi çalışıyor proje üstünde bir kişi gelip yanlısıkla selectedImages'i kendi yazdığı kod içerisinde cağırsa çağırabilir onu değiştirebilir selectedImages'e her yerden ulaşmak çok tercih edilen bir yöntem değil o yüzden genelde proffesionel yazılımlarda.
Bu static çok dikkatli kullanılır o yüzden çok tercih edilen birşey olmuyabilir bu sebeplede app'i burda bitirmiyeceğiz bir yöntem daha görüceğiz o dahada güvenli.
yine farklı aktivitelerden ulaşabildiğimiz bir yöntem fakat bukadarda kolay değil daha yapısal bir yöntem onuda gördükten sonra bu bölümü bitirceğiz.
Yeni notuma o sebeple "SingletonYapısıNot" şeklinde devam ediceğim
 */