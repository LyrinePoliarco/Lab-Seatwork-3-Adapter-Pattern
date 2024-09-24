class attendanceSystemAdapter implements schoolManagementApp{

    private attendanceSystem attendanceSystem;
   public attendanceSystemAdapter(attendanceSystem attendanceSystem){
    this.attendanceSystem = attendanceSystem;
   }
   public String integrateSystem(){
    return attendanceSystem.markAttendance();
   }
}