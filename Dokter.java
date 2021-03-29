/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AssociationAggregation;

/**
 *
 * @author lenovo
 */
public class Dokter {
    private String nama;
    private String rs; // tempat praktek

    public Dokter(String nama, String rs) {
        this.nama = nama;
        this.rs = rs;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setRs(String rs) {
        this.rs = rs;
    }

    public String getNama() {
        return nama;
    }

    public String getRs() {
        return rs;
    }
    
    
    
}
