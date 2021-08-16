# HumanResourceManagementSystem.JavaBackend
Java.SpringBoot- Backend for Human Resource Management System

## *BACKEND İSTERLERİ* 

## Madde 1 : İş Arayanlar sisteme kayıt olabilmelidir.*

### Kabul Kriterleri:

:sweat_drops:	Kayıt sırasında kullanıcıdan ad, soyad, tcno, doğum yılı, e-Posta, şifre, şifre tekrarı bilgileri istenir.
<br>
:sweat_drops:	Tüm alanlar zorunludur. Kullanıcı bilgilendirilir.
<br>
:sweat_drops:	Mernis doğrulaması yapılarak sisteme kayıt gerçekleştirilir.
<br>
:sweat_drops:	Doğrulama geçerli değilse kullanıcı bilgilendirilir.
<br>
:sweat_drops:	Daha önce kayıtlı bir e-posta veya tcno var ise kayıt gerçekleşmez. Kullanıcı bilgilendirilir.
<br>
:sweat_drops:	Kayıdın gerçekleşmesi için e-posta doğrulaması gerekir.

---

## Madde 2 : İş verenler sisteme kayıt olabilmelidir.*

### Kabul Kriterleri:

:sweat_drops: Kayıt sırasında kullanıcıdan şirket adı, web sitesi, web sitesi ile aynı domaine sahip e-posta, telefon, şifre, şifre tekrarı bilgileri istenir. Burada amaç sisteme şirket olmayanların katılmasını engellemektir.
<br>
:sweat_drops: Tüm alanlar zorunludur. Kullanıcı bilgilendirilir.
<br>
:sweat_drops: Şirket kayıtları iki şekilde doğrulanır. Kayıdın gerçekleşmesi için e-posta doğrulaması gerekir. HRMS personelinin (bizim :)) onayı gerekmektedir.
<br>
:sweat_drops:Daha önce kayıtlı bir e-posta var ise kayıt gerçekleşmez. Kullanıcı bilgilendirilir.

---

## Madde 3 : Sisteme genel iş pozisyonu isimleri eklenebilmelidir. Örneğin Software Developer, Software Architect.*

### Kabul Kriterleri:
:sweat_drops:Bu pozisyonlar tekrar edemez. Kullanıcı uyarılır.

---

##  Madde 4 : İş verenler listelenebilmelidir. (Sadece tüm liste)*

---

## Madde 5 : İş arayanlar listelenebilmelidir. (Sadece tüm liste)*

---

## Madde 6 : İş pozisyonları listelenebilmelidir. (Sadece tüm liste)*

---

## Madde 7 : İş verenler sisteme iş ilanı ekleyebilmelidir.*

### Kabul Kriterleri:
- İş ilanı formunda;
 
:sweat_drops:Seçilebilir listeden (dropdown) genel iş pozisyonu seçilebilmelidir.(Örneğin Java Developer)(Zorunlu) 
<br>
:sweat_drops:İş tanımı girişi yapılabilmelidir. (Örneğin; firmamız için JAVA, C# vb. dillere hakim....)(Zorunlu)
<br>
:sweat_drops:Şehir bilgisi açılır listeden seçilebilmelidir. (Zorunlu)
<br>
:sweat_drops:Maaş skalası için min-max girişi yapılabilmelidir. (Opsiyonel)
<br>
:sweat_drops:Açık pozisyon adedi girişi yapılabilmelidir. (Zorunlu)
<br>
:sweat_drops:Son başvuru tarihi girişi yapılabilmelidir.

---

## Madde 8 : Sistemdeki tüm aktif iş ilanları listelenebilmelidir.*

### Kabul Kriterleri:
:sweat_drops:Liste, tablo formunda gelmelidir.
<br>
:sweat_drops:Listede firmadı, genel iş pozisyonu adı, açık pozisyon adedi, yayın tarihi, son başvuru tarihi bilgileri olmalıdır.

---

## Madde 9 : Sistemdeki tüm aktif iş ilanları tarihe göre listelenebilmelidir.*

### Kabul Kriterleri:
:sweat_drops:Liste, tablo formunda gelmelidir.
<br>
:sweat_drops:Listede firmadı, genel iş pozisyonu adı, açık pozisyon adedi, yayın tarihi, son başvuru tarihi bilgileri olmalıdır.

---

##  Madde 10 : Sistemde bir firmaya ait tüm aktif iş ilanları listelenebilmelidir.*

### Kabul Kriterleri:
:sweat_drops:Liste, tablo formunda gelmelidir.
<br>
:sweat_drops:Listede firmadı, genel iş pozisyonu adı, açık pozisyon adedi, yayın tarihi, son başvuru tarihi bilgileri olmalıdır.

---

##  Madde 11 : İş verenler sistemdeki bir ilanı kapatabilmelidir. (Pasif ilan)*

---

## Madde 12: Adaylar sisteme CV girişi yapabilmelidir.*

### Kabul Kriterleri:
:sweat_drops:Adaylar okudukları okulları sisteme ekleyebilmelidir. (Okul adı, bölüm)
<br>
:sweat_drops:Bu okullarda hangi yıllarda okuduklarını sisteme girebilmelidir.
<br>
:sweat_drops:Eğer mezun değilse mezuniyet yılı boş geçilebilmelidir.
<br>
:sweat_drops:Adayların okudukları okullar mezuniyet yılına göre tersten sıralanabilmelidir. Mezun olunmamışsa yine bu okul en üstte ve "devam ediyor" olarak görüntülenmelidir.
<br>
:sweat_drops:Adaylar iş tecübelerini girebilmelidir. (İş yeri adı, pozisyon)
<br>
:sweat_drops:Bu tecrübelerini hangi yıllarda yaptıklarını sisteme girebilmelidir.
<br>
:sweat_drops:Eğer hala çalışıyorsa işten ayrılma yılı boş geçilebilmelidir.
<br>
:sweat_drops:Adayların tecrübeleri yıla göre tersten sıralanabilmelidir. Hala çalışıyorsa yine bu tecrübesi en üstte ve "devam ediyor" olarak görüntülenmelidir.
<br>
:sweat_drops:Adaylar bildikleri yabancı dilleri sisteme girebilmelidir. ( Dil, Seviye -> 1-5)
<br>
:sweat_drops:Adaylar sisteme fotoğraf girebilmelidir. Adaya ait fotoğraf https://cloudinary.com/pricing sisteminde tutulacaktır. (Dış servis entegrasyonu) Ücretsiz hesabı kullanınız.
<br>
:sweat_drops:Adaylar sisteme github adreslerini girebilmelidir.
<br>
:sweat_drops:Adaylar sisteme linkedin adreslerini girebilmelidir.
<br>
:sweat_drops:Adaylar bildikleri programlama dillerini veya teknolojilerini sisteme girebilmelidir. (Programlama/Teknoloji adı) Örneğin; React
<br>
:sweat_drops:Adaylar sisteme ön yazı ekleyebilmelidir. (Örneğin: Çalışmayı çok severim....)

---

### *:desktop_computer: Madde 13 : Bir adaya ait tüm CV bilgisi görüntülenebilmelidir.*

---
<br>

## *Database image*
![image](https://github.com/merdemli/HRMS.PostgreSQL/blob/main/ERD_diagram_version3.png)


## *Backend - Swagger'da Görüntüsü*    

![swagger](https://user-images.githubusercontent.com/23256436/127566997-62b05863-f358-412c-af4a-e8937bc292ae.png)



## :toolbox: Kullanılan Teknolojiler 

<summary><strong><i> Lombok </i></strong></summary>

--- 

<summary><strong><i> Hibernate </i></strong></summary> 

---

<summary><strong><i> SpringDataJpa </i></strong></summary> 

---

<summary><strong><i> Spring Web </i></strong></summary>

---

<summary><strong><i> PostgreSql </i></strong></summary> 

---

<summary><strong><i> Swagger </i></strong></summary> 

---

<summary><strong><i> Cloudinary </i></strong></summary>

---


### Used Technologiese

- `PostgreSql` &emsp;&emsp;&emsp;&emsp;&emsp;`Spring Data JPA`&emsp;&emsp;&emsp;&emsp;&emsp; `Spring Hibernate Validator`
<br> <img src="https://upload.wikimedia.org/wikipedia/commons/2/29/Postgresql_elephant.svg" width="75" height="75"/>&emsp;&emsp;&emsp;&emsp;&emsp;<img src="https://raw.githubusercontent.com/ippontech/blog-usa/master/images/2017/11/boot-data.png" width="150" height="75"/>&emsp;&emsp;&emsp;&emsp;&emsp;<img src="https://hibernate.org/images/hibernate-logo.svg" width="150" height="75"/>

 
- `Spring Web`&emsp;&emsp;&emsp;&emsp;&emsp; `Swagger` &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;`Lombok` 
<br> <img src="https://2.bp.blogspot.com/-4FdDAKjbAvU/Vpvr1Rl9YfI/AAAAAAAABk0/U-VeLoHK7uo/s1600/photo.jpg" width="75" height="75"/>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;<img src="https://help.apiary.io/images/swagger-logo.png" width="75" height="75"/>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;<img src="https://www.javanibble.com/assets/images/feature-images/feature-image-lombok.png" width="150" height="75"/>

![image](https://github.com/merdemli/HRMS.PostgreSQL/blob/main/ERD_diagram_version3.png)

