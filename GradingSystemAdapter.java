class gradingSystemAdapter implements schoolManagementApp{

    private gradingSystem gradingSystem;

    public gradingSystemAdapter(gradingSystem gradingSystem){
    this.gradingSystem = gradingSystem;
    }
    public String integrateSystem(){
        return gradingSystem.recordGrades();
    }
}