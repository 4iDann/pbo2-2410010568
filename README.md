# p03-komponen-gui

# Output Jendela Navigator
<img width="644" height="432" alt="Jendela Navigator" src="https://github.com/user-attachments/assets/3a80471e-4441-48da-8d23-48352067bb7e" />

# Output Tema Gelap
<img width="1920" height="1080" alt="Keluaran Tema Gelap" src="https://github.com/user-attachments/assets/3746e5d7-bfb1-49d4-856b-5dcd6067daca" />

# Output Tema Terang
<img width="1920" height="1080" alt="Keluaran Tema Terang" src="https://github.com/user-attachments/assets/682e66f4-49d4-443d-95d6-ce031ffc0b97" />

# Jawaban Pertanyaan Refleksi Singkat
Nama : Muhammad Ajidannor Rahman
NPM : 2410010568
Kelas : 5C 

[Jawaban Pertanyaan Refleksi.txt](https://github.com/user-attachments/files/33547021/Jawaban.Pertanyaan.Refleksi.txt)

1.
a) Top-level container adalah wadah paling luar yang menjadi "jendela" aplikasi. Ia langsung berinteraksi dengan sistem operasi dan setiap hierarki komponen Swing harus punya satu di akarnya. Contoh: JFrame (juga JDialog, JApplet).
b) Intermediate container adalah wadah perantara yang berada di dalam top-level container dan berfungsi mengelompokkan serta mengatur tata letak komponen lain. Contoh: JPanel (juga JScrollPane, JTabbedPane).
c) Atomic component adalah komponen paling dasar yang berdiri sendiri, tidak berfungsi untuk menampung komponen lain, dan menjadi tempat interaksi langsung dengan pengguna atau penampil data. Contoh: JButton (juga JLabel, JTextField, JCheckBox).

2. JRadioButton secara bawaan berdiri sendiri, sehingga beberapa radio button bisa terpilih bersamaan. Dengan memasukkannya ke ButtonGroup yang sama, Swing menjamin hanya satu tombol dalam grup yang bisa terpilih pada satu waktu: saat satu dipilih, yang lain otomatis tidak terpilih. Ini sesuai sifat pilihan yang saling eksklusif, misalnya jenis kelamin "Laki-laki" atau "Perempuan".

3.Pilih JComboBox ketika:
- pilihan jumlahnya banyak (misalnya daftar provinsi, kota, atau program studi), karena radio button akan memakan banyak ruang pada form;
- daftar pilihan bisa berubah atau dimuat secara dinamis (misalnya dari database);
- ruang tampilan terbatas.

Pilih JRadioButton ketika pilihannya sedikit (sekitar 2-4), dan Anda ingin semua opsi langsung terlihat sekaligus sehingga pengguna dapat memilih dengan satu klik tanpa membuka dropdown.

4. Method initComponents() dibuat dan dikelola otomatis oleh GUI Builder NetBeans (ditandai blok abu-abu/terkunci, "Generated Code"). Setiap kali desain diubah di mode Design, NetBeans akan menulis ulang seluruh isi method ini, sehingga perubahan manual akan hilang atau bahkan merusak sinkronisasi antara desain dan kode.

Kode tambahan sebaiknya ditulis:
- di konstruktor, setelah pemanggilan initComponents() (misalnya mengatur nilai awal, mengisi ComboBox, atau mengatur lokasi form);
- di event handler (misalnya jButtonActionPerformed);
- atau di method buatan sendiri di luar blok generated code.

5. Look and Feel diterapkan saat komponen Swing dibuat (UI delegate-nya dipasang pada saat instansiasi). Jika FlatLightLaf.setup() dipanggil setelah form dibuat, komponen yang sudah ada tetap memakai tampilan lama (misalnya Metal atau Nimbus) sehingga tema tidak berlaku, atau tampilan menjadi tidak konsisten. Karena itu, setup() harus dipanggil lebih dulu, biasanya di awal method main() sebelum new MainForm().setVisible(true) (di dalam EventQueue.invokeLater).g Jawaban Pertanyaan Refleksi.txt…]()

# ____________________________________________________________________________

# p04-layout-manager

# Jawaban Pertanyaan Refleksi
Nama : Muhammad Ajidannor Rahman
NPM : 2410010568
Kelas : 5C 

[Jawaban Pertanyaan Refleksi Pertemuan 4.txt](https://github.com/user-attachments/files/33548337/Jawaban.Pertanyaan.Refleksi.Pertemuan.4.txt)

1. Karena posisi dan ukuran komponen ditentukan secara manual sehingga tampilan sulit menyesuaikan ukuran jendela dan resolusi layar. Akibatnya, komponen dapat bertumpuk atau terpotong.

2. FlowLayout menyusun komponen secara berurutan dan memindahkan komponen ke baris berikutnya jika ruang tidak cukup. GridLayout membagi area menjadi baris dan kolom dengan ukuran sel yang sama, sehingga komponen menyesuaikan ukuran saat jendela dilebarkan.

3. Weight X: Menentukan pembagian ruang horizontal tambahan untuk komponen ketika ukuran jendela diperbesar.
Fill: Menentukan apakah komponen mengisi ruang sel yang tersedia, baik secara horizontal (HORIZONTAL), vertikal (VERTICAL), keduanya (BOTH), atau tidak sama sekali (NONE).

4. formPanel dibungkus isiPanel agar komponen form dapat dikelompokkan dan diatur dengan lebih rapi. Penempatan isiPanel di posisi North menggunakan BorderLayout membuat form berada di bagian atas jendela, sehingga area lainnya dapat digunakan untuk komponen lain.

5. Konsistensi: Label, kolom input, dan tombol disusun dengan pola yang seragam sehingga form mudah dipahami.
Alignment (perataan): Label dan kolom input disejajarkan menggunakan layout manager agar tampilan rapi dan terstruktur.

# Form Sketsa
<img width="2064" height="2934" alt="Form Sketsa" src="https://github.com/user-attachments/assets/63c614eb-e887-488a-9bc5-49606e149c0e" />

# Tabel Rancangan
<img width="499" height="154" alt="Tabel Rancangan" src="https://github.com/user-attachments/assets/91eb94d4-a5d1-4ec0-a5b2-abd65e63eebe" />

# Output Ukuran Awal
<img width="1920" height="1080" alt="Output Ukuran Awal" src="https://github.com/user-attachments/assets/0252020e-c814-46db-b958-8ebd7ab10cf4" />

# Output Ukuran Lebar
<img width="1920" height="1080" alt="Output Ukuran Lebar" src="https://github.com/user-attachments/assets/48c0c81f-cac3-4eb0-9099-040743395134" />

# Panel dan Layout
<img width="764" height="416" alt="Panel dan Layout 1" src="https://github.com/user-attachments/assets/31179485-1676-44e8-b81d-2ea0acaa8c3b" />
<img width="770" height="428" alt="Panel dan Layout 2" src="https://github.com/user-attachments/assets/19df4f55-af74-4fac-ba87-389eaca38bb1" />

# Eksperimen Praktikum 2

[Eksperimen 2.txt](https://github.com/user-attachments/files/33551004/Eksperimen.2.txt)

1. Waktu Alignment flowPanel diubah ke Center, tombol-tombolnya pindah ke tengah, tidak lagi di kiri. Kalau jendela dikecilkan, tombol yang tidak muat turun ke baris bawah, dan tiap baris tetap di tengah. Baris kode yang berubah adalah baris setLayout, dari FlowLayout.LEFT menjadi FlowLayout.CENTER.

2. Hasilnya 5 baris. Kalau Rows diisi 0, Java menghitung sendiri jumlah barisnya. Ada 9 tombol dan 2 kolom, jadi tombol dibagi dua-dua: 4 baris penuh, lalu 1 baris sisa yang hanya berisi tombol 9.

3. Tombol jadi melebar sampai memenuhi lebar panel, dan ikut melebar kalau jendela dilebarkan, sehingga semua tombol sama lebar. Sebelumnya tombol hanya selebar tulisannya.


# Eksperimen Praktikum 4

[Eksperimen 4.txt](https://github.com/user-attachments/files/33551013/Eksperimen.4.txt)

1. Kalau hanya namaField yang diubah ke 0.0, tidak terlalu kelihatan bedanya, karena isian lain masih 1.0 dan kolomnya tetap melebar bersama.

2. Saat diatur ke North, form tetap menempel di bawah header walau jendela ditinggikan. Tetapi saat diatur Center, form memakai seluruh sisa tinggi, jadi barisnya bergeser atau merenggang dan terlihat jauh dari header.

3. Yang rusak lebih dulu tombol Batal dan Simpan, karena tombolnya turun ke baris kedua tapi tempatnya tidak bertambah tinggi, jadi terpotong. Setelah itu label dan isian menyempit, dan judul di header ikut terpotong.

# Dinilai oleh Muhammad Arsyad (2410010620)
<img width="494" height="268" alt="Di Nilai" src="https://github.com/user-attachments/assets/8f12aec9-44f6-494e-89d3-932487753f35" />

# Deklarasi AI

[Deklarasi AI.txt](https://github.com/user-attachments/files/33556091/Deklarasi.AI.txt)

AI yang saya gunakan yaitu Claude AI

1. Saya sempat bingung pada praktikum 3 (Sebagai lanjutan praktikum 2 atau untuk praktikum 4), sehingga bertanya pada AI di praktikum mana saya perlu praktikkan. Saya juga melampirkan screenshot praktikum 2 dan 4

2. Lalu pada bagian radio button (Mahasiswa, Dosen, Umum) di form Anggota Perpustakaan, saat saya susun jaraknya berjauhan dan saya meminta bantuan AI untuk solusi agar dapat mengatasi masalah tersebut. Lalu saya mengirimkan hasil screenshot yang menampilkan radio button berjarak jauh.

Jadi saya bertanya pada Claude AI dengan prompt :

1. Saya bingung dengan Praktikum 3 apakah ini lanjutan Praktikum 2 (GaleriLayout) atau dipraktikkan di Praktikum 4 (FormBiodata)? Tolong jelaskan hubungan ketiga praktikum itu berdasarkan isi screenshort yang saya lampirkan, lalu sebutkan di praktikum mana saya harus benar-benar membuat form dan mengisi constraint GridBagLayout.

2. Bantu saya mengatasi masalah pada radio button yang jaraknya berjauhan seperti di screenshort agar menjadi berdekatan dan sejajar

Setelah membaca penjelasan (untuk pertanyaan 1) dari Claude AI, saya memahami bahwa Praktikum 3 berisi teknik GridBagLayout yang dipraktikkan pada pembuatan FormBiodata di Praktikum 4.

Setelah membaca penjelasan (untuk pertanyaan 2) dari Claude AI, saya dibantu dan disuruh praktik untuk membuat panel baru (jenisPanel) dengan set layout (flow layout) dengan mengatur properties bagian Allignment (Left), HGap (5), VGap (0), lalu bagian radio button yang awalnya di dalam formPanel saya pindahkan ke dalam jenisPanel sehingga berhasil.

Untuk praktikum 1 saya tidak bertanya kepada AI karena sudah beberapa kali membuat Project baru sehingga sudah terbiasa, Praktikum 2 dan 4 saya mengerjakan mengikuti Langkah-langkah di modul yang diberikan dan itu sudah cukup membantu saya untuk menyelesaikannya tanpa perlu banyak bertanya pada AI, untuk membuat sketsa dan desain di NetBeans form Anggota Perpustakaan saya mengikuti bentuk tampilan seperti form Biodata dan mengatur GridBagLayout mengikuti praktikum 3.



