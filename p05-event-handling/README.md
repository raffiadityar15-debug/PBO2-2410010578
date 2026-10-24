# P05 — Event Handling

## Deskripsi
Project ini merupakan tugas Praktikum PBO 2 Pertemuan 5 tentang Event Handling menggunakan Java Swing dan NetBeans GUI Builder.

## Peta Event Form Anggota Perpustakaan

| No. | Komponen | Jenis Event | Fungsi |
|---|---|---|---|
| 1 | Checkbox Setuju | `itemStateChanged` | Mengaktifkan tombol Daftar ketika dicentang dan menonaktifkannya ketika tidak dicentang. |
| 2 | Tombol Batal | `actionPerformed` | Menampilkan konfirmasi pembatalan, kemudian mengosongkan form jika disetujui. |
| 3 | Tombol Daftar | `actionPerformed` | Memvalidasi data anggota dan menampilkan hasil pendaftaran. |
| 4 | Kolom NPM | `keyReleased` | Memperbarui penghitung jumlah digit NPM saat pengguna mengetik. |
| 5 | Form Utama | `windowClosing` | Menampilkan konfirmasi sebelum aplikasi ditutup. |

## Komponen Form
- NPM
- Nama
- Program Studi
- Jenis Anggota
- Email
- Nomor HP
- Alamat
- Persetujuan
- Tombol Daftar dan Batal

## File Project
Project ini menggunakan Maven dan Java Swing. File `.java` berisi kode program, sedangkan file `.form` menyimpan rancangan GUI dari NetBeans.

## Pengujian
Pengujian dilakukan dengan mencoba validasi data, checkbox persetujuan, penghitung digit NPM, pembatalan pendaftaran, serta konfirmasi keluar aplikasi.
