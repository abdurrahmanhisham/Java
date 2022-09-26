public class test {
    public static void main(String[]args){
        person myObj=new person();
        myObj.setInfo("Hisham",123);
        System.out.println("Name: "+myObj.getName());
        System.out.println("Name: "+myObj.getId());
    }
}

////////////////////////////////////////////////////////////////////////////

class person{
    private String name;
    int id;
    public void setInfo(String n,int i){
        name=n;
        id=i;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
}
