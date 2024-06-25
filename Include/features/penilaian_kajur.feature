Feature: Penilaian oleh Ketua Jurusan

Scenario Outline: : Ketua Jurusan menilai ujian mahasiswa 
	Given  Ketua Jurusan membuka halaman login 
	When Ketua Jurusan memasukkan <email> dan <password> yang valid 
	And Ketua Jurusan klik tombol login
	Then Ketua Jurusan diarahkan ke halaman sistem
	Given Ketua Jurusan memilih menu penilaian cbt
	And Ketua Jurusan memilih menu Ketua Jurusan
	When Terdapat jawaban dari mahasiswa sesuai jurusan
	And Pilih jawaban mahasiswa dan terdapat tanda membutuhkan validasi Ketua Jurusan
	Then Memberikan penilaian jika terdapat tanda centang validasi
	And Nilai berhasil disimpan

		Examples:
	| email | password |
	|harnyotota2@gmail.com|B4DlBxvXJ9A2etqy0aO9hw==|
	


	
	