Feature: Presentase Mahasiswa

Scenario Outline: : Presentase progres ujian
	Given  Mahasiswa akses login page
	When Mahasiswa masukkan <email> dan <password> yang valid 
	And Mahasiswa klik login
	Then Mahasiswa diarahkan masuk ke halaman sistem
	Given Mahasiswa berhasil masuk ke sistem
	When Mahasiswa mengakses ujian 
	Then Mahasiswa mengakses soal ujian sesuai jadwal yang ditentukan 
	And Mahasiswa melihat pertanyaan ujian yang dapat dijawab seteleh memulai soal
	Then Mahasiswa klik soal halaman berikutnya
	And Presentase berubah
	Then Klik halaman berikutnya
	And Presentase berubah dan berhasil
	
		Examples:
	| email | password |
	|asepridwan9322@gmail.com|ddmdYD2a8hdKfVC4Zj6UaA==|
	


	
	