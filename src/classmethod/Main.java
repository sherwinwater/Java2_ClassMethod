package classmethod;

import content.ChangeWorker;
import content.Worker;

public class Main {

    public static void main(String[] args) {

        Worker one = new Worker();
        Worker two = new Worker();

        System.out.println(ChangeWorker.printWorker(one));

        Worker three = ChangeWorker.check();
        System.out.println(ChangeWorker.printWorker(three));

        ChangeWorker.nameWorker(one, "bob");
        System.out.println(ChangeWorker.printWorker(one));

        ChangeWorker.check(one);
        System.out.println(ChangeWorker.printWorker(one));

        Worker newone = ChangeWorker.startWorker("John", 100);
        System.out.println(ChangeWorker.printWorker(newone));
        System.out.println(ChangeWorker.printWorker(ChangeWorker.startWorker("John", 100)));

    }

}

/*
Class method homework

1.	create a project called ClassMethod
2.	add a content folder that contains a class called Worker
3.	to the Worker class add
a.	an integer called number set to 10
b.	a String called name that is set to “Fred”
4.	to the content folder add a class called ChangeWorker that
a.	 has a public static method called printworker that
i.	Takes a Worker object as a parameter
ii.	Builds a String containing the Workers name and number
iii.	Returns the String
5.	In main method, demonstrate the proper use of printworker
6.	To ChangeWorker, add a public static method called nameWorker that
a.	Takes a Worker object and a String name as parameters
b.	Changes the Workers name to the String parameter
c.	Does not return anything
7.	In main method, demonstrate the proper use of nameWorker
8.	To ChangeWorker, add a public static method called startWorker that
a.	Has two parameters
i.	A String called name
ii.	An integer called number
b.	Creates a Worker object
i.	Uses the name and number to set the name and number of the Worker
c.	Returns the Worker object
9.	In main method, demonstrate the proper use of startWorker

*/