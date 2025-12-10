//Create an interface Playable with a method play(). Implement it in a class Guitar.
interface Playable{
    void play();
}
class Guitar implements Playable{
    public void play(){
        System.out.println("The guitar is being played.");
    }
}
class Main{
    public static void main(String[] args){
        Guitar g = new Guitar();
        g.play();
    }
}