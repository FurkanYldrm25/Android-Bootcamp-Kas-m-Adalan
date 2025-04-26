package com.example.android_kotlin.nesne_tabanli_programlama

import java.util.Locale

class Odev2 {
    fun soru1(derece : Double){
        val fahrenheit = (derece*1.8) + 32
        println("Fahrenheit: $fahrenheit")
    }
    fun soru2(kisaKenar : Double, uzunKenar: Double){
        val sonuc = (uzunKenar + kisaKenar) * 2
        println(sonuc)
    }
    fun soru3(sayi : Int){
        var sonuc = 1
        for(i in 1..sayi){
            sonuc *= i
        }
        println(sonuc)
    }
    fun soru4(metin : String){
        val islenecekMetin = metin.lowercase()
        var sayac = 0
        for (i in 0..metin.length-1){
            if(islenecekMetin[i] == 'a'){
                sayac++
            }
        }
        println("Girdiğiniz metinde $sayac adet 'a' harfi vardır")
    }
    fun soru5(kenarSayisi : Int) : Int{
        val icAciToplami = (kenarSayisi - 2) * 180
        return icAciToplami
    }
    fun soru6(gunSayisi : Int) : Int{
        var toplamUcret = 0
        val calisilanSaat = gunSayisi * 8
        if (calisilanSaat > 160){
            val mesaiCalisma = (calisilanSaat -160) * 20
            println("Mesai Ücreti: $mesaiCalisma")
            val normalCalisma = 160 * 10
            println("Normal Ücret: $normalCalisma")
            toplamUcret = mesaiCalisma + normalCalisma
        }else{
            toplamUcret = calisilanSaat * 10
        }
        return toplamUcret
    }
    fun soru7(kotaMiktari : Int) : Int{
        var toplamUcret = 0
        if(kotaMiktari>50){
            val asimMiktari = kotaMiktari - 50
            println("Aşım Miktarı: $asimMiktari")
            val asimUcreti = asimMiktari * 4
            println("Aşım Ücreti: $asimUcreti")
            val normalKullanimUcreti = 100
            toplamUcret = normalKullanimUcreti + asimUcreti
        }else{
            return 100
        }
        return toplamUcret
    }
}