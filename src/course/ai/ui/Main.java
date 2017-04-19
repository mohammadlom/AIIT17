package course.ai.ui;

import java.util.*;

/**
 * Created by mohammad_lom on 3/31/17.
 */
public class Main {
    public static void main(String[] args) {
        int cities[][] = {
                {0, 71, Integer.MAX_VALUE, 151, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE},
                {71, 0, 75, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE},
                {Integer.MAX_VALUE, 75, 0, 140, 118, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE},
                {151, Integer.MAX_VALUE, 140, 0, Integer.MAX_VALUE, 99, 80, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, 118, Integer.MAX_VALUE, 0, Integer.MAX_VALUE, Integer.MAX_VALUE, 111, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 99, Integer.MAX_VALUE, 0, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 211, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 80, Integer.MAX_VALUE, Integer.MAX_VALUE, 0, Integer.MAX_VALUE, Integer.MAX_VALUE, 97, Integer.MAX_VALUE, 146, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 111, Integer.MAX_VALUE, Integer.MAX_VALUE, 0, 70, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 70, 0, Integer.MAX_VALUE, 75, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 97, Integer.MAX_VALUE, Integer.MAX_VALUE, 0, Integer.MAX_VALUE, 138, 101, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 75, Integer.MAX_VALUE, 0, 120, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 146, Integer.MAX_VALUE, Integer.MAX_VALUE, 138, 120, 0, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 211, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 101, Integer.MAX_VALUE, Integer.MAX_VALUE, 0, 90, 85, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 90, 0, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 85, Integer.MAX_VALUE, 0, 98, Integer.MAX_VALUE, 142, Integer.MAX_VALUE, Integer.MAX_VALUE},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 98, 0, 86, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 86, 0, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 142, Integer.MAX_VALUE, Integer.MAX_VALUE, 0, 92, Integer.MAX_VALUE},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 92, 0, 87},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 87, 0}
        };

//        ArrayList<Node> map = new ArrayList<>();
//
//        for (int i = 0; i < 20; i++) {
//            ArrayList<Integer> hurNeighbours = new ArrayList<>();
//            ArrayList<City> neighbours = new ArrayList<>();
//            for (int j = 0; j < 20; j++) {
//                if (cities[i][j] == 0 || cities[i][j] == Integer.MAX_VALUE) continue;
//                hurNeighbours.add(cities[i][j]);
//                neighbours.add(City.values()[j]);
//            }
//            City neighberhood[] = new City[neighbours.size()];
//            for (int j = 0; j < neighbours.size(); j++) {
//                neighberhood[j] = neighbours.get(j);
//            }
//
//            Node n = new Node(String.valueOf(City.values()[i]), neighberhood, hurNeighbours);
//            map.add(n);
//        }

        System.out.println("Please enter name of the first city:");

        Scanner in = new Scanner(System.in);

        String srcCity = "Oradea";

        System.out.println("Please enter name of the second city:");

        String dsnCity = "Bucharest";

        boolean flag[] = new boolean[20];
        Arrays.fill(flag, false);

        ArrayList<Node> children1 = new ArrayList<>();
        ArrayList<Node> children2 = new ArrayList<>();

        Queue<Node> Fringe_IN = new LinkedList<>();
        Queue<Node> Fringe_GO = new LinkedList<>();

        Node src = new Node(String.valueOf(City.valueOf(srcCity)));
        src.path = String.valueOf(City.valueOf(srcCity));

        Node dis = new Node(String.valueOf(City.valueOf(dsnCity)));
        dis.path = String.valueOf(City.valueOf(dsnCity));

        Fringe_IN.add(src);
        Fringe_GO.add(dis);
//        int dis = 0;
        while(!Fringe_IN.isEmpty() && !Fringe_GO.isEmpty())
        {
            Node parent1 = Fringe_IN.poll();

            int n = City.valueOf(parent1.name).getID();

//            if(flag[n] == true) continue;
            flag[n] = true;
            System.out.println("City " + parent1.name + " visited!");
            if(parent1.name.equals(dsnCity) || containsNode(parent1.name, Fringe_GO))
            {
                System.out.println("\nFind Goal   "+parent1.name);
                break;



            }
            //  children1 = getChilds(parent1, map);
            for (int i = 0; i < cities[n].length; i++) {
                if(cities[n][i] != Integer.MAX_VALUE && cities[n][i] != 0){
                    Node n2 = new Node(String.valueOf(City.values()[i]));
                    n2.dist = parent1.dist + cities[n][i];
                    n2.path = parent1.path+"-"+String.valueOf(City.values()[i]);
                    children1.add(n2);
                }
            }
            for (int i = 0; i < children1.size(); i++) {
                Node n1 = children1.get(i);
                n1.parent = parent1;
                Fringe_IN.add(n1);
            }

            Node parent2 = Fringe_GO.poll();
            int nn = City.valueOf(parent2.name).getID();

//            if(flag[nn] == true) continue;
            flag[nn] = true;
            System.out.println("City " + parent2.name + " visited!");
            if(parent2.name.equals(srcCity) || containsNode(parent2.name, Fringe_IN))
            {
                System.out.println("Find Goal    "+parent2.name);
                break;
            }
            //children2 = getChilds(parent2, map);
            for (int i = 0; i < cities[nn].length; i++) {
                if(cities[nn][i] != Integer.MAX_VALUE && cities[nn][i] != 0){
                    Node n2 = new Node(String.valueOf(City.values()[i]));
                    n2.dist = parent2.dist + cities[nn][i];
                    n2.path = parent2.path+"-"+String.valueOf(City.values()[i]);
                    children2.add(n2);
                }
            }
            for (int i = 0; i < children2.size(); i++) {
                Node n1 = children2.get(i);
                n1.parent = parent2;
                Fringe_GO.add(n1);
            }
        }
    }

    private static ArrayList<Node> getChilds(Node parent1, ArrayList<Node> map) {
        ArrayList<Node> childs = new ArrayList<>();
        for (City c:parent1.neighbours
                ) {
            for (int i = 0; i < map.size(); i++) {
                if (c.name().equals(map.get(i).name)){
                    childs.add(map.get(i));
                    break;
                }
            }
        }
        return childs;
    }

    private static Node findNode(String srcCity, ArrayList<Node> map) {
        for (Node n:map
                ) {
            if(n.name.equals(srcCity)) return n;
        }
        return null;
    }

    private static boolean containsNode(String name, Queue<Node> Fringe){
        for (Node node : Fringe) {
            if(node.name.equals(name))
                return true;
        }
        return false;
    }
}