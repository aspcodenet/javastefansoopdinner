public abstract class GameObject {
    private String name;

    public GameObject(String name){
        this.name = name;
    }

    public abstract  void act();
    
    public void mightLevelUp(){
        
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
 
    
}
