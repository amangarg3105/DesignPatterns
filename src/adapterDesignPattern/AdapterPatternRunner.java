package adapterDesignPattern;




/*
 * Adapter design pattern is one of the structural design pattern and its used so that two unrelated interfaces can work together.
 *  The object that joins these unrelated interface is called an Adapter.
 *  
 *  Ever tried to use a your camera memory card in your laptop. You cannot use it directly simply because there is no port in 
 *  laptop which accept it. You must use a compatible card reader. You put your memory card into card reader and then inject card 
 *  reader into laptop. This card reader can be called adapter.
 */
public class AdapterPatternRunner {

	public static void main(String[] args) {
		  AudioPlayer audioPlayer = new AudioPlayer();

	      audioPlayer.play("mp3", "beyond the horizon.mp3");
	      audioPlayer.play("mp4", "alone.mp4");
	      audioPlayer.play("vlc", "far far away.vlc");
	      audioPlayer.play("avi", "mind me.avi");

	}

}
