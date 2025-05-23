interface Playable {
    void play();
}
class Guitar implements Playable {
    public void play() { System.out.println("Strum strum 🎸"); }
}
class Piano implements Playable {
    public void play() { System.out.println("Tinkle tinkle 🎹"); }
}
public class MusicTest {
    public static void main(String[] args) {
        new Guitar().play();
        new Piano().play();
    }
}