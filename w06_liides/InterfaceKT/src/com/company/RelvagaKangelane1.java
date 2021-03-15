package com.company;

public class RelvagaKangelane1 implements RelvaInterface, KangelaneInterface {
        String nimi;
        int vanus;
        String relvaTyyp;
        int mass;
    public RelvagaKangelane1(String nimi, int vanus, String relvaTyyp, int mass) {
        this.nimi = nimi;
        this.vanus = vanus;
        this.relvaTyyp = relvaTyyp;
        this.mass = mass;
    }

    public void jutusta(String sonad){
        System.out.println(nimi +" ütleb: "+ sonad);
    };
    public void look(){
        System.out.println(nimi +" lööb relvaga, mis on "+ mass +"kg kaaluv "+ relvaTyyp);
    };
    public void blokk(){
        System.out.println("Paneb blokib enda relvaga löögi!");
    };
}
