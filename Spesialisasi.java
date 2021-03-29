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
public class Spesialisasi {
    private String jadwal;
    private String spec; 
    private String dokter;

    public Spesialisasi(String jadwal, String spec, String dokter) {
        this.jadwal = jadwal;
        this.spec = spec;
        this.dokter = dokter;
    }

    public void setRs(String jadwal) {
        this.jadwal = jadwal;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public void setDokter(String dokter) {
        this.dokter = dokter;
    }

    public String getJadwal() {
        return jadwal;
    }

    public String getSpec() {
        return spec;
    }

    public String getDokter() {
        return dokter;
    }
    
    
    
}
