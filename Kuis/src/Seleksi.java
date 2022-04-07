/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
    import beasiswa.BeasiswaMahasiswa;
    import beasiswa.BeasiswaPelajar;
    
public class Seleksi implements BeasiswaPelajar, BeasiswaMahasiswa {

    double struktur, visual, design, jurnal, relevan, solving, hasil1, hasil2;

    public Seleksi(double struktur, double visual, double design, double jurnal, double relevan, double solving, double hasil1, double hasil2) {
        this.struktur = struktur;
        this.visual = visual;
        this.design = design;
        this.jurnal = jurnal;
        this.relevan = relevan;
        this.solving = solving;
        this.hasil1 = hasil1;
        this.hasil2 = hasil2;
    }

    @Override
    public double struktur() {
        struktur = (struktur*50)/100;
        return struktur;
    }

    @Override
    public double visual() {
        visual = (visual*20)/100;
        return visual;
    }

    @Override
    public double design() {
        design = (design*30)/100;
        return design;
    }

    @Override
    public double jurnal() {
       jurnal = (jurnal*60)/100;
       return jurnal;
    }

    @Override
    public double relevan() {
       relevan = (relevan*25)/100;
       return relevan;
    }

    @Override
    public double solving() {
       solving = (solving*15)/100;
       return solving; 
    }

    @Override
    public double hasil2() {
        hasil2 = struktur()+visual()+design();
        return hasil2;
    }

    @Override
    public double hasil1() {
        hasil1 = jurnal()+relevan()+solving();
        return hasil1;
    }

 

}
