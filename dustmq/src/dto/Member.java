package dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Member {

	public static final int COMMON = 0;
	public static final int GOLD = 1;
	public static final int DIAMOND = 2;
	
	private String name;
	private String number;
	private int amount;
	private int grade;
}
