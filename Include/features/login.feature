Feature: Login Pengguna

Scenario Outline: Pengguna masuk ke dalam sistem 
	Given  Pengguna membuka halaman login 
	When Pengguna memasukkan <email> dan <password> yang valid 
	And Pengguna klik tombol login
	Then Pengguna diarahkan ke halaman sistem
	
	Examples:
	| email | password |
	| aulianurrachmatika02@gmail.com |HXRQlBZtILolxFVf9q2LbQ==|

	
	