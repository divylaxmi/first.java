package com.day4;

class HillStations {
	public void location() {
        System.out.println("Location Hill Station");
    }
    
    public void famousFor() {
        System.out.println("Famous for Scenic beauty");
    }
}

class Manali extends HillStations {
    @Override
    public void location() {
        System.out.println("Location: Manali, Himachal Pradesh");
    }

    @Override
    public void famousFor() {
        System.out.println("Famous for: Adventure sports and snow-capped mountains");
    }
}

class Mussoorie extends HillStations {
    @Override
    public void location() {
        System.out.println("Location: Mussoorie, Uttarakhand");
    }

    @Override
    public void famousFor() {
        System.out.println("Famous for: Beautiful views and 'The Queen of Hills'");
    }
}
class Gulmarg extends HillStations {
    @Override
    public void location() {
        System.out.println("Location: Gulmarg, Jammu and Kashmir");
    }

    @Override
    public void famousFor() {
        System.out.println("Famous for: Skiing and winter sports");
    }
}

public class MainHillStation {
	public static void main(String[] args) {
        HillStations hillstation;

        hillstation = new Manali();
        hillstation.location();
        hillstation.famousFor();

        System.out.println();
        hillstation = new Mussoorie();
        hillstation.location();
        hillstation.famousFor();

        System.out.println();

        hillstation = new Gulmarg();
        hillstation.location();
        hillstation.famousFor();

        System.out.println();
        
        Manali manali = new Manali();
        manali.location();
        manali.famousFor();

        System.out.println();

        Mussoorie mussoorie = new Mussoorie();
        mussoorie.location();
        mussoorie.famousFor();

        System.out.println();

        Gulmarg gulmarg = new Gulmarg();
        gulmarg.location();
        gulmarg.famousFor();
    }

}
