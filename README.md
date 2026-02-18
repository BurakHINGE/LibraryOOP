# LibraryOOP# Personal Library Tracker

![Java](https://img.shields.io/badge/Java-17+-orange) ![MIT License](https://img.shields.io/badge/License-MIT-green)

---

## 📌 Sürüm Bilgisi | Version Info  
 ● Current Version: 1.0.2
 ● Geçerli Sürüm: 1.0.2

---
 
| Language / Dil | Status / Durum |
|---------------|----------------|
| English | Coming Soon |
| Türkçe | ✅ |

---

## 🇬🇧 English

This project is a **console-based personal library tracking system** developed using Java and Object-Oriented Programming (OOP) principles.  
Multiple users can register and log into the system, add books they have read, and view their personal reading lists.

Each user manages their own books independently, and all data is stored persistently using a JSON file.  
Whenever a book is added, the system automatically saves the updated data.

The project focuses on practicing:

- Object-Oriented Programming (OOP)
- Class responsibility separation
- JSON-based data persistence
- Console-based application flow

---

# ✨ Features

- 👤 User registration system  
- 🔐 Secure login mechanism  
- 📚 Personal book list for each user  
- ➕ Add books with title and author  
- 📖 View saved books anytime after login  
- 💾 Persistent data storage using JSON  
- 🗂 Automatic JSON file creation if it does not exist  
- 🧱 Object-Oriented design (Library, User, Book classes)

---

# 🚀 Usage

## 🟢 macOS / Linux

### Compile
```bash
javac -cp ".:lib/json.jar" Codes/*.java
```
### Run
```bash
java -cp ".:lib/json.jar:Codes" MainLibrary
```

## 🟢 Windows

### Compile
```bash
javbash
javac -cp ".;lib/json.jar" Codes\*.java
```
### Run
```bash
java -cp ".;lib/json.jar;Codes" MainLibrary
```

---

## 🇹🇷 Türkçe

Bu proje, Java ve Nesne Yönelimli Programlama (OOP) prensipleri kullanılarak geliştirilmiş **konsol tabanlı kişisel kütüphane takip sistemidir**.  
Birden fazla kullanıcı sisteme kayıt olabilir, giriş yapabilir ve okudukları kitapları kendi hesaplarına ekleyebilir.

Her kullanıcı kendi kitap listesini bağımsız olarak yönetir ve tüm veriler JSON dosyası kullanılarak kalıcı olarak saklanır.  
Her kitap eklendiğinde sistem otomatik olarak verileri JSON dosyasına kaydeder.

Projenin amacı:

- OOP tasarım pratiği yapmak
- Sınıf sorumluluklarını doğru ayırmak
- JSON ile veri kalıcılığı sağlamak
- Konsol tabanlı uygulama mantığını öğrenmek

---

## ✨ Özellikler

- 👤 Kullanıcı kayıt sistemi  
- 🔐 Güvenli giriş mekanizması  
- 📚 Her kullanıcı için kişisel kitap listesi  
- ➕ Kitap adı ve yazar bilgisi ekleme  
- 📖 Giriş yaptıktan sonra kayıtlı kitapları görüntüleme  
- 💾 JSON ile kalıcı veri saklama  
- 🗂 JSON dosyası yoksa otomatik oluşturma  
- 🧱 Nesne Yönelimli Programlama tasarımı (Library, User, Book sınıfları)

---

## 🟢 macOS / Linux

### Derleme
```bash
javac -cp ".:lib/json.jar" Codes/*.java
```
### Çalıştırma
```bash
java -cp ".:lib/json.jar:Codes" MainLibrary
```

## 🟢 Windows

### Derleme
```bash
javbash
javac -cp ".;lib/json.jar" Codes\*.java
```
### Çalıştırma
```bash
java -cp ".;lib/json.jar;Codes" MainLibrary
```

---

## 📌 Version History / Sürüm Geçmişi

| Version | Date       | Description |
|--------:|------------|-------------|
| v1.0.2  | 2026-02-18 | Automatically capitalize the first letter of book and author names / Kitap ve yazar adlarının ilk harflerini otomatik büyütme eklendi|
| v1.0.1  | 2026-02-17 | Checking password method has been created / Parola kontrolü metodu oluşturuldu |
| v1.0.0  | 2026-02-14 | Initial release / İlk sürüm |

---

