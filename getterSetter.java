class stat {
    private int power;
    private int dex;
    private int intel;

    public int getPower() {
        return power;
    }
    public void setPower(int power) {
        if(power < 0) {
            this.power = 0;
        } else {
            this.power = power;
        }
    }

    public int getDex() {
        return dex;
    }
    public void setDex(int dex) {
        if(dex < 0) {
            this.dex = 0;
        } else {
            this.dex = dex;
        }
    }

    public int getIntel() {
        return intel;
    }
    public void setIntel(int intel) {
        if(intel < 0) {
            this.intel = 0;
        } else {
            this.intel = intel;
        }
    }
}

public class getterSetter {
    public static void main(String args[]) {
        stat character = new stat();

        character.setPower(-1);
        character.setDex(-1);
        character.setIntel(-1);

        System.out.println("character's power stat is : " + character.getPower());
        System.out.println("character's dex stat is :" + character.getDex());
        System.out.println("character's intel stat is :" + character.getIntel());
    }
}
