# Enigma-M3
Enigma-M3 merupakan program yang menggunakan bahasa Java berbasis GUI yang dapat mengenkripsikan 26 huruf alfabet seperti mesin Enigma M3 yang digunakan oleh pasukan Jerman pada Perang Dunia Kedua.


# Requirements
1. Java 19
2. Maven


# How To Use
Untuk menjalankan program, dapat mengikuti langkah-langkah berikut:
1. Buka terminal pada root folder (directory dimana ```pom.xml``` berada).
2. Ketikkan ```mvn package``` dan tekan enter.
3. Setelah maven selesai membangun program, ketikkan ```java -jar target/Enigma-M3-1.0.jar``` dan tekan enter.

Setelah itu, akan muncul sebuah GUI seperti berikut:

![image](docs/images/image1.png?raw=true)

Untuk mengenkripsi, cukup tekan huruf yang ingin dienkripsi pada GUI. Lampboard akan menyala pada huruf sesuai hasil enkripsi.

![image](docs/images/image2.png?raw=true)

Untuk menggeser huruf rotor, tekan tombol di atas atau di bawah huruf rotor.

![image](docs/images/image3.png?raw=true)

Untuk menampilkan langkah-langkah enkripsi, tekan tombol Show Process di bawah text box output.

![image](docs/images/image4.png?raw=true)

Text box process dapat disembunyikan dengan mengeklik tombol Hide Process. Untuk membersihkan input dan output text box tekan tombol Clear di bawah text box output.

![image](docs/images/image5.png?raw=true)

Untuk mengubah plugboard, tekan tombol Plugboard. Akan muncul tampilan pop up seperti berikut:

![image](docs/images/image6.png?raw=true)

Untuk menghubungkan huruf, tekan huruf yang ingin dihubungkan. Untuk memutuskan huruf, klik huruf yang ingin diputuskan.

![image](docs/images/image7.png?raw=true)

Untuk mengubah konfigurasi rotor dan posisi awal rotor, dapat mengeklik tombol Setting. Akan muncul tampilan pop up seperti berikut:

![image](docs/images/image8.png?raw=true)

Ubah pengaturan sesuai yang diinginkan, lalu klik save untuk menyimpan pengaturan tersebut.


# Author
Muhammad Equilibrie Fajria (13521047)
