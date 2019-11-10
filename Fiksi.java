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
class Fiksi extends Buku {
    private String jenisbukunya;
    
    public Fiksi() {
        super();
        jenisbukunya = "Fiksi";
    }

    public Fiksi(String jenisbukunya, String judul, String pengarang, String jenis, int halaman) {
        super(judul, pengarang, jenis, halaman);
        this.jenisbukunya = jenisbukunya;
    }

    public String getJenisbukunya() {
        return jenisbukunya;
    }

    public void setJenisbukunya (String jenisbukunya) {
        this.jenisbukunya = jenisbukunya;
    }
    
}
