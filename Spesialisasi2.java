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
// Agregasi
public class Spesialisasi2 {
    private String jadwal;
    private String spec; // spesialis
    private Dokter doc;

    public Spesialisasi2(String jadwal, String spec, Dokter doc) {
        this.jadwal = jadwal;
        this.spec = spec;
        this.doc = doc;
    }

    public void setJadwal(String jadwal) {
        this.jadwal = jadwal;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public void setDoc(Dokter doc) {
        this.doc = doc;
    }

    public String getJadwal() {
        return jadwal;
    }

    public String getSpec() {
        return spec;
    }

    public Dokter getDoc() {
        return doc;
    }
    
    

    
    
}
