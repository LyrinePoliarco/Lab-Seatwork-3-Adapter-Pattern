class librarySystemAdapter implements schoolManagementApp{
    private librarySystem librarySystem;

    public librarySystemAdapter(librarySystem librarySystem){
        this.librarySystem = librarySystem; 
    }
    public String integrateSystem(){
        return librarySystem.manageBooks();
    }
}