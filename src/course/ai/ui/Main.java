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
                {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 85, Integer.MAX_VALUE, 0, 98, Integer.MAX_VALUE, 142, Integer.MAX_VALUE, Integer.MAX_VALUE},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 98, 0, 86, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 86, 0, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 142, Integer.MAX_VALUE, Integer.MAX_VALUE, 0, 92, Integer.MAX_VALUE},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 92, 0, 87},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 87, 0}
        };

        System.out.println("Please enter name of the first city:");

        Scanner in = new Scanner(System.in);

        String srcCity = in.nextLine();

        System.out.println("Please enter name of the second city:");

        String dsnCity = in.nextLine();

        boolean flag[] = new boolean[20];
        Arrays.fill(flag, false);

        ArrayList<Node> visited = new ArrayList<>();

        Queue<Node> Fringe_IN = new LinkedList<>();
        Queue<Node> Fringe_GO = new LinkedList<>();

        Node src = new Node(String.valueOf(City.valueOf(srcCity)));
        src.path = String.valueOf(City.valueOf(srcCity));

        Node dis = new Node(String.valueOf(City.valueOf(dsnCity)));
        dis.path = String.valueOf(City.valueOf(dsnCity));

        Fringe_IN.add(src);
        Fringe_GO.add(dis);
        while (!Fringe_IN.isEmpty() && !Fringe_GO.isEmpty()) {
            Node parent1 = Fringe_IN.poll();
            visited.add(parent1);
            int n = City.valueOf(parent1.name).getID();

            if (flag[n] == true) {
                continue;
            }
            flag[n] = true;
            if (parent1.name.equals(dsnCity) || containsNode(parent1.name, Fringe_GO) != null) {
                System.out.println("Find Goal");

                String path1[] = parent1.path.split("-");

                String path2[] = visited.get(visited.size() - 2).path.split("-");

                for (int i = 0; i < path1.length; i++) {
                    System.out.print(path1[i] + ", ");
                }

                for (int i = path2.length - 1; i >= 0; i--) {
                    if (i != 0) {
                        System.out.print(path2[i] + ", ");
                    } else {
                        System.out.println(path2[i]);
                    }
                }

                System.out.println("Visited Nodes in tree:");

                for (int i = 0; i < visited.size(); i++) {
                    if (i != visited.size() - 1) {
                        System.out.print(visited.get(i).name + ", ");
                    } else {
                        System.out.println(visited.get(i).name);
                    }
                }

                System.out.println("Expanded Nodes in tree:");

                for (Node node : Fringe_GO) {
                    System.out.print(node.name + ", ");
                }

                for (Node node : Fringe_IN) {
                    System.out.print(node.name + ", ");
                }
                System.out.println("");

                System.out.println("Distance to Travel(g(n)):");

                int dist = 0;

                dist += parent1.dist;

                if (!parent1.name.equals(dsnCity)) {
                    dist += visited.get(visited.size() - 2).dist;
                }

                if (containsNode(parent1.name, Fringe_GO) != null) {
                    dist += cities[n][City.valueOf(visited.get(visited.size() - 2).name).getID()];
                }
                System.out.println(dist);
                break;
            }
            ArrayList<Node> children1 = new ArrayList<>();

            for (int i = 0; i < cities[n].length; i++) {
                if (cities[n][i] != Integer.MAX_VALUE && cities[n][i] != 0) {
                    Node n2 = new Node(String.valueOf(City.values()[i]));
                    n2.dist = parent1.dist + cities[n][i];
                    n2.path = parent1.path + "-" + String.valueOf(City.values()[i]);
                    children1.add(n2);
                }
            }
            for (int i = 0; i < children1.size(); i++) {
                Node n1 = children1.get(i);
                n1.parent = parent1;
                Fringe_IN.add(n1);
            }

            Node parent2 = Fringe_GO.poll();
            visited.add(parent2);

            int nn = City.valueOf(parent2.name).getID();

            if (flag[nn] == true) {
                continue;
            }
            flag[nn] = true;
            if (parent2.name.equals(srcCity) || containsNode(parent2.name, Fringe_IN) != null) {
                System.out.println("Find Goal");

                String path1[] = parent1.path.split("-");

                Node node = containsNode(parent2.name, Fringe_IN);

                if (node != null) {
                    path1 = node.path.split("-");
                }

                String path2[] = parent2.path.split("-");
                if (!parent2.name.equals(srcCity)) {
                    for (int i = 0; i < path1.length; i++) {
                        System.out.print(path1[i] + ", ");
                    }
                }

                for (int i = path2.length - 1; i >= 0; i--) {
                    if (i != 0) {
                        System.out.print(path2[i] + ", ");
                    } else {
                        System.out.println(path2[i]);
                    }
                }

                System.out.println("Visited Nodes in tree:");

                for (int i = 0; i < visited.size(); i++) {
                    if (i != visited.size() - 1) {
                        System.out.print(visited.get(i).name + ", ");
                    } else {
                        System.out.println(visited.get(i).name);
                    }
                }

                System.out.println("Expanded Nodes in tree:");

                for (Node tmp : Fringe_GO) {
                    System.out.print(tmp.name + ", ");
                }

                for (Node tmp : Fringe_IN) {
                    System.out.print(tmp.name + ", ");
                }
                System.out.println("");

                System.out.println("Distance to Travel(g(n)):");

                int dist = 0;

                dist += parent2.dist;

                if (node != null) {

                    if (!parent2.name.equals(srcCity)) {
                        dist += node.dist;
                    }

                    if (containsNode(parent2.name, Fringe_IN) != null) {
                        dist += cities[nn][City.valueOf(node.name).getID()];
                    }
                } else {
                    if (!parent2.name.equals(srcCity)) {
                        dist += visited.get(visited.size() - 2).dist;
                    }

                    if (containsNode(parent2.name, Fringe_IN) != null) {
                        dist += cities[nn][City.valueOf(visited.get(visited.size() - 2).name).getID()];
                    }
                }
                System.out.println(dist);
                break;
            }
            ArrayList<Node> children2 = new ArrayList<>();

            for (int i = 0; i < cities[nn].length; i++) {
                if (cities[nn][i] != Integer.MAX_VALUE && cities[nn][i] != 0) {
                    Node n2 = new Node(String.valueOf(City.values()[i]));
                    n2.dist = parent2.dist + cities[nn][i];
                    n2.path = parent2.path + "-" + String.valueOf(City.values()[i]);
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

//    private static ArrayList<Node> getChilds(Node parent1, ArrayList<Node> map) {
//        ArrayList<Node> childs = new ArrayList<>();
//        for (City c : parent1.neighbours) {
//            for (int i = 0; i < map.size(); i++) {
//                if (c.name().equals(map.get(i).name)) {
//                    childs.add(map.get(i));
//                    break;
//                }
//            }
//        }
//        return childs;
//    }

    private static Node findNode(String srcCity, ArrayList<Node> map) {
        for (Node n : map) {
            if (n.name.equals(srcCity)) {
                return n;
            }
        }
        return null;
    }

    private static Node containsNode(String name, Queue<Node> Fringe) {
        for (Node node : Fringe) {
            if (node.name.equals(name)) {
                return node;
            }
        }
        return null;
    }
}
