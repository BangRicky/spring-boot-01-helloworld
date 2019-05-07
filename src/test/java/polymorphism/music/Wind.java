package polymorphism.music;

/**
 * @author jinbang
 * @create 2019-05-05 14:56
 */
public class Wind extends Instrument {

    @Override
    public void play(Note n){
        System.out.println("Wind.play()"+n);
    }
}
