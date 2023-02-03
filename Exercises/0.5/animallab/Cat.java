public class Cat extends Animal{
private String color;
private boolean claws;

public Cat(){
}
public Cat(String color, boolean clawsout){
    this.color = color;
    this.claws = clawsout;
}
public void setColor(String color){
    this.color = color;
}
public void setClawsOut(boolean clawsOut){
    this.claws = clawsOut;
}
public String getColor(){
    return this.color;
}
public boolean getClaws(){
    return this.claws;
}

public void makeSound(boolean twice){
    if(twice == false){
        System.out.println("Meow!");
    }else{
        System.out.println("Meow, Meow!");
    }
}
public boolean hasClaws(){
    return this.claws;
}
public boolean isBlack(){
    if(color.equalsIgnoreCase("black")){
        return true;
    }else{
        return false;
    }
}
}