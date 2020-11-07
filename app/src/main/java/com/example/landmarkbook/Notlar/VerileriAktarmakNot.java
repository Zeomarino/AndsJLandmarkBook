/*
Daha önce nasıl bilgi aktarılır bunu görmüştük intent yaparken daha startActivty yapmadan önce .
 Bir ekstra bilgi aktarmak istiyorsak buraya koyabiliyorduk Misal şimdi ben.
    // Kod zamanı 1
    1) intent.putExtra
    Bizden bir isim sonra istersem int istersem float istersem byte double string ne istiyorsam yolluyabiliyordum. Şimdi ben bir string yollamak istiyorum
    1) intent.putExtra("landmarkname",landmarkNames.get(i));
Diyeceğim ve bu diğer tarafa giderken bu bilgiyi kendince götürücek şimdi bir deniyelim bunun icin DetailActivity'e girelim burdanda şu şekilde alıcağız bilgiyi.
    2) Intent intent = getIntent();
    Ne yapıyor bu yukardaki getIntent buraya bir intent ile gelindiyse detailActivity'e ki öyle geliniyor bana yollanan intenti alıyor böylece biz mesela get diyebiliyoruz mesela "intent.getStringExtra , getIntExtra gibi diğer taraftan sonuçta string yolladık.
    3) intent.getStringExtra ("landmarkName"); diyebilirim bu bana isimlerin putExtra ile aynı olmasına dikkat etmemiz gerekiyor diğer tarafta put edip koyduk burda getiriyoruz bunu aldıktan sonra.
    3) Ben bunu değişkene eşitlersem dahi iyi olucağından. "String landmarkName = intent.getStringExtra ("landmarkName");"
    4)landmarkNameText.setText(landmarkName);  // Diyebiliriz şu aşamada emuyu calıştırırsak Pisaya tıkladığımda altında pisa cıkıyor gelip aynısını hiç vakit kaybetmeden ülkeler içinde yapayim.
    Şu aşamada mainActivty.javadan devam ediceğim.
    intent.putextra altına yine.
    5)intent.putExtra("country",countryNames.get(position)); diyorum
    Şu aşamada detailActivty.javadan devam ediceğim.
    6)String'in altına yine "String countryName = intent.getStringExtra("country"); diyorum
    7) landmarkNameText altına yine "countryNameText.setText(countryName); diyorum
Şu aşamada emuyu çalıştırırsak Pisaya tıkladığımda Pisa italy vs oldu Hem simgesi hemde adı yazıldı yani böylece
Geriye ne imageView kaldı görselide aktarırsam kaba işimiz biticek fakat görsel bu tarz kolay aktarılmıyor intent.putExtra ile aktaramıyoruz çünkü bitmap büyük bir veri aslında burda string gibi integer gibi veya bullian gibi çok küçük verileri
yolluyabiliyoruz fakat sen 500 kb bile olsa bir resmi yollarsan burda uygulama çökücektir intent.putExtra bu tarz büyük verileri yollamak için uygun değildir peki nasıl yolluyacağız burda duralım Bunla ilgili bir 2 teknik öğrenelim.
Sıradaki notum "StatikNedirNot" olucak


 */