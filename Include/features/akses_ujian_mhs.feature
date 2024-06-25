Feature: Akses Ujian Mahasiswa

Scenario Outline: : Mahasiswa mengakses ujian sesuai jadwal 
	Given  Mahasiswa membuka halaman login 
	When Mahasiswa memasukkan <email> dan <password> yang valid 
	And Mahasiswa klik tombol login
	Then Mahasiswa diarahkan ke halaman sistem
	Given Mahasiswa telah berhasil masuk ke dalam sistem
	When Mahasiswa mencoba untuk mengakses ujian 
	Then Mahasiswa harus mengakses soal ujian sesuai jadwal yang ditentukan 
	And Mahasiswa harus melihat pertanyaan ujian yang dapat dijawab
	
		Examples:
	| email | password |
	|asepridwan9322@gmail.com|ddmdYD2a8hdKfVC4Zj6UaA==|
	


	
	