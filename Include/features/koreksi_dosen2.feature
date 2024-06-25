Feature: Akses Ujian Mahasiswa

Scenario Outline: : Dosen Mengoreksi Hasil Ujian Mahasiswa
	Given  Dosen membuka halaman login 
	When Dosen memasukkan <email> dan <password> yang valid 
	And Dosen klik tombol login
	Then Dosen diarahkan ke halaman sistem
	Given Dosen berhasil masuk ke dalam sistem
	Then Dosen klik menu Penilaian CBT kemudian pilih Dosen
	And Terdapat ujian mahasiswa yang perlu dinilai 
	When Dosen memilih ujian yang akan dinilai 
	And Dosen memberikan penilaian pada setiap pertanyaan 
	Then Dosen harus dapat menyimpan hasil penilaian dengan sukses 
	

		Examples:
	| email | password |
	|arhasbi@gmail.com|iIwExHMbOKfngxcHqHi3Fg==|
	


	
	