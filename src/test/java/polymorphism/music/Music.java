package polymorphism.music;

/**
 * @author jinbang
 * @create 2019-05-05 15:36
 */
public class Music {
    public static void tune(Instrument i){
        i.play(Note.MIDDLE_C);
    }
    public static void main(String[] args){
        Wind flute = new Wind();
        tune(flute);//upcasting向上转型
        //输出：Wind.play()MIDDLE_C
    }
}
