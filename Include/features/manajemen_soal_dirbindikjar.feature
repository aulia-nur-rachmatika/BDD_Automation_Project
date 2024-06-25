Feature: Manajemen Soal Oleh Dirbindikjar

Scenario Outline: Dirbindikjar mengelola bank soal dan jadwal ujian 
Given Dirbindikjar masuk ke halaman login
When Dirbindikjar memasukkan <email> dan <password> yang valid 
And Dirbindikjar klik tombol login
Then Dirbindikjar berhasil masuk ke sistem 
When Dirbindikjar mengunggah bank soal ujian
Then Isi Judul, Jurusan, Prodi, Mata kuliah, Dosen utama dan Dosen cadangan
And Import soal
Then Bank soal   berhasil disimpan dalam sistem 

Examples:
	| email | password |
	| aulianurrachmatika02@gmail.com |HXRQlBZtILolxFVf9q2LbQ==|

	
	