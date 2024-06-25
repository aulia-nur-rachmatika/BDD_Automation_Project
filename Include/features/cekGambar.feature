Feature: Validasi Gambar pada Jawaban

Scenario Outline: : Validasi Gambar
	Given  Mahasiswa membuka login page
	When Mahasiswa mengisi <email> dan <password> yang valid 
	And Mahasiswa klik button login
	Then Mahasiswa masuk ke halaman sistem
	Given Mahasiswa berhasil masuk sistem
	When Mahasiswa akses ujian 
	Then Mahasiswa akses soal ujian
	And Mahasiswa melihat pertanyaan ujian
	Then Mahasiswa klik soal halaman berikutnya hingga menemukan soal isian
	And Lampirkan gambar
	Then Klik refresh
	And Gambar harus tetap ada
		Examples:
	| email | password |
	|asepridwan9322@gmail.com|ddmdYD2a8hdKfVC4Zj6UaA==|
	


	
	