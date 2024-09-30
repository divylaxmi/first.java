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
