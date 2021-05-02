package com.company;

class Tuttav {
    String name;

    public void jutt(){
        System.out.println(name +" on ainult tuttav.\n");
    }

}
class Sober extends Tuttav {

    String linn;

    public Sober( String name, String linn){
        this.name = name;
        this.linn = linn;
    }

    public void jutt(){
        System.out.println(name +" on sõber  "+ linn + "st.\n");
    }

}
class ParimSober extends Sober {
    String muusika;

    public ParimSober(String name, String linn, String muusika) {
        super(name, linn);
        this.muusika = muusika;
    }

    public void jutt() {
        System.out.println(name +" on mu parim sõber, ta on pärit "+ linn + "lt ja tema lemmik laul on "+ muusika +".\n");
    }
}