package com.xworkz.internal;

public class Projector {


    private Len lens;
    private Lamp lamp;
    private Port port;
    private Wire wire;
    private Board board;
    private Button button;
    private Panel panel;
    private Remote remote;
    private Screw screw;

    public Projector(Len lens,Lamp lamp,Port port,Wire wire,Board board,Button button,Panel panel,Remote remote,Screw screw){
        this.lens=lens;
        this.lamp=lamp;
        this.port=port;
        this.wire=wire;
        this.board=board;
        this.button=button;
        this.panel=panel;
        this.remote=remote;
        this.screw=screw;

    }

    public void screen(){

        System.out.println("Running screen in Projector");

        this.lens.clarity();
        this.lamp.Light();
        this.port.displayPort();
        this.wire.Insulator();
        this.board.displayBoard();
        this.button.displayButton();
        this.panel.displayPanel();
        this.remote.displayRemote();
        this.screw.displayScrew();



    }
}
