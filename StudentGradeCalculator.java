import java.util.*;
public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of subjects: ");
        int numSub=sc.nextInt();
        sc.nextLine();
        String[] subjects=new String[numSub];
        float marks[]=new float[numSub];
        float totalMarks=0;
        for(int i=0;i<numSub;i++){
            System.out.println("Enter name of subject "+(i+1)+":");
            subjects[i]=sc.nextLine();
            System.out.println("Enter marks for "+subjects[i] +" :");
            marks[i]=sc.nextFloat();
            sc.nextLine();
            totalMarks+=marks[i];
        }
        float avgMarks=totalMarks/numSub;
        char grade=calGrade(avgMarks);
        System.out.println("Results: ");
        System.out.println("Total Marks: "+totalMarks);
        System.out.println("Average Percentage: "+avgMarks+"%");
        System.out.println("Grade: "+grade);
        sc.close();
    }
    public static char calGrade(float percentage){
        if(percentage>90){
            return 'A';
        }
        else if(percentage>80){
            return 'B';
        }
        else if(percentage>70){
            return 'C';
        }
        else if(percentage>60){
            return 'D';
        }
        else if(percentage>50){
            return 'E';
        }
        else{
            return 'F';
        }
    }
}
