/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116058.latihan60.akatsuki;

public class Akatsuki {

    protected String nama;
    protected String asalDesa;
    protected String posisiCincin;
    protected String cincin;

    public Akatsuki(String nama, String asalDesa, String cincin, String posisiCincin) {
        this.nama = nama;
        this.asalDesa = asalDesa;
        this.posisiCincin = posisiCincin;
        this.cincin = cincin;

    }

    public String getAsalDesa() {
        return asalDesa;
    }

    public String getPosisiCincin() {
        return posisiCincin;
    }

    public String getCincin() {
        return cincin;
    }

    public String getNama() {
        return nama;
    }

    

}