/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package detailsstudent;

/**
 *
 * @author Sivagama
 */
public class DetailsStudent {

    /** print 3 student details - name, sid using array of object
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
       //user interaction i/o and o/p - view class 
        //defined 3 students - obj of the student
        Student s1 = new Student(); // s1 object
        s1.setName("peter");
        s1.setId(112);
        Student s2 = new Student(); 
        s2.setName("john");
        s2.setId(113);
        Student s3 = new Student(); 
        s3.setName("kaur");
        s3.setId(114);
        Student[] list = new Student[3]; // array of object
       //int[] a = new int[3];
       list[0]= s1; //stored the objects in array
       list[1]=s2;
       list[2]=s3;
       //print data  - heterogenous data 
       for(int i=0;i<list.length;i++)
       {
       System.out.println(list[i].getName()+ " "+list[i].getId());
    }
    }
}
