package pkg2.run;
import pkg2.service.ByteService;;

public class ByteRun {
	public static void main(String[] args) {
		
		ByteService service = new ByteService();
//		service.fileByteOutput();
//		service.bufferedFileByteOutput();
//		service.FileByteInput1();
//		service.fileByteInput2();
		service.bufferedFileByteInput();
	}
}
