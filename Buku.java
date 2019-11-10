/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasasissusah;

/**
 *
 * @author AFIFAH NADHIRAH
 */
class Buku extends Perpustakaan {
    private String judul, pengarang, jenis;
    private int halaman;
    
    public Buku() {
        this.judul = null;
        this.pengarang = null;
        this.halaman = 0;
        this.jenis = null;
    }

    public Buku(String judul, String pengarang, String jenis, int halaman) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.jenis = jenis;
        this.halaman = halaman;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public int getHalaman() {
        return halaman;
    }

    public void setHalaman(int halaman) {
        this.halaman = halaman;
    }    
    
    public void print() {
        System.out.println("Judul = " + judul + "\nPengarang = " + pengarang+ "\nHalaman = " + halaman + "\nJenis = " + jenis);
    }
    
    public String Info() {
        return "Judul = " + judul + "\n | Pengarang = " + pengarang+ "\n | Halaman = " + halaman + "\n | Jenis = " + jenis;
    }
}
