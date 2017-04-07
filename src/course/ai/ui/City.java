package course.ai.ui;

/**
 * Created by mohammad_lom on 3/31/17.
 */
public enum City {
    Oradea(0),
    Zerind(1),
    Arad(2),
    Sibiu(3),
    Timisoara(4),
    Fagaras(5),
    RimnicuVicea(6),
    Lugoj(7),
    Mehadia(8),
    Pitesti(9),
    Drobeta(10),
    Craiova(11),
    Bucharest(12),
    Giurgiu(13),
    Urziceni(14),
    Hirsova(15),
    Eforie(16),
    Vaslui(17),
    Iasi(18),
    Neamt(19);

    private int ID;

    City(int i) {
        this.ID = i;
    }

    public int getID(){
        return ID;
    }
}
