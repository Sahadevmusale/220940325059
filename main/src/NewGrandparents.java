class GrandParents {
    String GrandFatherName;
    String GrandMotherName;

     GrandParents(String grandFatherName,
    String grandMotherName){
        GrandFatherName=grandFatherName;
        GrandMotherName=grandMotherName;
        System.out.println("GrandFatherName:"+grandFatherName);
        System.out.println("GrandMotherName:"+grandMotherName);

    }
}
class NewGrandParents{
    public static void main(String args[])
    {
        GrandParents gp=new GrandParents("Digambar","Dwarkabai");


    }
}
