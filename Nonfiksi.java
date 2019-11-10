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
public class Nonfiksi { 
     private String jenisbukunya;

    public Nonfiksi(){
        super();
        jenisbukunya = "Non Fiksi";
    }

    public Nonfiksi(String jenisbukunya, String judul, String pengarang, String jenis, int halaman) {
        super();
        this.jenisbukunya = jenisbukunya;
    }

    public String getJenisbukunya() {
        return jenisbukunya;
    }

    public void setJenisbukunya(String jenisBukunya) {
        this.jenisbukunya = jenisbukunya;
}
}
