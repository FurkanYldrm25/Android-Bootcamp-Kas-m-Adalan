package com.example.android_kotlin.degiskenler

val sehir = "Erzurum"
val ulke = "Türkiye"

val telefon = "4420000000"
val telefon_farkliTip = 442000000
/* Hem metinsel hem de sayısal olarak yazılabilir.
 * Fakat telefon gibi uzun numaraların sayısal olarak tanımlanması bellek performansını olumsuz etkileyecektir.*/

val postaKodu = "25000"
val postaKodu_farkliTip = 25000 //Telefon numarasıyla aynı mesele geçerlidir.

val ePosta = "ornek@ornek.com"
val meslek = "Bilgisayar Mühendisi"

var stokMiktari = 120
val stokMiktari_farkliTip = "120"
/* Stok miktarı metinsel veya sayısal türde tanımlanabilir.
* Fakat stok miktarı üzerinde genelde matematiksel işlemler yapılacağından sayısal tanımlama kullanılmalıdır.
* Var kullanılmasının sebebi ise yapılan matematiksel işlemlerin sonucunda çıkan sonuç tekrar bu değişkene atanabilir ya da stok miktarı sürekli güncellenebilir.
* Bu durumda val kullanmak işlem kısıtına yol açacağından var kullanılması daha uygun olur.*/

val musteriAdi = "Furkan Yıldırım"

val bakiye = 5300
val bakiye_farkliTip = "5300" // Stok miktarındaki durum burada da geçerlidir.

val dogumGunu = "01/01/2001"


val maas = 65000
val maas_farkliTip = "65000" // Stok miktarındaki durum burada da geçerlidir.

val medeniDurum = "Bekar"
val urunYorum = "Ürün Yorumu..."
val odemeTarihi = "05/05/2025" // Gerçek yazılımlarda date, time benzeri kütüphanelerden direkt çekilebilir.
val odeme = 12500
val odeme_farkliTip = "12500" // Stok miktarındaki durum burada da geçerlidir.
val siparisAdedi = 25
val siparisAdedi_farkliTip = "25" // Stok miktarındaki durum burada da geçerlidir.
val arabaModeli = "Model ismi ya da model yılı..."
val kitapAdi = "Kitap Adı..."
val yayinlanmaTarihi = "05/05/2025"
var indirimMiktari = 0.25
var indirimMikatri_farkliTip = "0.25" // Stok miktarındaki durum burada da geçerlidir.
var odaSayisi = 4
var odaSayisi_farkliTip = "4" // Stok miktarındaki durum burada da geçerlidir.
var enlem = 41
var boylam = 17.39
val urunAdi = "Ürün İsmi..."
var yemekFiyati = 280
val marka = "Marka Adı..."
val muzikAdi = "Müzik Adı..."
var videoSuresi = 25.49
var urunPuani = 4.9
val resimAdi = "resim.png"
val dosyaFormati = ".kt"
val renk = "Mavi"
val renkKodu = "#121212"
val telefonModeli = "Telefon Modeli..."
val ekranBoyutu = "12.5"
var agirlik = 25
val ulusalGun = "30/08/1922"
val tatilGunu = "23/04/2025"
val rezervasyonTarihi = "23/04/2025"
val sokakAdi = "Sokak Adı..."
val otobusHatti = "Otobüs Hattı..."
var kalanDakika = 23
val takipKodu = "1223344"
var kuponSuresi = 25.12
val kuponKodu = "2549"
val faturaAdresi = "Fatura Adresi..."