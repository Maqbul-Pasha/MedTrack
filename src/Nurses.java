import java.util.ArrayList;

public class Nurses extends ArrayList<Nurse> {
    public void addNurse(Nurse nurse)
    {
        this.add(nurse);
    }

    public Nurse getNurse(int index)
    {
        return this.get(index);
    }

    public void setNurse(int index, Nurse nurse)
    {
        this.set(index, nurse);
    }
}
