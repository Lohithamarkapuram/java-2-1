class Name{
    private String name;
    String getName(){
        return name;
    }
    void setName(String name){
        this.name=name;
    }
    public static void main(String[] args){
        Name obj = new Name();
        obj.setName("Lohitha");
        System.out.println(obj.getName());
    }
}
