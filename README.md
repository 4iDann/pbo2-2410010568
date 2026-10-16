[Jawaban Pertanyaan Refleksi.txt](https://github.com/user-attachments/files/33547021/Jawaban.Pertanyaan.Refleksi.txt)# p03-komponen-gui

# Output Jendela Navigator
<img width="644" height="432" alt="Jendela Navigator" src="https://github.com/user-attachments/assets/3a80471e-4441-48da-8d23-48352067bb7e" />

# Output Tema Gelap
<img width="1920" height="1080" alt="Keluaran Tema Gelap" src="https://github.com/user-attachments/assets/3746e5d7-bfb1-49d4-856b-5dcd6067daca" />

# Output Tema Terang
<img width="1920" height="1080" alt="Keluaran Tema Terang" src="https://github.com/user-attachments/assets/682e66f4-49d4-443d-95d6-ce031ffc0b97" />

# Jawaban Pertanyaan Refleksi Singkat
[UploadinNama : Muhammad Ajidannor Rahman
NPM : 2410010568
Kelas : 5C 

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

