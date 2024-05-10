package com.tpe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling // Schedule özelliği aktif oluyor
public class SchedulerTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchedulerTaskApplication.class, args);
	}

}

/*
       NIYE SCHEDULER KULLANMAM GEREKIYOR

    örnek senaryolar:

    1. Günlük Rapor Oluşturma :

    Bir şirketin, her günün sonunda satış, müşteri etkileşimi veya performans gibi çeşitli
    alanlarda raporlar oluşturması gerekebilir. Bu raporlar, iş gününün bitiminden sonra
    otomatik olarak oluşturulup ilgili yöneticilere e-posta ile gönderilebilir.

    2. Veritabanı Yedekleme:

    Uygulamanın veritabanını düzenli aralıklarla yedeklemek, olası bir veri kaybı durumunda
    bilgilerin korunmasını sağlar. Bu işlem, genellikle düşük trafik olan gece saatlerinde
    otomatik olarak gerçekleştirilebilir.

    3. Eski Log Kayıtlarını Temizleme

    Uygulamanın log dosyaları zamanla büyüyebilir ve disk alanını doldurabilir. Belirli bir
    süreden eski log kayıtlarını otomatik olarak silmek, sistemin düzenli olarak temizlenmesini
    sağlar.

    4. Kullanıcı Hesaplarını Otomatik Olarak Güncelleme veya Pasifleştirme

    Belli bir süre boyunca etkin olmayan kullanıcı hesaplarını otomatik olarak pasifleştirmek
    veya belirli kriterlere göre kullanıcı hesaplarını güncellemek, uygulamanın yönetimini
    kolaylaştırır.

    5. Dış API'den Veri Senkronizasyonu

    Bir uygulama, hava durumu, finansal bilgiler veya sosyal medya istatistikleri gibi dış bir
    API'den düzenli olarak veri çekebilir. Bu veriler, belirli aralıklarla uygulamanın veritabanıyla
    senkronize edilerek güncel tutulabilir.
 */
