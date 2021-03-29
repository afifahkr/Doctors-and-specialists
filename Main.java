/*
  Anggota Kelompok:
 - Afifah Khairiyyah Rusli
 - Khaira Isyara
 - Moh. Reyhand Fatturrahman
 */
package AssociationAggregation;

/**
 *
 * @author lenovo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(" Association ");
        Dokter first = new Dokter("Angga", "RSUD");
        Spesialisasi spes = new Spesialisasi(" 12.00-21.00 ", " Jantung ", first.getNama());
       
        System.out.println(" Dokter " + first.getNama());
        System.out.println(" Spesialis " + spes.getSpec());
        System.out.println(" Jadwal Praktek" + spes.getJadwal());
        System.out.println("_________________________");
        
        System.out.println(" Aggregation");
        Dokter doc = new Dokter(" Jep", " RSUD");
        Spesialisasi2 spes2 = new Spesialisasi2(" 08.00-22.00", " Gigi", doc);
        
        System.out.println(" Dokter" + spes2.getDoc().getNama());
        System.out.println(" Spesialis" + spes2.getSpec() + " di" + spes2.getDoc().getRs());
        System.out.println(" Jadwal Praktek" + spes2.getJadwal());
        
    }
    
}
