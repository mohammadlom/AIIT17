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

        ArrayList<Node> map = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            ArrayList<Integer> hurNeighbours = new ArrayList<>();
            ArrayList<City> neighbours = new ArrayList<>();
            for (int j = 0; j < 20; j++) {
                if (cities[i][j] == 0 || cities[i][j] == Integer.MAX_VALUE) continue;
                hurNeighbours.add(cities[i][j]);
                neighbours.add(City.values()[j]);
            }
            City neighberhood[] = new City[neighbours.size()];
            for (int j = 0; j < neighbours.size(); j++) {
                neighberhood[j] = neighbours.get(j);
            }

            Node n = new Node(String.valueOf(City.values()[i]), neighberhood, hurNeighbours);
            map.add(n);
        }

        System.out.println("Please enter name of the first city:");

        Scanner in = new Scanner(System.in);

        String srcCity = "Oradea";

        System.out.println("Please enter name of the second city:");

        String dsnCity = "Bucharest";

        HashSet<Node> forSet = new HashSet<>();
        HashSet<Node> backSet = new HashSet<>();

        Queue<Node> forQueue = new LinkedList<>();
        Queue<Node> backQueue = new LinkedList<>();

        for (Node n: map
             ) {
            if(n.name.equals(srcCity)) {
                forSet.add(n);
                forQueue.add(n);
            }else if(n.name.equals(dsnCity)) {
                backSet.add(n);
                backQueue.add(n);
            }
        }

        while (!forQueue.isEmpty() || !backQueue.isEmpty()){
            Node forCurrent = forQueue.poll();
            Node backCurrent = backQueue.poll();
            if(backSet.contains(forCurrent) || forCurrent.name.equals(dsnCity)
                    || forSet.contains(backCurrent) || backCurrent.name.equals(srcCity)) {
                //print info
                System.out.println("These nodes are in forward fringe:");
                for (Node n:forQueue
                     ) {
                    System.out.print(n.name + ", ");
                }
                System.out.println("");
                System.out.println("These nodes are in backward fringe:");
                for (Node n:backQueue
                        ) {
                    System.out.print(n.name + ", ");
                }
                System.out.println("");
                System.out.println("These nodes are expanded:");
                for (Node n: forSet
                     ) {
                    System.out.print(n.name + ", ");
                }
                for (Node n: backSet
                     ) {
                    System.out.print(n.name + ", ");
                }
            }
            if(backSet.contains(forCurrent)){
                int dis = 0;
                while(!forCurrent.parent.equals(null)){
                    for (int i = 0; i < forCurrent.neighbours.length; i++) {
                        if(forCurrent.neighbours[i].name().equals(forCurrent.parent.name)){
                            dis += forCurrent.huristicToNeighbours.get(i);
                        }
                    }
                    forCurrent = forCurrent.parent;
                }
                Node tmp = null;
                for (Node n:backSet
                     ) {
                    tmp = n;
                }
                while(!tmp.parent.equals(null)){
                    for (int i = 0; i < tmp.neighbours.length; i++) {
                        if(tmp.neighbours[i].name().equals(tmp.parent.name)){
                            dis += tmp.huristicToNeighbours.get(i);
                        }
                    }
                    tmp = tmp.parent;
                }
                System.out.println("distance to travell: " + dis);
                break;
            }
            if(forSet.contains(backCurrent)){
                int dis = 0;
                while(!backCurrent.parent.equals(null)){
                    for (int i = 0; i < backCurrent.neighbours.length; i++) {
                        if(backCurrent.neighbours[i].name().equals(backCurrent.parent.name)){
                            dis += backCurrent.huristicToNeighbours.get(i);
                        }
                    }
                    backCurrent = backCurrent.parent;
                }
                Node tmp = null;
                for (Node n:forSet
                        ) {
                    tmp = n;
                }
                while(!tmp.parent.equals(null)){
                    for (int i = 0; i < tmp.neighbours.length; i++) {
                        if(tmp.neighbours[i].name().equals(tmp.parent.name)){
                            dis += tmp.huristicToNeighbours.get(i);
                        }
                    }
                    tmp = tmp.parent;
                }
                System.out.println("distance to travell: " + dis);
                break;
            }
            if(forCurrent.name.equals(dsnCity)){
                int dis = 0;
                while(!forCurrent.parent.equals(null)){
                    for (int i = 0; i < forCurrent.neighbours.length; i++) {
                        if(forCurrent.neighbours[i].name().equals(forCurrent.parent.name)){
                            dis += forCurrent.huristicToNeighbours.get(i);
                        }
                    }
                    forCurrent = forCurrent.parent;
                }
                break;
            }
            if(backCurrent.name.equals(srcCity)){
                int dis = 0;
                while(!backCurrent.parent.equals(null)){
                    for (int i = 0; i < backCurrent.neighbours.length; i++) {
                        if(backCurrent.neighbours[i].name().equals(backCurrent.parent.name)){
                            dis += backCurrent.huristicToNeighbours.get(i);
                        }
                    }
                    backCurrent = backCurrent.parent;
                }
                break;
            }
            for (City c: forCurrent.neighbours
                 ) {
                 boolean flag = false;
                 for (Node n: map
                    ) {
                    if(n.name == c.name()) {
                        if(!forSet.contains(n)){
                            n.parent = forCurrent;
                            forSet.add(n);
                            forQueue.add(n);
                        }
                        flag = true;
                        break;
                    }
                 }

            }
            for (City c: backCurrent.neighbours
                    ) {
                boolean flag = false;
                for (Node n: map
                        ) {
                    if(n.name == c.name()) {
                        if(!backSet.contains(n)){
                            n.parent = backCurrent;
                            backSet.add(n);
                            backQueue.add(n);
                        }
                        flag = true;
                        break;
                    }
                }

            }
        }



    }
}
