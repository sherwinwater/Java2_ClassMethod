package content;


public class ChangeWorker {

    public static String printWorker(Worker one){
        String members = new String();
        members = one.name +" "+one.number;
        return members;
        
        //return one.name +" "+one.number;
    }
    
    public static void nameWorker(Worker a, String name){
        a.name = name;
    }
    
    public static Worker startWorker(String name,int number){
        Worker one = new Worker();
        one.name = name;
        one.number = number;
        return one;
    }
    
    public static Worker check(){
        Worker one = new Worker();
        one.name = "onefred";
        return one;
    }
    
    public static void check(Worker b){
        b.name = "check's name";
    }
}
