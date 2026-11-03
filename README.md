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

# _______________________________________________________________

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
<img width="1920" height="1080" alt="Panel dan Layout" src="https://github.com/user-attachments/assets/f70e44c2-367c-4838-b621-ad95714f1d0e" />
<img width="1920" height="1080" alt="Panel dan Layout 2" src="https://github.com/user-attachments/assets/9b3b3b5a-904f-429b-a9ee-42b8809d3d2c" />

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

# _______________________________________________________________

# p05-event-handling

# Tabel Pengamatan
<img width="434" height="319" alt="Cuplikan layar 2026-10-23 212004" src="https://github.com/user-attachments/assets/4ee90b9f-0546-4466-b5a8-5a23a538ffca" />

# Eksperimen Praktikum 3
[Eksperimen Praktikum 3.txt](https://github.com/user-attachments/files/33900234/Eksperimen.Praktikum.3.txt)

1. Setelah saya hapus pemeriksaan ItemEvent.SELECTED dan menambahkan System.out.println("item berubah");, pesan tercetak 2 kali setiap saya mengganti pilihan. Ini terjadi karena Combo Box memicu itemStateChanged dua kali: sekali untuk pilihan lama yang dilepas (DESELECTED) dan sekali untuk pilihan baru yang dipilih (SELECTED).

2. Setelah saya ganti ke keyPressed, hasil yang tampil terlambat satu karakter. Misalnya saat saya mengetik 36, hasilnya masih menghitung 3. Penyebabnya, keyPressed dijalankan saat tombol baru ditekan, padahal hurufnya belum masuk ke isian, sehingga getText() masih membaca teks yang lama. Pada keyReleased, tombol sudah dilepas dan huruf sudah masuk, jadi teks yang dibaca sudah yang terbaru.

3. Setelah blok try dan catch saya hapus lalu saya mengetik huruf pada isian, di jendela Output muncul pesan error NumberFormatException. Aplikasi tidak tertutup, tetapi hasil di layar tidak berubah dan tidak ada pesan apa pun untuk pengguna. Ini menunjukkan bahwa try-catch diperlukan agar input yang salah bisa ditangani dengan pesan “Masukkan angka yang valid”.loading Eksperimen Praktikum 3.txt…]()

# Eksperimen Praktikum 4
[Eksperimen Praktikum 4.txt](https://github.com/user-attachments/files/33900236/Eksperimen.Praktikum.4.txt)

1. Setelah saya membuat event actionPerformed untuk kaliButton tanpa menghapus lambda, lalu menambahkan System.out.println("kali"); di kedua tempat, pesan “kali” tercetak 2 kali setiap tombol diklik. Hal ini terjadi karena tombol punya dua listener, satu dari GUI Builder dan satu dari lambda, dan keduanya dijalankan. Karena itu, satu tombol sebaiknya hanya memakai satu cara agar aksinya tidak berjalan dua kali dan kodenya tidak membingungkan.

2. Tab Design: saya menambahkan tombol baru bertuliskan % ke operatorPanel, mengubah Grid Layout panel itu dari 4 menjadi 5 kolom, lalu membuat event actionPerformed lewat klik kanan, Events, Action.
Tab Source: saya mengisi event handler dengan hitung('%');, lalu menambahkan case '%' -> a % b; pada switch di method hitung. Saya juga menyesuaikan pemeriksaan pembagian nol agar berlaku untuk %.

3. Setelah tombol Hapus ditekan, kursor langsung berada di isian pertama karena di akhir method hapus ada baris angka1Field.requestFocusInWindow();. Baris itu memindahkan fokus ke isian pertama, sehingga saya bisa langsung mengetik angka baru tanpa mengklik isian terlebih dahulu.
   
# FormAnggotaPerpustakaan: Peta Event (Pertemuan 5)

Event dibuat melalui klik kanan komponen, Events di GUI Builder.

| Komponen | Menu Events | Aksi |
|---|---|---|
| Kotak centang `setujuCheck` | Item: itemStateChanged | Tombol Daftar hanya aktif jika dicentang |
| Tombol Batal `batalButton` | Action: actionPerformed | Mengosongkan semua isian dan mengembalikan fokus ke NPM |
| Tombol Daftar `daftarButton` | Action: actionPerformed | Menampilkan ringkasan data dengan JOptionPane |
| Isian NPM `npmField` | Key: keyReleased | Label `digitLabel` menampilkan jumlah digit, misalnya "8 dari 10 digit" |
| Form (JFrame di Navigator) | Window: windowClosing | Meminta konfirmasi sebelum aplikasi ditutup |

## Pengaturan Properties
- `defaultCloseOperation` form: DO_NOTHING
- `enabled` tombol Daftar: tidak dicentang

# Events tombol Daftar
<img width="545" height="994" alt="Events tombol Daftar" src="https://github.com/user-attachments/assets/b5384c39-cef0-4336-b9a4-f9f934951bbe" />

# Layar dialog ringkasan
<img width="1920" height="1021" alt="Tampilan Dialog Ringkasan" src="https://github.com/user-attachments/assets/7ebd6675-360a-4c59-af23-9526feb9d263" />

# Layar dialog konfirmasi keluar
<img width="1920" height="1005" alt="Tampilan Dialog Konfirmasi Keluar" src="https://github.com/user-attachments/assets/17fcb787-366b-48a2-bd9e-758534e80b6b" />

## Deklarasi Penggunaan AI

**Alat yang dipakai:** Claude AI, Saya memakainya untuk meminta bantuan membuat kode untuk event `setujuCheck`, tombol Batal, tombol Daftar, isian NPM, dan konfrimasi aplikasi saat ditutup. Saya meminta kode dengan nama variabel yang belum diubah jadi saya mengetik sendiri dengan menyesuaikan nama variabel yang dibuat.

Selain itu, saya meminta bantuan mengatasi kendala Git: `git push` yang ditolak, penggabungan perubahan dengan `git pull`, dan pengembalian form Pertemuan 4 ke versi sebelum ditambah event (Awalnya saya menambah event langsung ke `FormAnggotaPerpustakaan` pertemuan 4 jadi saya ulang dengan menyalin file `FormAnggotaPerpustakaan` lalu menempel ke pertemuan 5 dan menambahkan event sesuai permintaan tugas).

Untuk bagian praktikum saya tidak mengalami kendala, dan modul yang diberikan sangat membantu saya menyelesaikan praktikum dan eksperimen, sehingga bagian tugas mandiri untuk menambahkan event saya dapat mengerjakan dengan baik, dan untuk mengisi bagian kode saya meminta bantuan dari AI.

# _______________________________________________________________

# p06-validasi-input

# Lembar Peer Review Heuristik
<img width="277" height="389" alt="Lembar_Peer_Review_Heuristik1" src="https://github.com/user-attachments/assets/71dc175c-74c7-40ea-9120-7431ba4d14c1" />
<img width="298" height="400" alt="Lembar_Peer_Review_Heuristik2" src="https://github.com/user-attachments/assets/e22f2871-94f7-4b0e-9262-a77164d50f8f" />
<img width="295" height="372" alt="Lembar_Peer_Review_Heuristik3" src="https://github.com/user-attachments/assets/8188f68a-1122-4975-8a29-bfe2aea7fff3" />

# Tabel Temuan dan Perbaikan
<img width="391" height="403" alt="Tabel Temuan dan Perbaikan" src="https://github.com/user-attachments/assets/5cff1350-33cc-4c41-a6d8-5797b927e5e8" />

# Tangkapan layar form dengan pesan kesalahan
<img width="1920" height="1013" alt="Pesan Error" src="https://github.com/user-attachments/assets/2598f35d-fdd6-48ce-b547-357d94b0544b" />

# Tangkapan layar jendela Navigator yang memperlihatkan label pesan
<img width="959" height="502" alt="Menampilkan Label Pesan" src="https://github.com/user-attachments/assets/c5c8c136-042c-4443-b2fe-c9a9718b3a12" />

# Jawaban Eksperimen Praktikum 4 Pertemuan 6
[Eksperimen Pertemuan 6.txt](https://github.com/user-attachments/files/34235170/Eksperimen.Pertemuan.6.txt)

1.
if (!Character.isDigit(evt.getKeyChar()) || penuh) {
    evt.consume();
}

Karena huruf bukan digit, kondisi !Character.isDigit(...) bernilai benar. Lalu evt.consume() membatalkan event ketikan itu sehingga karakternya tidak dimasukkan ke isian. Kondisi penuh juga membatasi NPM maksimal 10 digit.

2. Pesan muncul saat isian kehilangan fokus, yaitu ketika Tab ditekan dan fokus pindah ke isian berikutnya. Itu dipicu event focusLost pada emailField, yang memanggil periksaEmail() karena isiannya tidak kosong. Hasilnya muncul garis merah dan pesan “Format email belum benar, contoh: nama@contoh.com”.

3.
if (!namaField.getText().isBlank()) {
    periksaNama();
}

Isian yang kosong baru diperiksa saat tombol Daftar diklik. Tujuannya agar pengguna tidak langsung dianggap salah hanya karena melewati isian.

4. Fokus pindah ke NPM. Method daftar() memeriksa semua isian dan memasukkan yang salah ke daftar salah sesuai urutan NPM, Nama, Program Studi, Email, HP. Lalu salah.get(0).requestFocusInWindow() memberi fokus ke yang pertama di daftar, yaitu npmField. Muncul juga ringkasan “5 isian perlu diperbaiki”.

5. Fokus pindah ke isian Nama Lengkap (namaField). Yang mengaturnya dua properti pada namaLabel, displayedMnemonic bernilai N, yang membuat Alt+N dikenali dan labelFor yang menunjuk ke namaField, sehingga fokus diteruskan ke isian itu.

6. Ya, data tetap ada. Form tidak dikosongkan karena dikendalikan oleh method batal(). Ketika dialog konfirmasi dijawab bukan “Ya”, method langsung berhenti dengan return sebelum sampai ke kosongkan():

java
if (jawab != JOptionPane.YES_OPTION) {
    return;
}

# Deklarasi AI
[Deklarasi AI.txt](https://github.com/user-attachments/files/34235193/Deklarasi.AI.txt)

Saya menggunakan Claude AI untuk perbaikan berdasarkan peer review dari teman dan menuliskan contoh kode perbaikannya. Perbaikan yang saya terapkan dan commit sendiri adalah: mengisi text label pesan dengan satu spasi agar kolom Alamat tidak menciut, menambah label keterangan wajib diisi, menambah tooltip pada tombol Daftar, menjadikan Tidak sebagai pilihan awal konfirmasi Batal, mengubah tombol dialog menjadi Ya/Tidak yang sebelumnya menggunakan Yes/No, dan membuat Enter memindahkan fokus ke isian berikutnya. Seluruh perbaikan sudah saya uji dan tercatat pada tabel temuan dengan commit c46e528.

Untuk bagian praktikum saya mengerjakan mengikuti panduan di modul, lalu untuk latihan mandiri form Anggota Perpustakaan saya mengikuti praktikum Form Anggota

# _______________________________________________________________

# p07-mini-proyek

# Tautan video demo mini-proyek
https://drive.google.com/file/d/1JTwY2YjSbbiHaDip2ZAfDlXBIsPmdKxu/view?usp=sharing

# Deklarasi AI
[Deklarasi AI.txt](https://github.com/user-attachments/files/34236074/Deklarasi.AI.txt)

Saya menggunakan Claude AI

Untuk urutan langkah mini proyek saya mengikuti contoh Aplikasi Kontak, termasuk cara menyusun komponen di tab Design, mengisi properti Custom code, dan membuat event.

Claude AI membantu saya memberi contoh kode untuk `StatusBuku`, `Buku`, `BukuTableModel`, `DialogBuku`, dan `AplikasiKatalog`, mengikuti pola contoh Aplikasi Kontak pada modul. Kode itu saya salin dan merapikan ke NetBeans, lalu saya sesuaikan dengan komponen yang saya buat sendiri di GUI Builder.

Saya juga mengalami kesulitan di bagian commit bertahap, sehingga meminta bantuan Claude untuk menyelesaikannya. Claude membantu menjelaskan cara membagi pekerjaan menjadi beberapa commit, menyarankan pesan commit, dan membantu mengatasi `git push` yang ditolak. Perintah Git saya jalankan sendiri di Command Prompt, lalu hasilnya saya periksa dengan `git status`, `git log`, dan tampilan repository di GitHub.

# _______________________________________________________________

# p07-tabel-dan-menu

# Jawaban Eksperimen Praktikum 5 Pertemuan 7
[Uploading Eksperimen Pertemuan 7.txt…]()

1. tabel tidak langsung berubah. Kontak baru sudah masuk ke daftar, tetapi JTable tidak diberi tahu, jadi tidak menggambar ulang. Label status juga bisa tidak cocok, misalnya “Menampilkan 5 dari 6 kontak”. Baris baru baru muncul setelah ada aksi lain yang memaksa tabel memuat ulang, misalnya mengetik di kotak cari.

2. Setelah pencarian “ah”, Ahmad Fauzi berada di baris tampilan 1, tetapi baris 1 di model adalah Budi Santoso. Tanpa convertRowIndexToModel, nomor baris tampilan dipakai langsung sebagai nomor baris model. Jadi jika memilih Yes, kontak yang terhapus adalah Budi Santoso, bukan Ahmad Fauzi.

3. Jendela utama tetap bisa diklik saat dialog terbuka, dan kontak yang ditambahkan tidak muncul di tabel. Penyebabnya, dialog tidak lagi modal sehingga setVisible(true) tidak menunggu dialog ditutup, dan tampilkan() langsung mengembalikan null. Hal ini membuat tambah() mengira pengguna membatalkan.

4. Ctrl+E dan Ctrl+D tidak bekerja karena ubahItem dan hapusItem dinonaktifkan oleh perbaruiTombol() saat tidak ada baris yang dipilih. Item menu yang nonaktif tidak menjalankan aksinya, termasuk lewat accelerator. Ctrl+N tetap bekerja karena tambahItem selalu aktif.

5. Baris hapusItem.setAccelerator(...) di initComponents() berubah: VK_D diganti VK_DELETE, dan CTRL_DOWN_MASK diganti 0 karena Ctrl tidak lagi dipakai. Ini terjadi karena properti Design ditulis NetBeans sebagai kode Java di initComponents().

6. Muncul IllegalArgumentException: Cannot set a null TableModel. initComponents() dipanggil di awal konstruktor dan menjalankan kontakTable.setModel(model), padahal model masih null karena baru dibuat sesudahnya. Karena itu atribut model harus sudah dibuat saat dideklarasikan, sebelum initComponents() berjalan.


