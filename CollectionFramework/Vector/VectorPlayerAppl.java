
package org.techhub;

import java.util.*;

class Player {
    private int id;
    private String name;
    private int run;

    public Player() {
    }

    public Player(String name, int id, int run) {
        this.name = name;
        this.id = id;
        this.run = run;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }
}

public class VectorPlayerApplication {

    public static void main(String[] args) {

        Vector<Player> v = new Vector<Player>();

        Player p1 = new Player("Virat", 1, 80);
        Player p2 = new Player("Rohit", 2, 65);
        Player p3 = new Player("Dhoni", 3, 90);

        v.add(p1);
        v.add(p2);
        v.add(p3);

        // 1. Using Normal For Loop

        System.out.println("Using Normal For Loop");

        for(int i = 0; i < v.size(); i++) {

            Player p = v.get(i);

            System.out.println(p.getId() + "\t" +
                               p.getName() + "\t" +
                               p.getRun());
        }

        // 2. Using Enhanced For Loop

        System.out.println("\nUsing Enhanced For Loop");

        for(Player p : v) {

            System.out.println(p.getId() + "\t" +
                               p.getName() + "\t" +
                               p.getRun());
        }

        // 3. Using Iterator

        System.out.println("\nUsing Iterator");

        Iterator<Player> i = v.iterator();

        while(i.hasNext()) {

            Player p = i.next();

            System.out.println(p.getId() + "\t" +
                               p.getName() + "\t" +
                               p.getRun());
        }

        // 4. Using ListIterator

        System.out.println("\nUsing ListIterator");

        ListIterator<Player> li = v.listIterator();

        while(li.hasNext()) {

            Player p = li.next();

            System.out.println(p.getId() + "\t" +
                               p.getName() + "\t" +
                               p.getRun());
        }

        // 5. Using Enumeration

        System.out.println("\nUsing Enumeration");

        Enumeration<Player> e = v.elements();

        while(e.hasMoreElements()) {

            Player p = e.nextElement();

            System.out.println(p.getId() + "\t" +
                               p.getName() + "\t" +
                               p.getRun());
        }
    }
}
