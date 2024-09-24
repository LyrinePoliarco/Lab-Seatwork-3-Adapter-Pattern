public class Main {
    public static void main(String[] args)
    {
     attendanceSystem attendanceSystem = new attendanceSystem();
     gradingSystem gradingSystem = new gradingSystem();
     librarySystem librarySystem = new librarySystem();

    schoolManagementApp gradingAdapter = new gradingSystemAdapter(gradingSystem);
    schoolManagementApp attendanceAdapter = new attendanceSystemAdapter(attendanceSystem);
    schoolManagementApp libraryAdapter = new librarySystemAdapter(librarySystem);


    System.out.println(gradingAdapter.integrateSystem());
    System.out.println(attendanceAdapter.integrateSystem());
    System.out.println(libraryAdapter.integrateSystem());
    }
    
}