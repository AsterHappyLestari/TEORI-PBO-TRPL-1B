A.	Wrapper Class

Wrapper Class merupakan tipe data bawaan Java yg berupa objek. Wrapper class ini menyediakan mekanisme untuk membungkus (wrap) tipe data
primitive menjadi sebuah objek sehingga bisa digunakan dalam kegiatan yg berhubungan dengan objek. Wrapper  Class bersifat immutable yaitu
apabila ada 2 buah variabel yg memegang nilai yg sama, maka satu variable diganti nilainya maka yg lain pun tidak ikut berubah nilainya.

B.	Perbedaan Final, Finally, Finalize

1.	Final adalah keyword untuk mendeklarasikan bahwa sebuah variabel/atribut tidak dapat diubah lagi isinya (konstan), jika final
disebutkan di method, artinya method tersebut tidak dapat di override oleh subclassnya, jika final disebutkan di class, artinya class
tersebut tidak dapat diturunkan lagi.
2.	Finally merupakan tag dalam try-finally yang digunakan untuk memastikan bahwa kode didalam finally akan dieksekusi walaupun dalam try
sukses / gagal.
3.	Finalize merupakan methode kelas Object yang dieksekusi saat garbace collection menghapus sebuah object yang sudah tidak terpakai.
