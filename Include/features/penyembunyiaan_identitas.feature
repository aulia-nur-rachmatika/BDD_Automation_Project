Feature: Penyembunyian Identitas Mahasiswa
Scenario Outline: Saat proses pengoreksian oleh Dosen, identitas mahasiswa disembunyikan 
	Given  Dosen akses halaman login
	When Dosen mengisi <email> dan <password> yang valid 
	And klik tombol login
	Then Dosen masuk ke halaman sistem
	Given Dosen berhasil masuk
	Then Dosen memilih menu Penilaian CBT kemudian pilih Dosen
	And Terdapat ujian mahasiswa
	When Dosen memilih jawaban dari mahasiswa
	And Identitas mahasiswa tidak boleh terlihat oleh Dosen 
	
		Examples:
	| email | password |
	|arhasbi@gmail.com|iIwExHMbOKfngxcHqHi3Fg==|
	


	
	
 

	