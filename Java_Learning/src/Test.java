final class ParentClass 
{
    void showData() 
    {
        System.out.println("This is a method of final Parent class");
    }
}

public class Test{
    public static void main(String[] args) {
        ParentClass obj = new ParentClass();
        obj.showData();
    }
}