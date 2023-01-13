Feature: US1009_Yanlis Kullanici Listesi Ile Negatif Login Testi


  Scenario Outline: TC14 yanlis kullanici listesi ile giris yapilamamali

    Given kullanici "qdUrl" anasayfaya gider
    Then ilk sayfa login linkine click yapar
    And kullanici kutusuna manuel olarak "<yanlisUsername>" yazar
    And password kutusuna manuel olarak"<yanlisPassword>" yazar
    And 3 saniye bekler
    And login butonuna basar
    And giris yapilamadigini test eder
    Then sayfayi kapatir

    Examples:
    |yanlisUsername |yanlisPassword|
    |ilker          |ilker@a.com   |
    |mehmet         |mehmet@b.com  |
    |yasar          |yasar@c.com   |
    |ozgur          |ozgur@d.com   |
    |heysem         |heysem@e.com  |