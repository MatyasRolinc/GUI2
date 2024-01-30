import java.util.ArrayList;
import java.util.List;

public class SpravceDeskovek {
    private List<Deskovka> seznamDeskovek = new ArrayList<>();

    public List<Deskovka> getSeznamDeskovek() {
        return new ArrayList<>(seznamDeskovek);
    }

    public int getPocetDeskovek(int index)
    {
        return seznamDeskovek.size();
    }



}
