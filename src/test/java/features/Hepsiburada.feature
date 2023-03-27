  Feature:Hepsiburada mobil uygulamasi ürün satın alma EndToEnd testi
    Background: Login olunur
      Given "Hesabim ikonuna" tiklanir
      And   "email" yazilir
      Then  "login giris yap" tiklanir
      And   "sifre" yazilir
      And  "giris yap" tiklanir
      And  "tamam" tiklanir
      And  "carpi simgesi" tiklanir
    @endToEnd @smoke
    Scenario:Hepsiburada outdoor ayakkabi satın alma testi
      Given Kategorilere tiklanir
      And   "Spor outdoor kategorisi" için sayfa taranir ve kategori var ise tiklanir
      Then  Outdoor giyim ayakkabi kategorisi tiklanir
      And   "Outdoor Bot" için sayfa taranir ve kategori var ise tiklanir
      And   "filtrele" tiklanir
      Then  "cinsiyet" tiklanir
      Then  "fiyat araligi" tiklanir
      And   "En az fiyat" yazilir
      And   "En cok fiyat" yazilir
      Then  "urunleri gor" tiklanir
      And   "slazenger Habib Erkek Outdoor Bot" tiklanir
      When  "sepete ekle" tiklanir
      Then  "sepete git" tiklanir
      Then  "alisverisi tamamla" tiklanir
      Then  "adres bilgileri" yazilir
      Then  "kart bilgileri" yazilir
      And   uygulamayi kapat








