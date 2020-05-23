package Praktikum;

import java.util.Scanner;

/**
 *
 * @author FARLAN
 */
public class Graph {

    int vertex;
    LinkedLists list[];
    static boolean tipe = true;

    public Graph(int vertex) {
        this.vertex = vertex;
        list = new LinkedLists[vertex];
        for (int i = 0; i < vertex; i++) {
            list[i] = new LinkedLists();
        }
    }

    public void addEdge(int source, int destination) {
        //add edge
        list[source].addFirst(destination);

        //add back edge (for undirected)
        list[destination].addFirst(source);
    }

    public void degree(int source) throws Exception {
        //degree undirected graph
        System.out.println("degree vertex " + source + " : " + list[source].size());

        //degree directed graph
        //inDegree
        int k, totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < list[i].size(); j++) {
                if (list[i].get(j).equals(source)) {
                    ++totalIn;
                }
            }
            //outDegree
            for (k = 0; k < list[source].size(); k++) {
                list[source].get(k);
            }
            totalOut = k;
        }
        System.out.println("Indegree dari vertex " + source + " : " + totalIn);
        System.out.println("Outdegree dari vertex " + source + " : " + totalOut);
        System.out.println("degree vertex " + source + " : " + (totalIn + totalOut));
    }

    public void removeEdge(int source, int destination) throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (i == destination) {
                list[source].remove(destination);
            }
        }
    }

    public void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graph berhasil dikosongkan");
    }

    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.print("Vertex " + i + " terhubung dengan: ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print(list[i].get(j) + " ");
                }
                System.out.println("");
            }
        }
        System.out.println(" ");
    }

    public boolean graphType(int num) {
        if (num == 0) {
            return false;
        } else if (num == 1) {
            return true;
        } else {
            return true;
        }
    }

    public static void menu() {
        System.out.println("Masukkan pilihan menu: ");
        System.out.println("1. Jenis Graph");
        System.out.println("2. Input Jumlah Vertex");
        System.out.println("3. Add Edge");
        System.out.println("4. Remove Edge");
        System.out.println("5. Remove All Edge");
        System.out.println("6. Keluar");
        System.out.println("-------------------------");
    }

    public static void main(String[] args) throws Exception {
        Scanner farlan = new Scanner(System.in);
        Graph graph = new Graph(6);
        int pilih, jumlah, type = 0;
        do {
            menu();
            System.out.print(">> ");
            pilih = farlan.nextInt();
            System.out.println("-------------------------\n");
            switch (pilih) {
                case 1:
                    if (tipe == true) {
                        System.out.print("Input Graph type (0=directed, 1=undirected) : ");
                        type = farlan.nextInt();
                        System.out.println(graph.graphType(type));
                        tipe = false;
                    } else {
                        System.out.println(graph.graphType(type));
                    }
                    break;
                case 2:
                    System.out.print("Masukkan jumlag vertex: ");
                    jumlah = farlan.nextInt();
                    graph = new Graph(jumlah);
                    break;
                case 3:
                    String again;
                    do {
                        System.out.println("Input : <source> <destination>");
                        int source = farlan.nextInt();
                        int destination = farlan.nextInt();
                        graph.addEdge(source, destination);
                        do {
                            System.out.print("Another one (y/n): ");
                            again = farlan.next();
                            if (!again.equalsIgnoreCase("y") && !again.equalsIgnoreCase("n")) {
                                System.out.println("Input False");
                            }
                        } while (!again.equalsIgnoreCase("y") && !again.equalsIgnoreCase("n"));
                    } while (again.equalsIgnoreCase("y"));
                    graph.printGraph();
                    break;
                case 4:
                    System.out.print("Remove <source> <destination> : ");
                    int source = farlan.nextInt();
                    int destination = farlan.nextInt();
                    graph.removeEdge(source, destination);
                    break;
                case 5:
                    graph.removeAllEdges();
                    break;
                case 6:
                    System.exit(0);
            }
        } while (pilih >= 1 && pilih <= 6);
    }
}
