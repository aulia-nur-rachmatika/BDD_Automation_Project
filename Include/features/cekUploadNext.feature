Feature: Validasi Gambar pada Jawaban setelah klik next

Scenario Outline: : Validasi Gambar setelah next
	Given  Mahasiswa membuka login
	When Mahasiswa isi <email> dan <password> yang valid 
	And Mahasiswa klik btn login
	Then Mahasiswa ke halaman sistem
	Given Mahasiswa berhasil masuk
	When Mahasiswa buka ujian 
	Then Mahasiswa membuka soal ujian
	And Mahasiswa melihat terdapat pertanyaan ujian
	Then Mahasiswa klik soal halaman selanjutnya hingga menemukan soal isian
	And Upload Gambar
	Then Klik pertanyaan selanjutnya
	And Klik kembali ke pertanyaan yang baru di upload gambar
	And Gambar harus terlihat
		Examples:
	| email | password |
	|asepridwan9322@gmail.com|ddmdYD2a8hdKfVC4Zj6UaA==|
	


	
	