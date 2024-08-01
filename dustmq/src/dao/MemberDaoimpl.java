package dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import dto.Member;

public class MemberDaoimpl implements MemberDao{
	
	private final String FILE_PATH = "/io_test/membership1.dat";
	
	private List<Member> memberList = null;
	
	private ObjectInputStream ois = null;
	private ObjectOutputStream oos = null;
	
	public MemberDaoimpl() throws FileNotFoundException, 
	IOException, ClassNotFoundException{

		ois = new ObjectInputStream(new FileInputStream(FILE_PATH));
	
	
	
	
	
	
	
	}

}
