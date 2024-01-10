class object {
    String name;
    int rollno;
    int marks;
}

public class Arrayobject {
    public static void main(String[] args) {
        object ob = new object();
        ob.name = "dev";
        ob.rollno = 1;
        ob.marks = 22;

        object ob1 = new object();
        ob1.name = "shiva";
        ob1.rollno = 2;
        ob1.marks = 25;
        object ob2 = new object();
        ob2.name = "pavan";
        ob2.rollno = 4;
        ob2.marks = 24;
        object objects[] = new object[2];
        objects[0] = ob;
        objects[1] = ob1;
        // for (int i = 0; i < objects.length; i++)
        for (object n : objects) {
            System.out.println(n.name + " " + ":" + n.marks);
        }
        // System.out.println(objects[i].name + " " + ":" + objects[i].marks);
    }
}
