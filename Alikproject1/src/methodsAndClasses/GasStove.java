package methodsAndClasses;

public class GasStove {
    int elPoint = 1;
    int gasPoint = 3;
    private boolean elPointOn = false;
    private boolean gasPointOn = false;
    int elPointEnergy;
    int gasPointEnergy;


    public int elEnergy(boolean elPointOn) {
        if (elPointOn == true) {
            elPointEnergy = elPoint * 100;
        } else elPointEnergy = 0;
        return elPointEnergy;
    }

    public int gasEnergy(boolean gasPointOn) {
        if (gasPointOn == true) {
            gasPointEnergy = gasPoint * 100;
        } else gasPointEnergy = 0;
        return gasPointEnergy;
    }


}
