/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118056.latihan52.siapakamu;

/**
 *
 * @author 
 * Nama : Mirraz Ibrahim
 * Nim : 10118056
 * Kelas: IF-2
 */
public class PBO210118056Latihan52SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dosen dosen = new Dosen();
        dosen.setNip("41227829930");
        dosen.setNama("Rizki Adam Kurniawan");
        dosen.setMataKuliah("PBO");
        dosen.setUmur(27);
        System.out.println("NIP DOSEN : " + dosen.getNip());
        dosen.siapaKamu();
        dosen.mengajarApa();
        System.out.println("");
        Mahasiswa mhs = new Mahasiswa();
        mhs.setNama("Nindi");
        mhs.setUmur(17);
        mhs.setNim("10110269");
        mhs.setKelas("PBO2");
        System.out.println("NIM MAHASISWA : " + mhs.getNim());
        mhs.siapaKamu();
        mhs.kelasApa();
        
    }
    
}
