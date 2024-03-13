class student {
    int rollno;
    String name;
    int mark;
    
}
public class day6{
    public static void main(String[] args){
        student s1 = new student();
        s1.rollno = 1;
        s1.name = "Midhun";
        s1.mark= 98;

        student s2 = new student();
        s2.rollno = 1;
        s2.name = "Midhun 1";
        s2.mark= 98;

        student s3 = new student();
        s3.rollno = 1;
        s3.name = "Midhun 3";
        s3.mark= 98;

        student students[] = new student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

       for(student stud : students){
        System.out.println(stud.name+ " : "+stud.mark);
       }
    }
}